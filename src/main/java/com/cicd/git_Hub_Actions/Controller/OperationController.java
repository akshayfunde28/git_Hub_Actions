package com.cicd.git_Hub_Actions.Controller;

import com.cicd.git_Hub_Actions.Entities.Operations;
import com.cicd.git_Hub_Actions.Services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {


    @PostMapping("/operate")
    public ResponseEntity<Operations> operate(@RequestBody Operations operation) {
        int first = operation.getA();
        int second = operation.getB();
        String oper = operation.getOpName();

        if (oper.equals("add")) {
            operation.setOpResult(first + second);
        }
        else if (oper.equals("sub")) {
            operation.setOpResult(first - second);
        }
        else if (oper.equals("mul")) {
            operation.setOpResult(first * second);
        }
        else {
            return ResponseEntity.badRequest().body(null);
        }  
        else if (oper.equals("div")) {
            operation.setOpResult(first / second);
        }
        return ResponseEntity.ok(operation);
    }
}
