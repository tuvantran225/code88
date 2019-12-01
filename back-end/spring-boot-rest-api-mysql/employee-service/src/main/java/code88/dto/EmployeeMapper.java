package code88.dto;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeDto> {
    @Override
    public EmployeeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new EmployeeDto(rs.getByte("id"),
                rs.getString("english_name"),
                rs.getString("vietnamese_name"),
                rs.getByte("department_id"),
                rs.getString("department_name"),
                rs.getString("gender"),
                rs.getDate("birth_date"),
                rs.getByte("country_id"),
                rs.getString("country_name"),
                rs.getString("phone_number"),
                rs.getString("email"),
                rs.getString("status"),
                rs.getBoolean("is_manager"));
    }
}
