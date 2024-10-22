package com.hospital.management_system.controller;


import com.hospital.management_system.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService service;

}