package com.hospital.management_system.controller;


import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {
    @Autowired
    private PacienteService service;
    @GetMapping("/{id}")
    public ResponseEntity<PacienteDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<PacienteDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<PacienteDto> create(@RequestBody PacienteDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<PacienteDto> put(@PathVariable Long id, @RequestBody PacienteDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
