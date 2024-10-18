package com.hospital.management_system.controller;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.model.Paciente;
import com.hospital.management_system.repository.PacienteRepository;
import com.hospital.management_system.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<?> findById(@RequestParam("id") final Long id){
        final Paciente paciente = this.repository.findById(id).orElse(null);
        return paciente == null ? ResponseEntity.badRequest().body("Nenhum condutor encontrado") : ResponseEntity.ok(paciente);
    }
    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }

}
