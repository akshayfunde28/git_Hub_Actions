package com.cicd.git_Hub_Actions.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Operations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    private Integer opID ;
    private String opName;
    private int a ;
    private int b ;
    private Integer opResult ;
}
