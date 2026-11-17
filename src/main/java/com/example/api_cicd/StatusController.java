package com.example.api_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class StatusController {

    @GetMapping("/status")
    public Map<String, String> status(){
        return Map.of(
                "mensagem", "API funcionando na AWS",
                "versao", "1.0"
        );
    }

}
