package com.hospital.management_system.controller;


import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService service;
    @GetMapping("/{id}")
    public ResponseEntity<RelatorioDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<RelatorioDto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping
    public ResponseEntity<RelatorioDto> create(@RequestBody RelatorioDto model) {
        return ResponseEntity.ok(service.post(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<RelatorioDto> put(@PathVariable Long id, @RequestBody RelatorioDto model) {
        return ResponseEntity.ok(service.put(model,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
