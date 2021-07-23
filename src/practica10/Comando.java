package practica10;

public abstract class Comando {

    abstract void grep(String palabraBusqueda);
    abstract void cat(String comando,String nombreArchivo);
    abstract void find(String filtro,String nombreArchivo);
    abstract void vi(String modo,String comando);
    abstract void tree(String comando);

}
