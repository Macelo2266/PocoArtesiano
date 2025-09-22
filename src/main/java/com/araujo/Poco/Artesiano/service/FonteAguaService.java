package com.araujo.Poco.Artesiano.service;


import com.araujo.Poco.Artesiano.model.FonteAgua;
import com.araujo.Poco.Artesiano.repository.FonteAguaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FonteAguaService {

    @Autowired
    private FonteAguaRepository repo;

    // Salvar uma nova fonte
    public FonteAgua salvar(FonteAgua fonte) {
        return repo.save(fonte);
    }

    // Atualizar uma fonte existente
    public FonteAgua atualizar(Long id, FonteAgua novosDados) {
        FonteAgua fonte = repo.findById(id).orElseThrow(() ->
                new RuntimeException("Fonte não encontrada com id: " + id)
        );
        fonte.setNome(novosDados.getNome());
        fonte.setTipo(novosDados.getTipo());
        fonte.setMunicipio(novosDados.getMunicipio());
        fonte.setLatitude(novosDados.getLatitude());
        fonte.setLongitude(novosDados.getLongitude());
        fonte.setCapacidadeLitros(novosDados.getCapacidadeLitros());
        fonte.setStatusFonte(novosDados.getStatusFonte());
        return repo.save(fonte);
    }

    // Deletar uma fonte
    public void deletar(Long id) {
        repo.deleteById(id);
    }

    // Listar todas as fontes
    public List<FonteAgua> listar() {
        return repo.findAll();
    }

    public void importarFontes() {
    }
}

