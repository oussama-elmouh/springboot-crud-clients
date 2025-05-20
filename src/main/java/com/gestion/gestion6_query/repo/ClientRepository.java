package com.gestion.gestion6_query.repo;

import com.gestion.gestion6_query.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {
    @Query(value = "SELECT * FROM Client c WHERE c.ville = :ville",
            nativeQuery = true)
    List<Client> findClientsByVille(@Param("ville") String ville);}
