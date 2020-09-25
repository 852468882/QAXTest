package com.example.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Lazy
@Component
@Data
public class TestDTO {
    private List<String> strings;
    private String createName;
}

