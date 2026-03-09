package tp0;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tiempo {
    private Date unaFecha;

    public Tiempo() {
        this.unaFecha = new Date();
    }

    public String obtenerFechaLarga() {
        SimpleDateFormat formato = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", Locale.getDefault());
        return formato.format(unaFecha);
    }

    public String obtenerFechaCorta() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return formato.format(unaFecha);
    }
}
