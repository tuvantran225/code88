DELIMITER //
DROP PROCEDURE IF EXISTS GetAllEmployees//
CREATE PROCEDURE GetAllEmployees()
BEGIN
    SELECT e.id, e.english_name, e.vietnamese_name, e.department_id, d.name AS department_name, e.gender, e.birth_date, e.country_id, c.name AS country_name,
        e.phone_number, e.email, e.status, e.is_manager
    FROM employee e
        LEFT JOIN department d ON e.department_id = d.id
        LEFT JOIN country c ON e.country_id = c.id;
END//