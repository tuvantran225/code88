DELIMITER //
DROP PROCEDURE IF EXISTS GetEmployeeById//
CREATE PROCEDURE GetEmployeeById(pId INT(11))
BEGIN
    SELECT * FROM employees WHERE id = pId;
END//