package ejercicios_finales;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class EjercicioFinal {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palabras;
        System.out.println("ingresa tu nombre");
        palabras = entrada.nextLine();

        StringBuilder inverso = new StringBuilder(palabras);

        palabras = inverso.reverse().toString();

        System.out.println(palabras);
    }

    public static class ArrayUnidimensional{
        public static void main(String[] args) {
            String palabras[] = {"enero", "febrero", "marzo"};

            for (String palabra : palabras
                 ) {
                System.out.println(palabra);
            }
        }
    }

    public static class ArrayBidimensional{
        public static void main(String[] args) {
            Integer[][] numeros = {
                    {10, 20, 30},
                    {33, 22, 11}
            };

            for(int i = 0; i < numeros.length; i++){
                for (int j = 0; j < numeros[i].length; j++){
                    System.out.println("contenido de la fila-> " + (i + 1) + " contenido de la columna ->" +
                            (j + 1) + " valores = a: -> " + numeros[i][j]);
                }
            }
        }
    }

    public static class MiVector{
        public static void main(String[] args) {

            Vector miVector = new Vector();
            miVector.add(1);
            miVector.add(2);
            miVector.add(3);
            miVector.add(4);

            System.out.println("numeros introducidos: " + miVector);

            miVector.remove(1);
            miVector.remove(2);

            System.out.println("espacios eliminados del vector 1 y 2 \n " +
                    " contenido final: " + miVector);

            /*
            en cada llamado se duplicamos los datos y se satura la memoria
            */
        }
    }

    public static class ArrayString {
        public static void main(String[] args) {
            ArrayList<String> lista = new ArrayList<String>();
            lista.add("hugo");
            lista.add("paco");
            lista.add("luis");

            LinkedList<String> linkedlist = new LinkedList<String>();

            for (int i = 0; i < lista.size(); i++) {
                linkedlist.add(i, lista.get(i));
            }

            for (String contenido : lista) {
                System.out.println("contenido del array-> \n " + contenido + "");
            }

            for (String contenido : linkedlist) {
                System.out.println("contenido del linkedList-> \n" + contenido + "");

            }
        }
    }

    public static class ArrayInt {
        public static void main(String[] args) {
            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 0; i < 11; i++) {
                lista.add(i);
                for (int j = 0; j < lista.size(); j++) {
                    if (lista.get(j) % 2 == 0) {
                        lista.remove(j);
                    }
                }
            }
            System.out.println("resultado -> " + lista);
        }


        public static class DivisionACero {

            private static int Dividir(int a, int b) throws ArithmeticException {
                return a / b;
            }

            public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.print("Num 1: ");
                int a = scanner.nextInt();
                System.out.print("Num 2: ");
                int b = scanner.nextInt();
                try {
                    System.out.println("Resultado: " + Dividir(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Esto no puede hacerse");
                } finally {
                    System.out.println("Demo de código");
                }
            }
        }
    }

    public static class FicherosClone {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Desde: ");
            String desde = scanner.nextLine();
            System.out.println("Hasta: ");
            String hasta = scanner.nextLine();
            copiar(desde, hasta);
        }

        private static void copiar(String desde, String hasta) {
            try {
                InputStream in = new FileInputStream(desde);
                byte[] dato = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(hasta);
                out.write(dato);
                out.close();
            } catch (Exception e) {
                System.out.println("La Excepción es: " + e.getMessage());
            }
        }

    }

}

