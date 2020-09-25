package com.example.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("TD")
@Data
public class TowDto {
    @Value("${name:unknown}")
    private String name;
}
