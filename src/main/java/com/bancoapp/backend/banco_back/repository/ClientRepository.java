package com.bancoapp.backend.banco_back.repository;
import com.bancoapp.backend.banco_back.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
