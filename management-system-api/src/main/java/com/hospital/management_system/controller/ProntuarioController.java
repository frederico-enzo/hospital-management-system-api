package com.hospital.management_system.controller;

import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.repository.ProntuarioRepository;
import com.hospital.management_system.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/prontuario")
public class ProntuarioController {
    @Autowired
    private ProntuarioService service;
    @Autowired
    private ProntuarioRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }
    @PostMapping
    public ResponseEntity<ProntuarioDto> create(@RequestBody ProntuarioDto model) {
        return ResponseEntity.ok(service.create(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProntuarioDto> update(@RequestBody ProntuarioDto model) {
        return ResponseEntity.ok(service.update(model));
    }
}
