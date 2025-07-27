// src/main/java/com/example/foro/controller/TopicoController.java

package com.example.foro.controller;

import com.example.foro.dto.TopicoDTO;
import com.example.foro.model.Topico;
import com.example.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public ResponseEntity<List<Topico>> getAllTopicos() {
        return ResponseEntity.ok(topicoService.getAllTopicos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> getTopico(@PathVariable Long id) {
        return topicoService.getTopicoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Topico> createTopico(@RequestBody TopicoDTO dto, Authentication authentication) {
        Topico nuevoTopico = topicoService.createTopico(dto, authentication);
        return ResponseEntity.ok(nuevoTopico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> updateTopico(@PathVariable Long id, @RequestBody TopicoDTO dto) {
        Topico topicoActualizado = topicoService.updateTopico(id, dto);
        return ResponseEntity.ok(topicoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopico(@PathVariable Long id) {
        topicoService.deleteTopico(id);
        return ResponseEntity.noContent().build();
    }
}