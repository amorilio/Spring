package com.ilia;

public class InjectBean {
	
    private String name;
    private int age;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\n" + "Age: %d\n" + "Address: %s\n", 
                this.name, this.age, this.address);
    }
}
