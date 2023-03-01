package com.employee.entity;


import javax.persistence.*;

@Entity(name = "TB_Employee")
public class Employee {


    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private Double salary;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }





}
