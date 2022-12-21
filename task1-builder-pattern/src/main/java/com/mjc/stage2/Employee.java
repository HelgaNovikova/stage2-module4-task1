package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        // Write your code here!
        private Employee newEmployee;

        public EmployeeBuilder(){
            newEmployee = new Employee();
        }

        public EmployeeBuilder setName(String name){
            newEmployee.setName(name);
            return this;
        }

        public EmployeeBuilder setLastName(String lastName){
            newEmployee.setLastName(lastName);
            return this;
        }

        public EmployeeBuilder setPosition(String position){
            newEmployee.setPosition(position);
            return this;
        }

        public EmployeeBuilder setPhone(String phone){
            newEmployee.setPhone(phone);
            return this;
        }

        public EmployeeBuilder setEmail(String email){
            newEmployee.setEmail(email);
            return this;
        }

        public EmployeeBuilder setCarNumber(String carNumber){
            newEmployee.setCarNumber(carNumber);
            return this;
        }

        public Employee build(){
            return newEmployee;
        }
    }

//    public static void main(String[] args) {
//        Employee emp = new EmployeeBuilder().setName("KAte").build();
//    }
}
