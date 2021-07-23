package practica10;

import java.util.Scanner;

public class Consola extends LineaComandos {

    Scanner teclado = new Scanner(System.in);
    LineaComandos comandos = new LineaComandos();
    String nombreArchivo, nombreComando;

    public void prompt(String comandoEjecutar) {
        try {
            switch (comandoEjecutar) {
                case "grep" -> {
                    System.out.println("Ejecutando Comando grep");
                    System.out.println("Escribe el comando de grep");
                    nombreComando = teclado.nextLine();
                    comandos.grep(nombreComando);
                }
                case "cat" -> {
                    System.out.println("Ejecutando Comando cat");
                    System.out.println("Escribe el nombre del archivo");
                    nombreArchivo = teclado.nextLine();
                    System.out.println("Escribe el comando de cat");
                    nombreComando = teclado.nextLine();
                    comandos.cat(nombreComando, nombreArchivo);
                }
                case "vi" -> {
                    System.out.println("Ejecutando Comando vi");
                    System.out.println("Escribe el nombre del archivo");
                    nombreArchivo = teclado.nextLine();
                    System.out.println("Escribe el comando de vi");
                    nombreComando = teclado.nextLine();
                    comandos.vi(nombreComando, nombreArchivo);
                }
                case "find" -> {
                    System.out.println("Ejecutando Comando find");
                    System.out.println("Escribe el nombre del archivo");
                    nombreArchivo = teclado.nextLine();
                    System.out.println("Escribe el comando de find");
                    nombreComando = teclado.nextLine();
                    comandos.find(nombreComando, nombreArchivo);
                }
                case "tree" -> {
                    System.out.println("Ejecutando Comando tree");
                    System.out.println("Escribe el comando de find");
                    nombreComando = teclado.nextLine();
                    comandos.tree(nombreComando);
                }
                default -> throw new IllegalStateException("Valor inesperado: " + comandoEjecutar);
            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }catch(ConsolaException e){
            e.PromptVacioException("Mandaste una entrada vacia");
        }finally {
            System.out.println("Terminamos toda la ejecución del programa");
        }
    }
}
