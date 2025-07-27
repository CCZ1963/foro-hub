// src/main/java/com/example/foro/service/TopicoService.java

package com.example.foro.service;

import com.example.foro.dto.TopicoDTO;
import com.example.foro.model.Topico;
import com.example.foro.model.Usuario;
import com.example.foro.repository.TopicoRepository;
import com.example.foro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Topico> getAllTopicos() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> getTopicoById(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico createTopico(TopicoDTO dto, Authentication authentication) {
        // Obtener el usuario autenticado (que ya está en el contexto de seguridad)
        String email = authentication.getName();
        Usuario autor = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Topico topico = new Topico();
        topico.setTitulo(dto.getTitulo());
        topico.setMensaje(dto.getMensaje());
        topico.setAutor(autor);

        return topicoRepository.save(topico);
    }

    public Topico updateTopico(Long id, TopicoDTO dto) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico no encontrado"));

        topico.setTitulo(dto.getTitulo());
        topico.setMensaje(dto.getMensaje());

        return topicoRepository.save(topico);
    }

    public void deleteTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}