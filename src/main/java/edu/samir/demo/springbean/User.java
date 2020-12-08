package edu.samir.demo.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;
    private Address address;
    private Job job;

    public User() {}

    @Autowired
    public User(@Qualifier("secondary") Address address, Job job) {
        this.name = "Samir Guemri";
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public User setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Job getJob() {
        return job;
    }

    public User setJob(Job job) {
        this.job = job;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }
}
