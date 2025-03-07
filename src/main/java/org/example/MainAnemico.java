package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAnemico {
    public static void main(String[] args) {
        TiempoAnemico tiempo = new TiempoAnemico(LocalDate.now());

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        System.out.println("Formato Largo: " + tiempo.getFecha().format(formatoLargo));

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formato Corto: " + tiempo.getFecha().format(formatoCorto));
    }


}
