package com.banana.bananawhatsapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.banana.bananawhatsapp.persistencia")
@EntityScan("com.banana.bananawhatsapp.persistencia")
public class BananaWhatsAppApplication {

    public static void main(String[] args) {

        System.out.println("Mensajeria de whatsapp");
    }
}
