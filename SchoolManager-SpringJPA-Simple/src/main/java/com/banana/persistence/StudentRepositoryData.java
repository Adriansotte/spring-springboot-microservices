package com.banana.persistence;

import com.banana.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepositoryData extends JpaRepository<Student, Long> {
    public List<Student> findByNombre(String nombre);
    public List<Student> findByNombreAndApellidoIgnoreCase(String nombre,String apellido);
//    public List<Student> findBySchool_Id(Long id);

    @Query("SELECT s FROM Student s WHERE s.nombre LIKE %:name%")
    public List<Student> findByNombreWith(@Param("name") String trozonombre);
}
