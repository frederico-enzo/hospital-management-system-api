package com.hospital.management_system.controller;

import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.repository.ConsultaRepository;
import com.hospital.management_system.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService service;
    @Autowired
    private ConsultaRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }
    @PostMapping
    public ResponseEntity<ConsultaDto> create(@RequestBody ConsultaDto model) {
        return ResponseEntity.ok(service.create(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ConsultaDto> update(@RequestBody ConsultaDto model) {
        return ResponseEntity.ok(service.update(model));
    }
}