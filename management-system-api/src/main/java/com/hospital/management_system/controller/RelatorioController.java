package com.hospital.management_system.controller;


import com.hospital.management_system.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService service;

}
