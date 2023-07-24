package com.cesello.memento;

import java.util.Deque;
import java.util.LinkedList;

public class CaretakerJ {

    private Deque<EmployeeMementoJ> employeeHistory = new LinkedList<>();

    public void save(EmployeeJ employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(EmployeeJ employee) {
        employee.revert(employeeHistory.pop());
    }
}
