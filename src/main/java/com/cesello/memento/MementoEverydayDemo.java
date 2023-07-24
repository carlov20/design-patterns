package com.cesello.memento;

import java.io.*;

public class MementoEverydayDemo {

    private static void serialize(EmployeeJ emp) {

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    private static EmployeeJ deserialize() {
        EmployeeJ employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (EmployeeJ) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public static void main(String[] args) {

        EmployeeJ emp = new EmployeeJ();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        EmployeeJ newEmp = deserialize();

        System.out.println(newEmp.getName());

    }


}
