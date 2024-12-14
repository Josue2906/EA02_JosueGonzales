package com.example.EA02_JosueGonzales.controller;

import com.example.EA02_JosueGonzales.model.Trabajador;
import com.example.EA02_JosueGonzales.service.TrabajadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/trabajadores") // Define la ruta base para las solicitudes de los trabajadores
public class TrabajadorController {
    private final TrabajadorService service;

    // Constructor que recibe el servicio de Trabajador
    public TrabajadorController(TrabajadorService service) {
        this.service = service;
    }
    
    // Método para listar todos los trabajadores
    @GetMapping
    public String listarTrabajadores(Model model) {
        model.addAttribute("trabajadores", service.listarTodos()); // Obtiene la lista de trabajadores del servicio
        return "trabajadores"; // Retorna la vista que muestra la lista de trabajadores
    }

    // Método para mostrar el formulario de creación de un nuevo trabajador
    @GetMapping("/nuevo")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("trabajador", new Trabajador()); // Pasa un nuevo objeto trabajador al modelo
        return "formularioTrabajador"; // Vista del formulario para crear un nuevo trabajador
    }

    // Método para guardar un trabajador
    @PostMapping
    public String guardarTrabajador(@ModelAttribute Trabajador trabajador) {
        service.guardar(trabajador); // Guarda el trabajador en la base de datos
        return "redirect:/trabajadores"; // Redirige a la lista de trabajadores después de guardar
    }

    // Método para mostrar el formulario de edición de un trabajador existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Integer id, Model model) {
        // Busca el trabajador por ID y lo pasa al modelo
        model.addAttribute("trabajador", service.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id)));
        return "formularioTrabajador"; // Vista del formulario para editar el trabajador
    }

    // Método para eliminar un trabajador
    @GetMapping("/eliminar/{id}")
    public String eliminarTrabajador(@PathVariable Integer id) {
        service.eliminar(id); // Elimina el trabajador con el ID especificado
        return "redirect:/trabajadores"; // Redirige a la lista de trabajadores después de eliminar
    }
}
