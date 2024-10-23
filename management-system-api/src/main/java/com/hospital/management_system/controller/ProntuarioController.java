package com.hospital.management_system.controller;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.service.PacienteService;
import com.hospital.management_system.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/prontuario")
public class ProntuarioController {
    @Autowired
    private ProntuarioService service;

    @GetMapping("/{id}")
    public ResponseEntity<ProntuarioDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<ProntuarioDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<ProntuarioDto> create(@RequestBody ProntuarioDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProntuarioDto> put(@PathVariable Long id, @RequestBody ProntuarioDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
