public class Jugador {

    private String nombre;
    private int puntuacion;

    public Jugador (String nombre){
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntos(){
        return puntuacion;
    }

    public void aumentarPuntos(){
        puntuacion++;
    }

    public String toString(){
        return nombre + "- Puntos: " + puntuacion;
    }
}