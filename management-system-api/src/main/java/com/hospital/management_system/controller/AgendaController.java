package com.hospital.management_system.controller;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.repository.AgendaRepository;
import com.hospital.management_system.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/agenda")
public class AgendaController {
    @Autowired
    private AgendaService service;
    @Autowired
    private AgendaRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping
    public ResponseEntity<AgendaDto> create(@RequestBody AgendaDto model) {
        return ResponseEntity.ok(service.create(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<AgendaDto> update(@RequestBody AgendaDto model) {
        return ResponseEntity.ok(service.update(model));
}
}