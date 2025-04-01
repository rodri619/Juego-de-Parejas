import java.util.ArrayList;
import java.util.Random;

public class BancoDePreguntas {
    
    private ArrayList<String> preguntas;
    private Random random;

    public BancoDePreguntas(){
        this.preguntas = new ArrayList<>();
        this.random =  new Random();
        CargaPreguntasIniciales();
    }

    private void CargaPreguntasIniciales(){
        preguntas.add("¿Cuál es mi comida favorita?");
        preguntas.add("¿Qué es lo que más me molesta?");
        preguntas.add("¿Qué lugar sueño con visitar?");
        preguntas.add("Prefieres dormir tarde o despertar temprano?");
        preguntas.add("Hay algo que collecione?");
        preguntas.add("Quien es mi mejor amig@?");
        preguntas.add("pizza con piña o sin piña?");
        preguntas.add("Soy alérgico a algo?");
        preguntas.add("Horchata o jamaica");
        preguntas.add("Me dio covid?");
        preguntas.add("Prefiero usar calzón o boxer/tanga?");
        preguntas.add("Como nos conocimos?");
        preguntas.add("Quién es mi superhéroe favorito?");
        preguntas.add("Tengo cirugías o algo operado?");
        preguntas.add("Si mi casa se estuviera quemando, que artículo salvaría? ");
        preguntas.add("Cuál es mi restaurante favorito?");
        preguntas.add("Qué perfume o loción utilizo?");
        preguntas.add("Cuál es mi nombre completo?");
        preguntas.add("Tengo tatuajes o pircings?");
        preguntas.add("Qué es lo que más valoro en una amistad?");
        preguntas.add("Cuál es mi color favorito?");

        preguntas.add("¿Cuál es mi bebida alcohólica favorita?");
        preguntas.add("Qué palabra o frase digo con demasiada frecuencia?");
        preguntas.add("Soy de los que lloran, se ríen o se enojan cuando estoy borracho?");
        preguntas.add("Qué es lo más vergonzoso que he hecho borracho?");
        preguntas.add("Quién es mi compañer@ ideal para una peda épica?");
        preguntas.add("Qué canción no puede faltar cuando estoy bebiendo?");
        preguntas.add("Prefiero antro, bar o peda en casa?");
        preguntas.add("Alguna vez he vomitado en un lugar inapropiado?");
        preguntas.add("Cuál es la bebida que juro nunca volveré a tomar?");
        preguntas.add("Quién suele ser mi cómplice de pedas?");
        preguntas.add("Quién es más alcohólic@, tu o yo perra?");

        preguntas.add("Cuál es mi leguaje de programación favorito?");
        preguntas.add("Canek es mejor profesor de todo el fucking mundo?");
        preguntas.add("Chichis o culos?");
        preguntas.add("Messi o Cristiano?");
        preguntas.add("Qué deporte prefiero?");
        preguntas.add("Qué día nací?");
        preguntas.add("Algo que pienso que no te gusta de mi?");
        preguntas.add("?");

    }

    public String obtenerPreguntaAleatoria() {
        if (preguntas.isEmpty()) {
            return "No hay preguntas disponibles.";
        }
        int index = random.nextInt(preguntas.size());
        return preguntas.get(index);
    }

    public void AgregarPregunta(String pregunta){
        preguntas.add(pregunta);
        System.out.println("Pregunta agregada: " + pregunta);
    }

    public int totalPreguntas(){
        return preguntas.size();
    }
}
