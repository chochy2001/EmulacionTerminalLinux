package practica10;

public class ConsolaException extends RuntimeException {
    public void PromptVacioException(String mensaje) {
        System.out.println("El prompt no puede estar vacio"+ mensaje);
    }
}
