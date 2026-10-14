import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elevador :)");
        Scanner teclado=new Scanner(System.in);

        System.out.printf("Dime en que piso estas: ");
        int origen=teclado.nextInt();

        System.out.printf("Dime a que piso vas: ");
        int destino=teclado.nextInt();

        if(origen==11 || destino==11){

            System.out.printf("No hay piso 11 :(");

        }else if(origen<0 || destino<0){

            System.out.printf("No hay pisos negativos :(");

        }else if (origen==0 || destino==0){

            System.out.printf("No puedes ingresar 0 :(");

        } else if (origen==destino) {
            System.out.printf("Ya estas en el piso");

        } else if (origen < destino) {

            while (origen < destino) {
                origen++;
                System.out.println("Piso: " + origen);
            }
        } else {

            while (origen > destino) {
                origen--;
                System.out.println("Piso: " + origen);
            }

        }

    }
}