import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //crear un array para almacenar los cocineros
        Cocinero cocineros[] = new Cocinero[3];

        //crear un bucle que ingrese la información de los cocineros
        for (int i = 0; i < cocineros.length; i++) {
            System.out.printf("Ingrese el nombre del cocinero " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.printf("Ingrese la experiencia en años del cocinero: ");
            int experiencia = sc.nextInt();
            sc.nextLine(); //limpiar buffer
            System.out.printf("Ingrese la especialidad del cocinero: ");
            String especialidad = sc.nextLine();

            cocineros[i] = new Cocinero(nombre, experiencia, especialidad); //se agrega el objeto cocinero
        }

        System.out.println("\nMostrando información de los cocineros...\n");
        for (int i = 0; i < cocineros.length; i++) {
            System.out.println("---------- Cocinero " + (i + 1) + " ----------");
            cocineros[i].mostrarInfo();
        }

    }
}