package com.banana.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "surname")
    private String apellido;

    private int curso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school")
    private School escuela;

    @ManyToMany(/*mappedBy = "estudiantes"*/ fetch = FetchType.EAGER)
     @JoinTable(
            name = "proyectos_estudiantes",
            joinColumns = {@JoinColumn(name = "estudiante_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    private Set<Project> proyectos;

    public Student(Long id, String nombre, String apellido, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public boolean isValid() {
        return this.nombre != null && this.apellido != null && this.curso > 0;
    }
}
