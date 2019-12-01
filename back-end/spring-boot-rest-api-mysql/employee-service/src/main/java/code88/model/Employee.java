package code88.model;

import java.util.Date;

public class Employee {

    private byte id;
    private String englishName;
    private String vietnameseName;
    private Department department;
    private Gender gender;
    private Date birthday;
    private Country country;
    private String phoneNumber;
    private String email;
    private Status status;
    private boolean manager;

    public Employee() {
    }

    public Employee(byte id, String englishName, String vietnameseName, Department department, Gender gender,
                    Date birthday, Country country, String phoneNumber, String email, Status status, boolean manager) {
        this.id = id;
        this.englishName = englishName;
        this.vietnameseName = vietnameseName;
        this.department = department;
        this.gender = gender;
        this.birthday = birthday;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
        this.manager = manager;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getVietnameseName() {
        return vietnameseName;
    }

    public void setVietnameseName(String vietnameseName) {
        this.vietnameseName = vietnameseName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", englishName='" + englishName + '\'' +
                ", vietnameseName='" + vietnameseName + '\'' +
                ", department=" + department +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", country=" + country +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", manager=" + manager +
                '}';
    }
}
