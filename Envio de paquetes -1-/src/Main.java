public class Main {
    public static void main(String[] args) {
        mostrarEtiquetas("GIA-789","Colombia",19.6);
        mostrarEtiquetas("GIA-987", "Ecuador", 69.1);
        }

    static void mostrarEtiquetas(String num, String des, double peso) {

        System.out.println("-----------------------------------");
        System.out.println("       ETIQUETA DE ENVIO");
        System.out.println("   ");
        System.out.println("Numero de guia: " +num);
        System.out.println("Ciudad de destino: "+des);
        System.out.println("peso del paquete: "+peso+"kg");
        System.out.println("-----------------------------------");

    }
}
