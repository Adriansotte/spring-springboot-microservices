package com.banana.persistence;

import com.banana.config.SpringConfig;
import com.banana.models.School;
import com.banana.models.Student;
import com.banana.persistence.extended.StudentRepositoryExtended;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@EnableAutoConfiguration
class StudentsRepositoryExtendedTest {
    @Autowired
    private StudentRepositoryExtended repoStudents;

    @Test
    public void load() {
        assertNotNull(repoStudents);
    }

    @Test
    void getById() throws SQLException {
        Optional<Student> op = repoStudents.findById(1L);
        Student aStudent = op.get();
        System.out.println(aStudent);
        assertEquals(aStudent.getId(), 1L);
        assertNotNull(aStudent);
    }

    @Test
    void save() throws SQLException {
        Student newStd = new Student(null, "Matias", "Mattel", 2);
        System.out.println(newStd);
        repoStudents.save(newStd);
        Student aStudent = repoStudents.findById(newStd.getId()).orElseThrow(() -> new SQLException("No existe std!"));
        assertEquals(aStudent.getId(), newStd.getId());
    }

    @Test
    void get() throws SQLException {
        Student aStudent = repoStudents.get(2);
        System.out.println(aStudent);
        assertEquals(aStudent.getId(), 3L);
        assertNotNull(aStudent);
    }
}