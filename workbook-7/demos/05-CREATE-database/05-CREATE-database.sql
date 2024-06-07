/*
    DDL - Data Definition Language
    CREATE (databases, tables, views, stored procedure)
    ALTER (change the structure of an object)
    DROP - drop an object (tables or database)
*/

DROP DATABASE IF EXISTS city_fitness;

CREATE DATABASE city_fitness;

USE city_fitness;

-- create tables
CREATE TABLE classes
(
    class_id INT NOT NULL AUTO_INCREMENT,
    class_name VARCHAR(30) NOT NULL,
    instructor_id INT NOT NULL,
    days VARCHAR(10) NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    month_price DECIMAL(5,2),
    PRIMARY KEY (class_id)
);

CREATE TABLE customers
(
    customer_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    PRIMARY KEY (customer_id)
);

CREATE TABLE customer_classes
(
    customer_id INT NOT NULL,
    class_id INT NOT NULL,
    PRIMARY KEY(
        customer_id,
        class_id
    )
);

CREATE TABLE instructors
(
    instructor_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    PRIMARY KEY (instructor_id)
);


-- insert records
-- populate the instructors table
INSERT INTO instructors(instructor_id, first_name, last_name)
VALUES (201, 'Vivian','Harper')
    , (202, 'Garielle','Saunders')
    , (203, 'Harrison','Price')
    , (204, 'Isabella','Ferguson')
    , (205, 'Ethan','Thomson');
ALTER TABLE instructors AUTO_INCREMENT 206;

-- populate the classes table
INSERT INTO classes (class_id, class_name, instructor_id, days, start_time, end_time, month_price)
VALUES (301, 'Functional Fitness', 201, 'T H', '17:00:00', '18:00:00', 20)
    , (302, 'CrossFit - 2', 202, 'M W F', '06:00:00', '07:30:00', 45)
    , (303, 'Muay Thai - Advanced', 203, 'M W F', '18:30:00', '19:30:00', 30)
    , (304, 'Step Aerobics', 204, 'M W F', '08:00:00', '09:00:00', 30)
    , (305, 'Spin/Cycling', 202, 'M W', '12:00:00', '12:45:00', 15)
    , (306, 'Muay Thai - Beginner', 203, 'T H', '18:30:00', '19:30:00', 20)
    , (307, 'HIIT', 204, 'T H', '08:00:00', '09:00:00', 20)
    , (308, 'CrossFIt - 1', 205, 'T H', '20:00:00', '21:00:00', 20)
;
ALTER TABLE classes AUTO_INCREMENT 309;

-- populate the customers table
INSERT INTO customers (customer_id, first_name, last_name)
VALUES (101, 'Benjamin','Wilson')
    , (102, 'Sophia','Torres')
    , (103, 'Lucas','Armstrong')
    , (104, 'Natalie','Gibson')
    , (105, 'Carter','Reynolds')
    , (106, 'Amelia','Davis')
    , (107, 'Iris','Peterson')
;
ALTER TABLE customers AUTO_INCREMENT 108;

-- populate the customer_classes table
INSERT INTO customer_classes(customer_id, class_id)
VALUES (101, 301)
    , (102, 302)
    , (103, 303)
    , (104, 304)
    , (105, 305)
    , (102, 306)
    , (105, 303)
    , (103, 307)
    , (101, 302)
    , (106, 308)
    , (107, 304)
;



-- create foreign keys
ALTER TABLE classes -- child table
ADD CONSTRAINT fk_instructor_classes
FOREIGN KEY (instructor_id) REFERENCES instructors(instructor_id);

ALTER TABLE customer_classes
ADD CONSTRAINT fk_classes_customer_classes
FOREIGN KEY (class_id) REFERENCES classes (class_id);

ALTER TABLE customer_classes
ADD CONSTRAINT fk_customers_customer_classes
FOREIGN KEY (customer_id) REFERENCES customers(customer_id);
