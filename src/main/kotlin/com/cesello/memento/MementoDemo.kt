package com.cesello.memento
 fun main() {
     val caretaker = Caretaker()

     val employee = Employee("John Wick", "888-555-1212")

     println("Employee before save:                     $employee")

     caretaker.save(employee)

     employee.phone = "444-555-6666"

     caretaker.save(employee)

     println("Employee after changed phone number save: $employee")

     employee.phone = "333-999-6666"

     caretaker.revert(employee)

     println("Reverts to last save point:               $employee")

     caretaker.revert(employee)

     println("Reverted back to original:                $employee")


 }