package com.devayush.ToolManagementSystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class DummyOrderModel {
    private Long orderId;
    private Long workerId;
    private List<DummyToolModel> requiredTools;
    private String customerName;
    private String orderStatus;
}
