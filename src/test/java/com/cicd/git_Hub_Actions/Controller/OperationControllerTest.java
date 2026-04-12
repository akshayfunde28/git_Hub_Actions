package com.cicd.git_Hub_Actions.Controller;

import com.cicd.git_Hub_Actions.Services.OperationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OperationController.class)
public class OperationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean   // ✅ FIXED
    private OperationService operationService;

    @Test
    public void testAddOperation() throws Exception {

        String json = "{\"a\":10,\"b\":5,\"opName\":\"add\"}";

        mockMvc.perform(post("/operate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.opResult").value(15));
    }

    @Test
    public void testSubOperation() throws Exception {

        String json = "{\"a\":10,\"b\":5,\"opName\":\"sub\"}";

        mockMvc.perform(post("/operate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.opResult").value(5));
    }
}