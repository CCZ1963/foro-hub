package com.example.foro.service;

import com.example.foro.model.Topico;
import com.example.foro.model.Usuario;
import com.example.foro.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> getAllTopicos() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> getTopicoById(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico createTopico(TopicoDTO dto, Usuario autor) {
        Topico topico = new Topico();
        topico.setTitulo(dto.getTitulo());
        topico.setMensaje(dto.getMensaje());
        topico.setAutor(autor);
        return topicoRepository.save(topico);
    }

    public Topico updateTopico(Long id, TopicoDTO dto) {
        Topico topico = topicoRepository.findById(id).orElseThrow();
        topico.setTitulo(dto.getTitulo());
        topico.setMensaje(dto.getMensaje());
        return topicoRepository.save(topico);
    }

    public void deleteTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}