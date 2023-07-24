package com.cesello.memento

data class Employee(var name: String, var phone: String) {
    fun save(): EmployeeMemento = EmployeeMemento(name, phone)

    fun revert(employeeMemento: EmployeeMemento) {
        this.name = employeeMemento.name
        this.phone = employeeMemento.phone
    }
}
