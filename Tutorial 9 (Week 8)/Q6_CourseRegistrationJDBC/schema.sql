CREATE DATABASE IF NOT EXISTS college;
USE college;

CREATE TABLE IF NOT EXISTS CourseRegistration (
    StudentID INT,
    StudentName VARCHAR(100) NOT NULL,
    CourseCode VARCHAR(20) NOT NULL,
    CourseName VARCHAR(100) NOT NULL,
    Semester INT NOT NULL
);
