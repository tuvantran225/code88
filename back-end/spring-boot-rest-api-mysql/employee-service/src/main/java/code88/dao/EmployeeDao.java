package code88.dao;

import code88.dto.EmployeeDto;
import code88.dto.EmployeeMapper;
import code88.request.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${GET_ALL_EMPLOYEES}")
    private String GET_ALL_EMPLOYEES;

    @Value("${SAVE_EMPLOYEE}")
    private String SAVE_EMPLOYEE;

    public List<EmployeeDto> getAllEmployees() {
        return jdbcTemplate.query(GET_ALL_EMPLOYEES, new EmployeeMapper());
    }

    public void saveEmployee(EmployeeRequest employee) {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
        HashMap<String, Object> params = new HashMap<>();
        params.put("englishName", employee.getEnglishName());
        params.put("vietnameseName", employee.getVietnameseName());
        params.put("departmentId", employee.getDepartmentId());
        params.put("gender", employee.getGender());
        params.put("birthday", employee.getBirthday());
        params.put("countryId", employee.getCountryId());
        params.put("phoneNumber", employee.getPhoneNumber());
        params.put("email", employee.getEmail());
        params.put("status", employee.getStatus());
        params.put("isManager", employee.getManager());
        jdbcTemplate.update(SAVE_EMPLOYEE, params);
    }

}
