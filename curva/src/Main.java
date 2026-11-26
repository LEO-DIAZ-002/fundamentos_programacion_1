import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Calificaciones :)");

        int [] califi={55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        System.out.println("-------------------------------------------------");
        System.out.println("Registro de las calificaciones \n   ");
        mostrarcalifi(califi);
        curva(califi);
        System.out.println("-------------------------------------------------");
        System.out.println("Registro de las calificaciones con curva \n   ");
        mostrarcalifi(califi);

        System.out.println("-------------------------------------------------");
        System.out.printf("Los aprobados despues de la curva son: "+apobado(califi));

    }

    static void mostrarcalifi(int[] califi){

        for(int i=0;i<califi.length;i++){

            System.out.println("La calificacion del alumno "+(i+1)+"  es :"+califi[i]);
        }
    }

    static int apobado(int []nuevocalifi){
        int aprobados=0;

        for(int i=0;i<nuevocalifi.length;i++){

            if(nuevocalifi[i]>=70){
                aprobados++;
            }
        }

        return aprobados;
    }

    static void curva(int []califi){

        for(int i=0;i<califi.length;i++){

            if(califi[i]<100) {
                califi[i] += 5;
                if(califi[i]>100){
                    califi[i]=califi[i]-(califi[i]-100);
                }
            }

        }


    }









}