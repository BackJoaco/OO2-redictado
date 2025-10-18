package com.patterns;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Excursion excursion = new Excursion(
            "Dos dias en kayak bajando el Paraná",
            LocalDate.of(2025, 10, 18),
            LocalDate.of(2025, 10, 20),
            "Casa de Joaco",
            100,
            1,
            3);
        Usuario joaco = new Usuario("garicano@gmail.com", "Joaquin", "Garicano");
        Usuario cristal = new Usuario ("andrade@gmail.com", "Cristal", "Andrade");
        Usuario mati = new Usuario("frassone@gmail.com", "mati", "Frassone");
        System.out.println(excursion.obtenerInformacion());
        System.out.println("---------------------------------------------------");
        excursion.inscribir(joaco);
        System.out.println(excursion.obtenerInformacion());
        System.out.println("---------------------------------------------------");
        excursion.inscribir(cristal);
        System.out.println(excursion.obtenerInformacion());
        System.out.println("---------------------------------------------------");
        excursion.inscribir(mati);
        System.out.println(excursion.obtenerInformacion());
        System.out.println("---------------------------------------------------");
    }
}