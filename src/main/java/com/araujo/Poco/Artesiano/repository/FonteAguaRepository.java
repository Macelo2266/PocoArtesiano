package com.araujo.Poco.Artesiano.repository;

import com.araujo.Poco.Artesiano.model.FonteAgua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface FonteAguaRepository extends JpaRepository<FonteAgua, Long> {

    Optional<FonteAgua> findByExternalId(String externalId);

    List<FonteAgua> findByMunicipioIgnoreCase(String municipio);
}
