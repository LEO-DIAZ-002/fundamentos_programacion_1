import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.print("");
        System.out.print("Dime el tamaño del archivo en MB: ");
        double tamaño=teclado.nextDouble();
        if(tamaño>0){
            System.out.print("Dime la velocidad de descarga en MB por segundos: ");
            double velocidad=teclado.nextDouble();
            if(velocidad>0){
                double operacion=calcularTiempo(tamaño, velocidad);
                System.out.print("El tiempo de descarga es: "+operacion+"s");

            }else{
                System.out.print("La velocidad no puede ser 0 \nNi menor a 0 \n:(");
            }

        }else if(tamaño==0){
            System.out.print("el tamaño no puede ser cero :(");

        }else{

                System.out.print("El tamaño no puede ser negativo :(");

        }
    }
    static double calcularTiempo(double tamaño, double velocidad){
        double operacion=tamaño/velocidad;
        return operacion;
    }
}