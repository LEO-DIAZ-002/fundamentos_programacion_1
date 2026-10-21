import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        double puntuacion=0;
        int con_p=0;
        double con_pro=0;
        int con_pati_mas=0;
        int con_pati_menos=0;

        System.out.println("Jugador");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Dime tu puntuacion obtenia para la partida "+i+" : ");
            puntuacion=teclado.nextInt();

            if(puntuacion>0){

                con_p+=puntuacion;

                if(puntuacion<=1000){

                    con_pati_menos++;

                }else{

                    con_pati_mas++;

                }


            }else{
                System.out.println("No puedes ingresar puntos negativos ");
                i-=1;
            }
        }
        System.out.println("------------------");

        System.out.println("Tus puntos acumulado son: "+con_p);
        con_pro=con_p/7;
        System.out.println("Tu promedio de puntos es: "+con_pro);
        System.out.println("Partidas con mas de 1000 puntos: "+con_pati_mas);
        System.out.println("Partidas con menos de 1000 puntos: "+con_pati_menos);




    }
}