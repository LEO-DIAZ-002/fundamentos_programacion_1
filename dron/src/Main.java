import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int min=1;
        System.out.println("Practica Dron :)");

        System.out.printf("Dime la bateria inicial del dron: ");
        int bateria=teclado.nextInt();

        if (bateria>0){

            if(bateria<=100){

                if(bateria>=7){

                    while(bateria>=7){
                        bateria-=7;
                        System.out.println("Minuto " +min+ " -- Bateria restante: "+bateria+"%");
                        min++;
                    }


                }else{
                    System.out.printf("No puedes volar con menos de 7 de bateria :(");
                }

            }else{
                System.out.printf("Pusiste la bateria mal :(");
            }

        }else{
            System.out.printf("Pusiste la bateria mal :(");
        }

    }
}