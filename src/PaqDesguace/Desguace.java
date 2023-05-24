package PaqDesguace;
public class Desguace {
    private String nombre;
    private String CIF;
    private Pieza[][] piezas;

    public Desguace(int alto, int ancho) {
        piezas = new Pieza[alto][ancho];
    }

    public Desguace(String nombre, String CIF, int alto, int ancho) {
        this(alto, ancho);
        this.nombre = nombre;
        this.CIF = CIF;

    }

    public void añadirPieza(Pieza pieza, int x, int y) {
        piezas[x][y] = pieza;
    }

    public void mostrarPiezas() {
        for (int i = 0; i < piezas.length; i++) {
            for (int j = 0; j < piezas[i].length; j++) {
                if (piezas[i][j] != null) {
                    System.out.print(piezas[i][j].toString() + " ");
                } else System.out.print("null  ");

            }
            System.out.println();
        }
    }



}

