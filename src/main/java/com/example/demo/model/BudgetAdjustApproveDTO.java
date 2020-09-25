package com.example.demo.model;

import lombok.Data;

@Data
public class BudgetAdjustApproveDTO {
    private String businessSystemCode;
    private String budgetCycleCode;
    private String budgetCycleName;
    private String budgetTypeCode;
    private String budgetTypeName;
}
