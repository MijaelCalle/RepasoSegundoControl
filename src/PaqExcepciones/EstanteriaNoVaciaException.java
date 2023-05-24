package PaqExcepciones;

public class EstanteriaNoVaciaException extends Exception {
    public EstanteriaNoVaciaException() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "EstanteriaNoVaciaException: La estantería no está vacía.";
    }
}