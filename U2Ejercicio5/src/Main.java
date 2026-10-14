public class Main {
    public static void main(String[] args) {

        System.out.println("Numeros mayor :)");
        int a,b,c;
        a=11;
        b=10;
        c=15;
       if (a==0 || b==0 || c==0){

           System.out.println("No ingreses 0");

        }else if(a>b && a>c){

            System.out.println("El mayor es: "+a);

        }else if(b>a && b>c){

            System.out.println("El mayor es: "+a);

        }else{

            System.out.println("El mayor es: "+a);

        }

       int num=1;

       while(num<=5){
           System.out.println("Numero: "+num);
           num+=2;

       }
        System.out.println("Numero: "+num);
        System.out.println("---------");

       while(num>=0){
           System.out.println("Numero: "+num);
           num--;
       }

    }
}