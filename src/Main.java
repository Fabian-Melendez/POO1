import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la tienda de bebidas!");

        Bebida bebidaSeleccionada = new Bebida().proceso1();

        System.out.println("Bebida creada exitosamente:");
        System.out.println(bebidaSeleccionada);

        sc.close();
    }
}