package com.araujo.Poco.Artesiano.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "fontes_agua")
public class FonteAgua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String externalId;
    private String nome;
    private String tipo;
    private Double latitude;
    private Double longitude;
    private Double capacidadeLitros;
    private String municipio;
    private LocalDateTime ultimaAtualizacao;


    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(Double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public StatusFonte getStatusFonte() {
        return statusFonte;
    }

    public void setStatusFonte(StatusFonte statusFonte) {
        this.statusFonte = statusFonte;
    }


    @Enumerated(EnumType.STRING)
    private StatusFonte statusFonte;
}


