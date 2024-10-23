package com.hospital.management_system.controller;

import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {
    @Autowired
    private MedicoService service;
    @GetMapping("/{id}")
    public ResponseEntity<MedicoDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<MedicoDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<MedicoDto> create(@RequestBody MedicoDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<MedicoDto> put(@PathVariable Long id, @RequestBody MedicoDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
