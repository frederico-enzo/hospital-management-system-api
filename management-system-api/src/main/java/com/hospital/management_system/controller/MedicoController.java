package com.hospital.management_system.controller;

import com.hospital.management_system.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {
    @Autowired
    private ConsultaService service;
}
