package com.araujo.Poco.Artesiano.controller;

import com.araujo.Poco.Artesiano.model.FonteAgua;
import com.araujo.Poco.Artesiano.repository.FonteAguaRepository;
import com.araujo.Poco.Artesiano.service.FonteAguaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fontes")
public class FonteAguaController {

    private final FonteAguaRepository repository;
    private final FonteAguaService importador;

    public FonteAguaController(FonteAguaRepository repository, FonteAguaService importador) {
        this.repository = repository;
        this.importador = importador;
    }

    @GetMapping
    public List<FonteAgua> listar(@RequestParam(required = false) String municipio) {
        if (municipio != null) {
            return repository.findByMunicipioIgnoreCase(municipio);
        }
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FonteAgua> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FonteAgua> criarFonte(@RequestBody FonteAgua novaFonte) {
        FonteAgua salva = importador.salvar(novaFonte);
        return ResponseEntity.ok(salva);
    }

}

