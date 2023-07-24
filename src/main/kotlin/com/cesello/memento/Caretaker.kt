package com.cesello.memento

import java.util.Deque
import java.util.LinkedList

class Caretaker(private val employeeHistory: Deque<EmployeeMemento> = LinkedList()) {

    fun save(employee: Employee) = employeeHistory.push(employee.save())

    fun revert(employee: Employee) = employee.revert(employeeHistory.pop())
}