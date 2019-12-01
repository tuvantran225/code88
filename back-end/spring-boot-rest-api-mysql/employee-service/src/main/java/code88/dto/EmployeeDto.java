package code88.dto;

import java.util.Date;

public class EmployeeDto {

    private byte id;
    private String englishName;
    private String vietnameseName;
    private byte departmentId;
    private String departmentName;
    private String gender;
    private Date birthday;
    private byte countryId;
    private String countryName;
    private String phoneNumber;
    private String email;
    private String status;
    private boolean manager;

    public EmployeeDto(byte id, String englishName, String vietnameseName, byte departmentId, String departmentName,
                       String gender, Date birthday, byte countryId, String countryName, String phoneNumber, String email,
                       String status, boolean manager) {
        this.id = id;
        this.englishName = englishName;
        this.vietnameseName = vietnameseName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.gender = gender;
        this.birthday = birthday;
        this.countryId = countryId;
        this.countryName = countryName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
        this.manager = manager;
    }

    public byte getId() {
        return id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getVietnameseName() {
        return vietnameseName;
    }

    public byte getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public byte getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public boolean isManager() {
        return manager;
    }
}
