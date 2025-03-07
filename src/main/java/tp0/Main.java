package tp0;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        System.out.printf("Fecha en formato largo: " + tiempo.obtenerFechaLarga());
        System.out.println("Fecha en formato corto: " + tiempo.obtenerFechaCorta());
    }
}