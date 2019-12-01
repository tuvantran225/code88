package code88.service;

import code88.dao.EmployeeDao;
import code88.dto.EmployeeDto;
import code88.model.*;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public ResponseEntity getAllEmployees() {
        try {
            List<EmployeeDto> employees = employeeDao.getAllEmployees();
            List<Employee> data = employees.stream().map(e -> toModel(e)).collect(Collectors.toList());
            return new ResponseEntity(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private Employee toModel(EmployeeDto dto) {
        Employee model = new Employee();
        model.setId(dto.getId());
        model.setEnglishName(dto.getEnglishName());
        model.setVietnameseName(dto.getVietnameseName());
        model.setDepartment(new Department(dto.getDepartmentId(), dto.getDepartmentName()));
        model.setGender(EnumUtils.getEnum(Gender.class, dto.getGender()));
        model.setBirthday(dto.getBirthday());
        model.setCountry(new Country(dto.getCountryId(), dto.getCountryName()));
        model.setPhoneNumber(dto.getPhoneNumber());
        model.setEmail(dto.getEmail());
        model.setStatus(EnumUtils.getEnum(Status.class, dto.getStatus()));
        model.setManager(dto.isManager());
        return model;
    }
}
