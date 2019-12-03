DELIMITER //
DROP PROCEDURE IF EXISTS SaveEmployee//
CREATE PROCEDURE SaveEmployee(pEnglishName VARCHAR(20), pVietnameseName VARCHAR(20), pDepartmentId TINYINT,
    pGender ENUM('MALE', 'FEMALE'), pBirthday DATE, pCountryId TINYINT, pPhoneNumber VARCHAR(11), pEmail VARCHAR(30),
    pStatus ENUM('ACTIVE', 'INACTIVE'), pIsManager BOOLEAN)
BEGIN
    INSERT INTO employee(english_name, vietnamese_name, department_id, gender, birth_date, country_id, phone_number, email, status, is_manager) VALUES (
    pEnglishName, pVietnameseName, pDepartmentId, pGender, pBirthday, pCountryId, pPhoneNumber, pEmail, pStatus, pIsManager);
END//