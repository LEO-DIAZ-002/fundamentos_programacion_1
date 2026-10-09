import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.print("Dime la temperatura en c°: ");
        double temperatura=teclado.nextDouble();

        if(temperatura>30){
            System.out.print("calor extremo");
        }else if(temperatura>=21){
            System.out.print("Clima agradable");
        } else if(temperatura>=10){
            System.out.print("Clima fresco");
        }else {
            System.out.print("Frio extremo");
        }

    }
}