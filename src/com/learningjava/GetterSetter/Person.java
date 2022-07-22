package com.learningjava.GetterSetter;

/**
 *
 * @author mrg1813
 */
public class Person {

    private String name;
    private int age;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + '}';
    }

    public void showPersonInfo() {
        System.out.println("Name of person is: " + name);
        System.out.println("Age of person is: " + age);
        System.out.println("Phone Number of person is: " + phoneNumber);
    }

}
