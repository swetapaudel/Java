CREATE TABLE students( 
    first_name VARCHAR(50) NOT NULL, 
    last_name VARCHAR(50) NOT NULL, 
    student_ID NUMBER(4) 
    );

ALTER TABLE students add  u_name VARCHAR(50);

INSERT INTO students(first_name, last_name, student_ID, u_name) VALUES ('John', 'Doe', '1111', 'MssState');

INSERT INTO students(first_name, last_name, student_ID, u_name) VALUES ('Jane', 'Doll', '1112', 'MssState');

INSERT INTO students(first_name, last_name, student_ID, u_name) VALUES ('Sam', 'Hill', '1112', 'MssState');

ALTER TABLE students modify (student_ID Number(10));

ALTER TABLE students rename column first_Name  to  f_name;

ALTER TABLE students DROP COLUMN u_name;

RENAME students TO students_msstate


DROP TABLE students_msstate


