// src/main/java/com/example/foro/dto/TopicoDTO.java

package com.example.foro.dto;

/**
 * DTO para transferir datos de un tópico.
 * Se usa en las solicitudes de creación y actualización.
 */
public class TopicoDTO {

    private String titulo;
    private String mensaje;
    private Long autorId; // Opcional: si el frontend lo envía, pero en el backend lo reemplazamos por el usuario autenticado

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }
}