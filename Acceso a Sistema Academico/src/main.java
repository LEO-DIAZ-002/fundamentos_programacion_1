import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);

        System.out.print("Dime tu porcentaje de faltas: ");
        double falta= teclado.nextDouble();

        if (falta>=80){
            System.out.print("Dime tu promedio: ");
            double prom= teclado.nextDouble();
            if(prom>=7){
                System.out.print("Aprobado Regular");
            }else {
                System.out.print("Reprobado por calificacion ");
            }
        }else{
            System.out.print("Reprobado por faltas");
        }



    }
}


