package independiente;

public class Enero30MetodosString {

    public static void main(String[]args){

        String cadenas = "Esto es una cadena de palabras";
        String nombre = "Palabra";

        //MÉTODOS PARA STRING EN JAVA: 
        //.length() Devuelve la longitud de un String
        System.out.println("1- " + cadenas.length());

        //.charAt() Devuelve el caracter del índice indicado
        System.out.println("2- " + cadenas.charAt(3));

        //.compareTo() Compara el tamaño de dos cadenas de texto, devuelve la relación de tamaño
        System.out.println("3- " + cadenas.compareTo("sto"));

        //.equals() Devuelve True si el contenido es el mismo
        System.out.println("4- " + nombre.equals("alabr"));

        //.indexOf() Devuelve el índice en el que empieza el parámetro indicado.
        System.out.println("5- " + cadenas.indexOf("una"));

        //.contains() Devuelve True si se contiene el parámetro indicado.
        System.out.println("6- " + cadenas.contains("cadena"));

        //.startsWith() Devuelve True si empieza por el parámetro indicado.
        System.out.println("7- " + cadenas.startsWith("Esto"));

        //.endsWith() Devuelve True si termina por el parámetro indicado
        System.out.println("8- " + cadenas.endsWith("palabras"));

        //.split(" ") Separa el String con el parámetro indicado y
        // lo convierte en un array
        String [] palabras = cadenas.split(" ");
        //ATRIBUTO .length() Para los arrays, length es un atributo y no un MÉTODO (como veíamos con el String)
        System.out.println("\n9- " + palabras.length);

        for (String palabra:palabras){
            System.out.println(palabra);
        }
        
        /*
         * Como anotación, los Arrays con Java deben presentarse llenos o vacíos.
         * No se puede tener un array lleno por la mitad. 
         * En caso de hacerlo, las posiciones no ocupadas se rellenarán con null,
         * lo que provocará un NullPointerException.
         * 
         * Para crear arrays que se vayan llenando progresivamente, utilizaremos más adelante los ArrayList.
         */
        



    }
}
