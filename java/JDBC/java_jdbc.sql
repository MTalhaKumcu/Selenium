CREATE DATABASE java;

USE java;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    userlastname VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
ALTER TABLE users DROP userage ;

ALTER TABLE users DROP usersalary ;
ALTER TABLE users ADD userphonenumber INT ;

INSERT INTO users (username, userlastname, email, age, salary,userphonenumber) VALUES
('John', 'Doe', 'john.doe@example.com','22', '1231','123456789'),
('Jane', 'Doe', 'jane.doe@example.com','35', '1231','123456789'),
('Alice', 'Smith', 'alice.smith@example.com','33', '12312','123456789'),
('Bob', 'Johnson', 'bob.johnson@example.com','52', '32132','123456789'),
('Emily', 'Brown', 'emily.brown@example.com','60', '5544','123456789'),
('Michael', 'Wilson', 'michael.wilson@example.com','60', '5544','123456789'),
('Sarah', 'Taylor', 'sarah.taylor@example.com','50', '3213','123456789'),
('David', 'Martinez', 'david.martinez@example.com','44', '44221','123456789'),
('Laura', 'Anderson', 'laura.anderson@example.com','42', '12313','123456789'),
('James', 'Thomas', 'james.thomas@example.com','43', '203','123456789');

SELECT * FROM users;
SELECT user_id FROM users WHERE salary BETWEEN 100 and 5000;

UPDATE java.users SET userphonenumber = 122333444 WHERE username LIKE '%H_';
userphonenumber