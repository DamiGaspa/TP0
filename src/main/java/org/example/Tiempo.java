package org.example;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tiempo {
    private Date fecha;

    public Tiempo() {
        this.fecha = new Date();
    }

    public String obtenerFechaLarga() {
        SimpleDateFormat formato = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", Locale.getDefault());
        return formato.format(fecha);
    }

    public String obtenerFechaCorta() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return formato.format(fecha);
    }
}
