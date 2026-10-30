import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.print("");
        System.out.print("Dime la tarifa de alquiler por hora: ");
        double tarifa= teclado.nextDouble();
        if(tarifa>0){
            System.out.print("Dime la cantidad de horas de uso: ");
            int horas= teclado.nextInt();
            if(horas>0){
                double total=calcularRenta(tarifa, horas);
                mostrarComprobante(total);
            }else{
                System.out.print("Las horas no pueden ser negativas o cero :(");
            }
        }else{
            System.out.print("La tarifa no puede ser negativa o cero :(");
        }

    }
    static double calcularRenta(double tarifa, int horas){
        double total=tarifa*horas;
        return total;
    }
    static void mostrarComprobante(double total){
        System.out.print("El total es: $"+total);
    }

}