import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        System.out.printf("");
        Scanner teclado=new Scanner(System.in);


        int puntos=100;
        int opc;


        do{
            System.out.printf("1. Ganar 20 puntos\n2. Gastar 15 puntos\n3. Consultar puntos\n4. Salir\nElige una opcion: ");
            opc=teclado.nextInt();


            switch (opc){
                case 1:
                    puntos+=20;
                    System.out.println("Ganaste 20 puntos :)");
                    System.out.println("Tienes "+puntos+" Puntos :)");
                    System.out.println("-------------");
                    break;
                case 2:


                    if(puntos>=15){
                        puntos-=15;
                        System.out.println("Gastaste 15 puntos :)");
                    }else{
                        System.out.println("No te alcansan los puntos puntos :(");
                    }
                    System.out.println("Tienes "+puntos+" Puntos :)");
                    System.out.println("-------------");


                    break;
                case 3:
                    System.out.println("Tienes "+puntos+" puntos :)");
                    System.out.println("-------------");
                    break;
                case 4:
                    System.out.println("Bye Bye Bye :)");


                    break;
                default:
                    System.out.println("No esta esa opcion :(");


                    break;
            }




        }while(opc!=4);
        System.out.println("Acumulaste "+puntos+" Puntos :)");


    }
}
