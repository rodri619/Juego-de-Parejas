import java.util.ArrayList;
import java.util.Random;

public class BancoDePreguntas {
    private ArrayList<PreguntaConContador> preguntas;
    private Random random;

    public BancoDePreguntas() {
        preguntas = new ArrayList<>();
        random = new Random();
        cargarPreguntasIniciales();
    }

    private void cargarPreguntasIniciales() {
        preguntas.add(new PreguntaConContador("¿Cuál es mi comida favorita?"));
        preguntas.add(new PreguntaConContador("¿Qué es lo que más me molesta?"));
        preguntas.add(new PreguntaConContador("¿Qué lugar sueño con visitar?"));
        preguntas.add(new PreguntaConContador("Prefieres dormir tarde o despertar temprano?"));
        preguntas.add(new PreguntaConContador("Hay algo que coleccione?"));
        preguntas.add(new PreguntaConContador("Quien es mi mejor amig@?"));
        preguntas.add(new PreguntaConContador("pizza con piña o sin piña?"));
        preguntas.add(new PreguntaConContador("Soy alérgico a algo?"));
        preguntas.add(new PreguntaConContador("Me dio covid?"));
        preguntas.add(new PreguntaConContador("Como nos conocimos?"));
        preguntas.add(new PreguntaConContador("Quién es mi superhéroe favorito?"));
        preguntas.add(new PreguntaConContador("Tengo cirugías o algo operado?"));
        preguntas.add(new PreguntaConContador("Si mi casa se estuviera quemando, que artículo salvaría?"));
        preguntas.add(new PreguntaConContador("Cuál es mi nombre completo?"));
        preguntas.add(new PreguntaConContador("Tengo tatuajes o pircings?"));
        preguntas.add(new PreguntaConContador("Qué es lo que más valoro en una amistad?"));
        preguntas.add(new PreguntaConContador("Cuál es mi color favorito?"));
        preguntas.add(new PreguntaConContador("¿A qué le tengo miedo?"));

        preguntas.add(new PreguntaConContador("¿Cuál es mi bebida alcohólica favorita?"));
        preguntas.add(new PreguntaConContador("Qué palabra o frase digo con demasiada frecuencia?"));
        preguntas.add(new PreguntaConContador("Soy de los que lloran, se ríen o se enojan cuando estoy borracho?"));
        preguntas.add(new PreguntaConContador("Qué es lo más vergonzoso que he hecho borracho?"));
        preguntas.add(new PreguntaConContador("Qué canción no puede faltar cuando estoy bebiendo?"));
        preguntas.add(new PreguntaConContador("Prefiero antro, bar o peda en casa?"));
        preguntas.add(new PreguntaConContador("Alguna vez he vomitado en un lugar inapropiado?"));
        preguntas.add(new PreguntaConContador("Cuál es la bebida que juro nunca volveré a tomar?"));
        preguntas.add(new PreguntaConContador("Quién es más alcohólic@, tu o yo?"));

        preguntas.add(new PreguntaConContador("Qué deporte prefiero?"));
        preguntas.add(new PreguntaConContador("Cuál es mi fecha de nacimiento?"));
        preguntas.add(new PreguntaConContador("Qué estación del año es tu favorita?"));
        preguntas.add(new PreguntaConContador("Play Station o Xbox?"));
        preguntas.add(new PreguntaConContador("Frío o Calor?"));
        preguntas.add(new PreguntaConContador("Película favorita"));
        preguntas.add(new PreguntaConContador("Me gustaría tatuarme?"));
        preguntas.add(new PreguntaConContador("Equipo favorito de cualquier deporte"));
        preguntas.add(new PreguntaConContador("Horchata o jamaica"));
        preguntas.add(new PreguntaConContador("Cantante favorito"));
        preguntas.add(new PreguntaConContador("Género musical favorito")); 
        preguntas.add(new PreguntaConContador("Me gustaría tener hijos?"));
        preguntas.add(new PreguntaConContador("Que día de la semana prefieres"));
        preguntas.add(new PreguntaConContador("Salado o dulce"));
        preguntas.add(new PreguntaConContador("Flores favoritas"));
        preguntas.add(new PreguntaConContador("Cuántos herman@s tengo?"));
        preguntas.add(new PreguntaConContador("¿Qué emoji uso más?"));
        preguntas.add(new PreguntaConContador("¿Cómo se llaman mis papás?"));

        preguntas.add(new PreguntaConContador("¿En qué fecha exacta nos conocimos?"));
        preguntas.add(new PreguntaConContador("¿Qué crees que pensé de ti la primera vez que te vi?"));
        preguntas.add(new PreguntaConContador("¿Dónde fue nuestra primera cita?"));
        preguntas.add(new PreguntaConContador("¿Qué comimos en nuestra primera cita?"));
        preguntas.add(new PreguntaConContador("¿De qué hablamos la primera vez por mensaje?"));
        preguntas.add(new PreguntaConContador("¿Cuándo fue nuestro primer beso?"));
        preguntas.add(new PreguntaConContador("¿Dónde fue nuestro primer beso?"));
        preguntas.add(new PreguntaConContador("¿Cuándo fue que empezamos a salir oficialmente?"));
        preguntas.add(new PreguntaConContador("¿Qué crees que sentí el primer día que fuimos novios?"));
        preguntas.add(new PreguntaConContador("¿Cuándo nos tomamos nuestra primera foto juntos?"));
        preguntas.add(new PreguntaConContador("¿Qué plan o salida crees que me ha gustado más hasta ahora?"));
        preguntas.add(new PreguntaConContador("¿Qué lugar te dije que quiero visitar contigo?"));
        preguntas.add(new PreguntaConContador("Qué canción crees que se ha vuelto “nuestra”?"));
        preguntas.add(new PreguntaConContador("¿Qué día salimos solo a caminar o a platicar largo?"));
        preguntas.add(new PreguntaConContador("¿Cuál ha sido el momento más romántico que crees que hemos tenido?"));
        preguntas.add(new PreguntaConContador("¿Qué parte de mí (personalidad) te encanta?"));
        preguntas.add(new PreguntaConContador("Cuál es mi canción favorita?"));
    }

    public String obtenerPreguntaAleatoria() {
        ArrayList<PreguntaConContador> disponibles = new ArrayList<>();
        for (PreguntaConContador p : preguntas) {
            if (p.puedeUsarse()) {
                disponibles.add(p);
            }
        }

        if (disponibles.isEmpty()) {
            return "Ya se han hecho todas las preguntas posibles 💔";
        }

        PreguntaConContador seleccionada = disponibles.get(random.nextInt(disponibles.size()));
        seleccionada.aumentarUso();
        return seleccionada.getTexto();
    }
}
