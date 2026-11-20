import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Calificaciones :)");


        double [] cali= calcularcalifi(teclado);

        mostrarcalifi(cali);

        System.out.println("-------------------------------------------------");
        System.out.println("Alumnos aprobados\n      ");
        System.out.println("Los alumnos aprobados son: "+apobado(cali)+" :)");

        System.out.println("-------------------------------------------------");
        System.out.println("Alumnos reprobados\n      ");
        System.out.println("Los alumnos reprobados son: "+reprobados(cali)+" :(");


    }

    static double[] calcularcalifi(Scanner teclado){
        double [] califi= new double [10];
        int valor=0;
        for(int i=0;i<califi.length;i++){

            do {
                System.out.print("Dime la calificacion del alumno " + (i + 1) + " : ");
                califi[i] = teclado.nextDouble();
                if(califi[i]<0){
                    System.out.println("No puede tener calificacion negativa :(");
                    valor=2;
                }else if(califi[i]>100){
                    System.out.println("No puede tener calificacion Mayor a 100 :(");
                    valor=2;
                }else{
                    valor=1;
                }
            }while(valor!=1);
        }
        return califi;
    }

    static double[] mostrarcalifi(double[] cali){

        System.out.println("-------------------------------------------------");
        System.out.println("Refistro de las calificaciones \n   ");
        for(int i=0;i<cali.length;i++){

            System.out.println("La calificacion del alumno "+(i+1)+"  es :"+cali[i]);
        }

        return cali;
    }

    static int apobado(double []cali){
        int aprobados=0;

        for(int i=0;i<cali.length;i++){

            if(cali[i]>=70){
                aprobados++;
            }
        }

        return aprobados;
    }

    static int reprobados(double []cali){
        int reprobados=0;

        for(int i=0;i<cali.length;i++){

            if(cali[i]<70){
                reprobados++;
            }
        }

        return reprobados;
    }









}