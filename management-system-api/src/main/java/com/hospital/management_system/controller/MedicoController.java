package com.hospital.management_system.controller;

import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.repository.MedicoRepository;
import com.hospital.management_system.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {
    @Autowired
    private MedicoService service;
    @Autowired
    private MedicoRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping
    public ResponseEntity<MedicoDto> create(@RequestBody MedicoDto model) {
        return ResponseEntity.ok(service.create(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<MedicoDto> update(@RequestBody MedicoDto model) {
        return ResponseEntity.ok(service.update(model));
    }
}
