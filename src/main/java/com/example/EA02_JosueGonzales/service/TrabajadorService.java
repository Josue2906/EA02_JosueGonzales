package com.example.EA02_JosueGonzales.service;

import com.example.EA02_JosueGonzales.model.Trabajador;
import com.example.EA02_JosueGonzales.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Define la clase como un servicio gestionado por Spring
public class TrabajadorService {
    @Autowired
    private TrabajadorRepository repository; // Inyecta el repositorio de trabajadores

    // listar todos los trabajadores:
    public List<Trabajador> listarTodos() {
        return repository.findAll();
    }
    
    // Guardar un trabajador:
    public void guardar(Trabajador trabajador) {
        repository.save(trabajador);
    }

    //Buscar un trabajador por su ID:
    public Optional<Trabajador> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    //Eliminar un trabajador:
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
