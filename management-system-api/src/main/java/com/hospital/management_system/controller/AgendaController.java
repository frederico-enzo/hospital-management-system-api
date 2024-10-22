package com.hospital.management_system.controller;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.repository.AgendaRepository;
import com.hospital.management_system.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/agenda")
public class AgendaController {
    @Autowired
    private  AgendaService service;

    @GetMapping("/{id}")
    public ResponseEntity<AgendaDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<AgendaDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<AgendaDto> create(@RequestBody AgendaDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<AgendaDto> put(@PathVariable Long id, @RequestBody AgendaDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}