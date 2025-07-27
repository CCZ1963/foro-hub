// src/main/java/com/example/foro/controller/TopicoController.java

package com.example.foro.controller;

// ✅ IMPORTS NECESARIOS
import com.example.foro.model.Topico;
import com.example.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.foro.model.Usuario;
import org.springframework.web.bind.annotation.*;

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
        Usuario autor = (Usuario) authentication.getPrincipal();
        return ResponseEntity.ok(topicoService.createTopico(dto, autor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> updateTopico(@PathVariable Long id, @RequestBody TopicoDTO dto) {
        return ResponseEntity.ok(topicoService.updateTopico(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopico(@PathVariable Long id) {
        topicoService.deleteTopico(id);
        return ResponseEntity.noContent().build();
    }
}