package com.cesello.memento;

public class EmployeeJ {

    private String name;

    private String address;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public EmployeeMementoJ save() {
        return new EmployeeMementoJ(name, phone);
    }

    public void revert(EmployeeMementoJ employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }

}
