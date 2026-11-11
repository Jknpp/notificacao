package com.jknpp.notificacao.controller;


import com.jknpp.notificacao.business.dto.TarefaDto;
import com.jknpp.notificacao.business.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail(@RequestBody TarefaDto dto){
        emailService.enviarEmail(dto);
        return ResponseEntity.ok().build();
    }
}
