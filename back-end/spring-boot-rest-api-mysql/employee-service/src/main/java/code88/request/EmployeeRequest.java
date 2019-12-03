package code88.request;

import java.util.Date;

public class EmployeeRequest {

    private String englishName;
    private String vietnameseName;
    private Byte departmentId;
    private String gender;
    private Date birthday;
    private Byte countryId;
    private String phoneNumber;
    private String email;
    private String status;
    private Boolean manager;

    public EmployeeRequest(String englishName, String vietnameseName, Byte departmentId, String gender, Date birthday,
                           Byte countryId, String phoneNumber, String email, String status, Boolean manager) {
        this.englishName = englishName;
        this.vietnameseName = vietnameseName;
        this.departmentId = departmentId;
        this.gender = gender;
        this.birthday = birthday;
        this.countryId = countryId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
        this.manager = manager;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getVietnameseName() {
        return vietnameseName;
    }

    public Byte getDepartmentId() {
        return departmentId;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Byte getCountryId() {
        return countryId;
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

    public Boolean getManager() {
        return manager;
    }
}
