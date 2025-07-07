package br.com.api.eventos_tec.domain.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remote,
                String eventURL, MultipartFile image) {
}