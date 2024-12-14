package com.example.EA02_JosueGonzales.repository;

import com.example.EA02_JosueGonzales.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interfaz es un repositorio de Spring Data JPA
public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {
}
