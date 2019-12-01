DROP DATABASE IF EXISTS code88;
CREATE DATABASE code88;

USE code88;

DROP TABLE IF EXISTS department;
CREATE TABLE department(
    id TINYINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS country;
CREATE TABLE country(
    id TINYINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
    id TINYINT NOT NULL AUTO_INCREMENT,
    english_name VARCHAR(20) NOT NULL,
    vietnamese_name VARCHAR(20) NOT NULL,
    department_id TINYINT NOT NULL,
    gender ENUM('MALE', 'FEMALE') NOT NULL,
    birth_date DATE,
    country_id TINYINT,
    phone_number VARCHAR(11),
    email VARCHAR(30),
    status ENUM('ACTIVE', 'INACTIVE'),
    is_manager BOOLEAN,
    PRIMARY KEY(id)
);

INSERT INTO country(name) VALUES ('An Giang');
INSERT INTO country(name) VALUES ('Hồ Chí Minh');
INSERT INTO country(name) VALUES ('Vũng Tàu');

INSERT INTO department(name) VALUES ('Developer');
INSERT INTO department(name) VALUES ('Infra');
INSERT INTO department(name) VALUES ('Quality Assurance');
INSERT INTO department(name) VALUES ('Solution Architech');
INSERT INTO department(name) VALUES ('Human Resource');

INSERT INTO employee(english_name, vietnamese_name, department_id, gender, birth_date, country_id, phone_number, email, status, is_manager) VALUES (
    'Frank', 'Tú', 1, 'MALE', '1992-09-12', 1, '0938881951', 'frank.tran@code88.com', 'ACTIVE', false
);
INSERT INTO employee(english_name, vietnamese_name, department_id, gender, birth_date, country_id, phone_number, email, status, is_manager) VALUES (
    'Patrik', 'Thái', 1, 'MALE', NULL, 2, '', 'patrik.nguyen@code88.com', 'ACTIVE', false
);
INSERT INTO employee(english_name, vietnamese_name, department_id, gender, birth_date, country_id, phone_number, email, status, is_manager) VALUES (
    'Jeff', 'KHánh', 1, 'MALE', NULL, 3, '', 'jeff.nguyen@code88.com', 'ACTIVE', false
);