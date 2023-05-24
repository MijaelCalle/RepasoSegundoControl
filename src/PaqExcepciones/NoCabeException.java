package PaqExcepciones;

public class NoCabeException extends Exception {
    public NoCabeException() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "NoCabeException: La pieza no cabe en la estantería.";
    }
}