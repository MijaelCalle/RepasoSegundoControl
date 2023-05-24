package PaqExcepciones;
public class PiezaIncorrectaException extends Exception {
    public PiezaIncorrectaException() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "PiezaIncorrectaException: La pieza es incorrecta para esta operación.";
    }
}