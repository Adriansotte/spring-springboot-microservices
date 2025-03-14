package com.myshoppingcart.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    @Column(name = "usuario")
    private int usuario;

    @Column(name = "producto")
    private int producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "fecha")
    private LocalDate fecha;
}
