import java.util.ArrayList;
import java.util.Scanner;

public class AguaDeCalzon {
    private ArrayList<Jugador> jugadores;
    private BancoDePreguntas bancoDePreguntas;
    private Scanner scanner;

    public AguaDeCalzon() {
        this.jugadores = new ArrayList<>();
        this.bancoDePreguntas = new BancoDePreguntas();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarJuego() {
        System.out.print("❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️\n");
        System.out.println("❤️ ¡Bienvenidos a Agua de Calzón (LA PRUEBA) - Versión Parejas! 💑 ❤️");
        System.out.print("❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️ ❤️\n");

        // Solo se piden 2 jugadores
        System.out.print("Ingrese el nombre de la novia: ");
        String nombre1 = scanner.nextLine();
        jugadores.add(new Jugador(nombre1));

        System.out.print("Ingrese el nombre del novio: ");
        String nombre2 = scanner.nextLine();
        jugadores.add(new Jugador(nombre2));

        jugarRondas();
    }

    private void jugarRondas() {
        boolean juegoActivo = true;
        int turno = 0;

        while (juegoActivo) {
            System.out.println("\n--- Nueva Ronda ---");

            Jugador quienPregunta = jugadores.get(turno % 2);
            Jugador quienResponde = jugadores.get((turno + 1) % 2);

            System.out.println(quienPregunta.getNombre() + " hará una pregunta a " + quienResponde.getNombre());
            String pregunta = bancoDePreguntas.obtenerPreguntaAleatoria();
            System.out.println("📢 Pregunta: " + pregunta);

            // Validar respuesta
            boolean respuestaCorrecta = Utilidades.validarRespuesta(scanner);
            if (respuestaCorrecta) {
                quienResponde.aumentarPuntos();
                System.out.println("✅ ¡Correcto! Muy bien " + quienResponde.getNombre() + " gana un punto.");
            } else {
                System.out.println("❌ ¡Incorrecto! Como no supiste esa respuesta si era obvia " + quienResponde.getNombre());
            }

            mostrarPuntuaciones();

            // Verificar si hay un ganador
            for (Jugador j : jugadores) {
                if (j.getPuntos() >= 100) {
                    System.out.println("\n🎉 ¡" + j.getNombre() + " ha ganado con 25 puntos! 🎉");
                    juegoActivo = false;
                    break;
                }
            }

            turno++;
        }
    }

    private void mostrarPuntuaciones() {
        System.out.println("\n📊 Tabla de puntuaciones:");
        for (Jugador j : jugadores) {
            System.out.println(j.getNombre() + ": " + j.getPuntos() + " puntos");
        }
    }

    public static void main(String[] args) {
        AguaDeCalzon juego = new AguaDeCalzon();
        juego.iniciarJuego();
    }
}
