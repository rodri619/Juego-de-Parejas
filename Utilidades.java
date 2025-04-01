import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {
    private static Random random = new Random();

    public static Jugador[] seleccionarJugadores(ArrayList<Jugador> jugadores) {
        if (jugadores.size() < 2){
            System.out.println("No seas pendej@, se necesitan mínimo 2 jugadores");
            return null;
        }
        int index1 = random.nextInt(jugadores.size());
        int index2;

        do {
            index2 = random.nextInt(jugadores.size());
        } while (index2 == index1);

        return new Jugador[]{jugadores.get(index1), jugadores.get(index2)};
    }

    public static boolean validarRespuesta(Scanner scanner){
        System.out.println("La respuesta que te dijo es@ idiota es correcta o nel? (1 = Correcta, 2 = Incorrecta)");
        int opcion;
        while (true) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion == 1 || opcion == 2){
                    return opcion == 1;
                }
                System.out.println("Ingresa 1 si fue Correcta o 2 si la cagaste");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
            }
        }
    }
}
