package com.hospital.management_system.controller;


import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService service;
    @GetMapping("/{id}")
    public ResponseEntity<ConsultaDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<ConsultaDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<ConsultaDto> create(@RequestBody ConsultaDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ConsultaDto> put(@PathVariable Long id, @RequestBody ConsultaDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}