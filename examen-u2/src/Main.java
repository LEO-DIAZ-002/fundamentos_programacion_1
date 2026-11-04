import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int peso =0;
        int paquete =0;
        int valido=0;
        int opc=0;
        int opc2=0;
        int presio=0;
        int fragil=0;
        int presioFragil=0;
        int total=0;
        int tipo=0;
        int aceptado=0;
        int rechazados=0;
        int fra=0;
        int presioMayor=0;



        do {
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Dime el peso del paquete: ");
            peso = teclado.nextInt();

            if (peso < 0) {
                System.out.println("No puedes poner el peso negativo :(");

            } else if (peso > 0) {
                paquete++;

                do{
                System.out.print("Que opcion eliges \n1.Local\n2.Nacional\n3.Express\n:");
                opc = teclado.nextInt();

                switch (opc){
                    case 1:

                        if(peso<=12) {
                            presio = 30 + 8 * peso;
                            tipo=1;
                            aceptado++;

                            do {
                                System.out.println("Es fragil el paquete \n1.Si \n2.No \n:");
                                fragil=teclado.nextInt();
                                if(fragil==1){
                                    opc=2;
                                    presioFragil=presio+25;
                                    fra++;
                                    total=total+presioFragil;

                                    if(presioFragil>presioMayor){
                                        presioMayor=presioFragil;
                                    }
                                    System.out.println("fragil aceptado :)");
                                }else if (fragil==2){
                                    opc=2;
                                    total=total+presio;
                                    if(total>presioMayor){
                                        presioMayor=total;
                                    }
                                    System.out.println("Tu paquete no es fragil :)");
                                }else{
                                    System.out.println("Opcion no valida :(");
                                }
                            }while(opc!=2);

                            if(tipo==1) {
                                System.out.println("Tipo de envio: Local");
                            }else if(tipo==2) {
                                System.out.println("Tipo de envio: Nacional");
                            }else {
                                System.out.println("Tipo de envio: Express");
                            }

                            System.out.println("Tu peso es: "+peso+"kg");


                            if(fragil==1){
                                System.out.println("Tu paquete es fragil, pagaras: "+presioFragil);
                            }else{
                                System.out.println("Tu paquete no es fragil, pagaras: "+presio);
                            }

                        }else{
                            System.out.println("El peso pasa de los 12kg requeridos :(");
                            rechazados++;
                        }



                        break;
                    case 2:
                        if(peso<=20) {
                            presio = 50 + 12 * peso;
                            tipo=2;
                            aceptado++;

                            do {
                                System.out.println("Es fragil el paquete \n1.Si \n2.No \n:");
                                fragil=teclado.nextInt();
                                if(fragil==1){
                                    opc=2;
                                    presioFragil=presio+25;
                                    total=total+presioFragil;
                                    fra++;
                                    if(presioFragil>presioMayor){
                                        presioMayor=presioFragil;
                                    }
                                    System.out.println("fragil aceptado :)");
                                }else if (fragil==2){
                                    opc=2;
                                    total=total+presio;
                                    if(total>presioMayor){
                                        presioMayor=total;
                                    }
                                    System.out.println("Tu paquete no es fragil :)");
                                }else{
                                    System.out.println("Opcion no valida :(");
                                }
                            }while(opc!=2);

                            if(tipo==1) {
                                System.out.println("Tipo de envio: Local");
                            }else if(tipo==2) {
                                System.out.println("Tipo de envio: Nacional");
                            }else {
                                System.out.println("Tipo de envio: Express");
                            }

                            System.out.println("Tu peso es: "+peso+"kg");


                            if(fragil==1){
                                System.out.println("Tu paquete es fragil, pagaras: "+presioFragil);
                            }else{
                                System.out.println("Tu paquete no es fragil, pagaras: "+presio);
                            }


                        }else{
                            System.out.println("El peso pasa de los 20kg requeridos :(");
                            rechazados++;
                        }
                        break;
                    case 3:
                        if(peso<=5) {
                            presio = 80 + 20 * peso;
                            tipo=3;
                            aceptado++;

                            do {
                                System.out.println("Es fragil el paquete \n1.Si \n2.No \n:");
                                fragil=teclado.nextInt();
                                if(fragil==1){
                                    opc=2;
                                    presioFragil=presio+25;
                                    total=total+presioFragil;
                                    fra++;
                                    if(presioFragil>presioMayor){
                                        presioMayor=presioFragil;
                                    }
                                    System.out.println("fragil aceptado :)");
                                }else if (fragil==2){
                                    opc=2;
                                    total=total+presio;
                                    if(total>presioMayor){
                                        presioMayor=total;
                                    }
                                    System.out.println("Tu paquete no es fragil :)");
                                }else{
                                    System.out.println("Opcion no valida :(");
                                }
                            }while(opc!=2);

                            if(tipo==1) {
                                System.out.println("Tipo de envio: Local");
                            }else if(tipo==2) {
                                System.out.println("Tipo de envio: Nacional");
                            }else {
                                System.out.println("Tipo de envio: Express");
                            }

                            System.out.println("Tu peso es: "+peso+"kg");


                            if(fragil==1){
                                System.out.println("Tu paquete es fragil, pagaras: "+presioFragil);
                            }else{
                                System.out.println("Tu paquete no es fragil, pagaras: "+presio);
                            }



                        }else{
                            System.out.println("El peso pasa de los 5kg requeridos :(");
                            rechazados++;
                        }
                        break;
                    default:
                        System.out.println("opcion no valida :(");
                        opc=4;
                        break;
                }

                }while (opc==4);






            } else {
                System.out.println("A dios :)");
                System.out.println("Totales aceptados: "+aceptado);
                System.out.println("Totales rechazados: "+rechazados);
                System.out.println("Dinero recaudado: "+total);
                System.out.println("Fragiles aceptados: "+fra);
                System.out.println("El importe mas alto es: "+presioMayor);


            }

        }while(peso!=0);



    }
}