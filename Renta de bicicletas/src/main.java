import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double stotal=0;
        double des=0;
        double total=0;
        double hora=0;

        System.out.print("Dime tu tipo de bicicleta \n1. Bicicleta urbana: $40 por hora\n2. Bicicleta de montaña: $60 por hora\n3. Bicicleta eléctrica: $90 por hora\n:");
        int opc= teclado.nextInt();

        switch (opc){
            case 1:
                System.out.print("");
                System.out.print("Dime las horas: ");
                hora=teclado.nextInt();

                if(hora>0){
                    stotal=40*hora;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        des=stotal*.20;
                        total=stotal-des;
                    }else{
                        total=stotal-des;
                    }
                }else if(hora==0){
                    System.out.print("No ocupaste la bicicleta :(");
                    System.exit(0);

                }else {
                    System.out.print("Pusiste las horas mal :(");
                    System.exit(0);
                }
                System.out.print("Bicicleta urbana\nSubtotal: "+stotal+"\nDescuento: "+des+"\nTotal: "+total);

                break;
            case 2:

                System.out.print("Dime las horas: ");
                hora=teclado.nextInt();

                if(hora>0){
                    stotal=60*hora;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        des=stotal*.20;
                        total=stotal-des;
                    }else{
                        total=stotal-des;
                    }
                }else if(hora==0){

                    System.out.print("No ocupaste la bicicleta :(");
                    System.exit(0);

                }else {

                    System.out.print("Pusiste las horas mal :(");
                    System.exit(0);

                }
                System.out.print("Bicicleta montaña\nSubtotal: "+stotal+"\nDescuento: "+des+"\nTotal: "+total);


                break;
            case 3:

                System.out.print("Dime las horas: ");
                hora=teclado.nextInt();

                if(hora>0){
                    stotal=90*hora;
                    System.out.print("Tiene membresia? 1.Si 2.No :");
                    int membresia= teclado.nextInt();
                    if(membresia==1){
                        System.out.print("Tienes un desceunto del 20%");
                        des=stotal*.20;
                        total=stotal-des;
                    }else{
                        total=stotal-des;
                    }
                }else if(hora==0){
                    System.out.print("No ocupaste la bicicleta :(");
                    System.exit(0);

                }else {
                    System.out.print("Pusiste las horas mal :(");
                    System.exit(0);
                }
                System.out.print("Bicicleta electrica\nSubtotal: "+stotal+"\nDescuento: "+des+"\nTotal: "+total);


                break;
            default:

                System.out.print("Opcion no valida ;(");

                break;

        }





    }
}
