package tp0;

import java.time.LocalDate;

public class TiempoAnemico {
    private LocalDate fechaA;

    public TiempoAnemico(LocalDate fecha) {
        this.fechaA = fecha;
    }

    public LocalDate getFecha() {
        return fechaA;
    }

    public void setFecha(LocalDate fecha) {
        this.fechaA = fecha;
    }

}
