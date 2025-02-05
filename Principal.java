import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
            
        mostrarFechaHoraActual();
    }

    //Creamos método para mostrar fecha
    public static void mostrarFechaHoraActual() {
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }
}

