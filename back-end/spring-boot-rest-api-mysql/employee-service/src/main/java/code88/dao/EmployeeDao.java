package code88.dao;

import code88.dto.EmployeeDto;
import code88.dto.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${GET_ALL_EMPLOYEES}")
    private String GET_ALL_EMPLOYEES;

    public List<EmployeeDto> getAllEmployees() {
        return jdbcTemplate.query(GET_ALL_EMPLOYEES, new EmployeeMapper());
    }

}
