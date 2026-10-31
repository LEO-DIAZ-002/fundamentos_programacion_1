import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int opc=0;
        int calcular=0;
        int tiempo=0;

        System.out.print("");
        do {
            System.out.println("----------------------------------");
            System.out.print("Dime el porcentaje de bateria inicial: ");
            int bateria = teclado.nextInt();

            if(bateria>=0 && bateria<=100){
                calcular=calcularMinutos(calcular,bateria);

                System.out.println("Se tardara: "+calcular+" minutos");
                calcular=0;
            }else {
                System.out.println("La bateria no puede ser menor a 0 ni mayor a 100 ;(");
            }


            System.out.println("----------------------------------");
            System.out.print("Quieres cargar otra bateria 1.si 2.no: ");
            opc=teclado.nextInt();
        }while(opc!=2);

    }

    static int calcularMinutos(int calcular, int bateria){

        while(bateria<100){
            bateria+=8;
            calcular+=1;

        }
        return calcular;
    }

}