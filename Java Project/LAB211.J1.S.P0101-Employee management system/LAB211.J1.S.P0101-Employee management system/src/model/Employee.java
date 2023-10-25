
package model;

import java.io.Serializable;

/*
 * @author HuynhPhan
 */
public class Employee implements Serializable{
    //    Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency
    private String id,firstName,lastName,phone,email,address,birth,sex,agency;
    private double salary;
    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String phone, String email, String address, String birth, String sex, String agency, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birth = birth;
        this.sex = sex;
        this.agency = agency;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(int i) {
        return "Employee: "+i+ "{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", address=" + address + ", birth=" + birth + ", sex=" + sex + ", agency=" + agency + ", salary=" + salary + "}\n";
    }
    
}
