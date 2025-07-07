package br.com.api.eventos_tec.domain.dto;

import java.sql.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public record EventResponseDTO(UUID id, String title, String description, Date date, String city, String uf,
                Boolean remote,
                String eventURL, String imgUrl) {

}
