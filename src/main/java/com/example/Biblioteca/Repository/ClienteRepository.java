package com.example.Biblioteca.Repository;


import com.example.Biblioteca.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
