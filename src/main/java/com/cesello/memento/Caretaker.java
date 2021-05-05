package com.cesello.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Caretaker {

    private Deque<EmployeeMemento> employeeHistory = new LinkedList<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
