public class PreguntaConContador {
    private String texto;
    private int vecesUsada;

    public PreguntaConContador(String texto) {
        this.texto = texto;
        this.vecesUsada = 0;
    }

    public String getTexto() {
        return texto;
    }

    public int getVecesUsada() {
        return vecesUsada;
    }

    public void aumentarUso() {
        vecesUsada++;
    }

    public boolean puedeUsarse() {
        return vecesUsada < 2;
    }
}
