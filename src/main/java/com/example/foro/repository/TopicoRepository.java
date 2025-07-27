package com.example.foro.repository;

import com.example.foro.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para gestionar la entidad Topico.
 * Proporciona operaciones CRUD y consultas personalizadas si se necesitan.
 */
@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    /**
     * Encuentra todos los tópicos ordenados por fecha de creación (descendente).
     * Este método es opcional, pero útil para mostrar los más recientes primero.
     *
     * @return Lista de tópicos ordenados por fecha de creación descendente.
     */
    // List<Topico> findAllByOrderByFechaCreacionDesc();

    // Aquí puedes agregar métodos personalizados como:
    // List<Topico> findByAutorId(Long autorId);
    // List<Topico> findByTituloContaining(String titulo);
}