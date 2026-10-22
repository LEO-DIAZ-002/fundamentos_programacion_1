import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);

        double cobro=0;
        int horas=0;
        int auto=0;
        double total=0;
        double prom=0;
        int cantidad=0;

        System.out.println("Proyecto auto");
        do{

            auto++;

            System.out.println("Auto "+auto);

            System.out.print("Dime la cantidad de horas estacionado: ");
            horas=teclado.nextInt();

            if(horas>0){




                if(horas>5){

                    cobro=horas*15;
                    cobro-=10;
                    total+=cobro;
                    cantidad++;

                }else{
                    cobro=horas*15;
                    total+=cobro;
                }

                System.out.println("Pagaras: "+cobro+"$");
                System.out.println("------------------");



            }else if(horas==0){
                System.out.println("Bye :)");
            }else{

                System.out.println("No hay horas negativas");
            }



        }while(horas!=0);
        auto-=1;
        prom=total/auto;

        System.out.println("Total de automoviles: "+auto+" automoviles");
        System.out.println("Tu total de dinero recaudado: $"+total);
        System.out.println("Cantidad de automovil que recibieron descuento: "+cantidad+" automoviles");
        System.out.println("Promedio pagado por automovil: $"+prom);



    }
}


