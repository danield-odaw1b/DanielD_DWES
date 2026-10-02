package org.example.ejercicio27.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalController {
        @GetMapping("/acerca")
        public String mostrarAcerca() {
            return "acerca";
        }

        @GetMapping("/index")
        public String mostrarIndex() {
            return "index";
        }

        @GetMapping("/destacados")
        public String mostrarDestacado() {
            return "destacados";
        }

        @GetMapping("/galeria")
        public String mostrarGaleria() {
            return "galeria";
        }
}