package com.banana.persistence.extended;

import com.banana.models.Student;

import java.sql.SQLException;

public interface CustomStudentRepository {
    public Student get(int index)  throws SQLException;
}
