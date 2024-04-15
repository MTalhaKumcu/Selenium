CREATE DATABASE java;

USE java;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    userlastname VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
