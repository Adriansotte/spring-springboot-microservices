package com.banana.persistence.extended;

import com.banana.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

public class CustomStudentRepositoryImpl implements CustomStudentRepository{

    @PersistenceContext
    EntityManager em;

    @Override
    public Student get(int idx) {
        TypedQuery query = em.createNamedQuery("Student.getStudents", Student.class);
        query.setFirstResult(idx).setMaxResults(1); //"LIMIT idx, 1"
        List<Student> resultados = query.getResultList();
        System.out.println("resultados:" + resultados);
        return resultados.get(0);
    }
}
