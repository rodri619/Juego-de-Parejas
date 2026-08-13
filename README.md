# 💑 Juego de Parejas

Versión para parejas del juego de preguntas en consola, escrito en Java. Dos jugadores se turnan para hacerse preguntas sobre su relación, gustos y anécdotas compartidas, acumulando puntos por cada respuesta acertada.

Este proyecto es una variante de [Juego-de-preguntas](https://github.com/rodri619/Juego-de-preguntas), adaptada específicamente para dos jugadores en pareja, con un banco de preguntas propio centrado en la historia de la relación (primera cita, primer beso, anécdotas, etc.).

## 🕹️ Cómo se juega

1. Se ingresan los nombres de los dos jugadores (novia y novio).
2. En cada ronda, los jugadores se turnan para preguntar y responder.
3. Se elige una pregunta aleatoria del banco de preguntas.
4. El jugador que escucha decide si la respuesta fue correcta (`1`) o incorrecta (`2`).
5. Si es correcta, quien respondió gana un punto.
6. Se muestra la tabla de puntuaciones tras cada ronda.
7. Gana quien llegue primero a **100 puntos**.

## 🗂️ Estructura del proyecto

| Archivo | Responsabilidad |
|---|---|
| `AguaDeCalzon.java` | Clase principal: controla el flujo del juego, turnos y condición de victoria. |
| `Jugador.java` | Representa a cada jugador: nombre y puntuación. |
| `BancoDePreguntas.java` | Almacena y entrega preguntas aleatorias sin repetición excesiva. |
| `PreguntaConContador.java` | Representa una pregunta individual, llevando el conteo de cuántas veces ha sido usada. |
| `Utilidades.java` | Funciones auxiliares: selección aleatoria de jugadores y validación de respuestas por consola. |

## ✨ Diferencias con la versión original

- Pensado para **exactamente 2 jugadores** (en vez de 2-10).
- Banco de preguntas ampliado con categoría de **preguntas de pareja** (primera cita, primer beso, anécdotas compartidas).
- Cada pregunta usa `PreguntaConContador` para limitar cuántas veces puede repetirse en una misma partida (máximo 2 veces), evitando que se repitan demasiado seguido.

## ▶️ Ejecución

```bash
javac *.java
java AguaDeCalzon
```

## ✏️ Personalizar las preguntas

El banco de preguntas vive en `BancoDePreguntas.java`, dentro del método `cargarPreguntasIniciales()`. Puedes agregar tus propias preguntas así:

```java
preguntas.add(new PreguntaConContador("¿Cuál fue nuestro primer viaje juntos?"));
```

## 🚀 Posibles mejoras futuras

- Cargar las preguntas desde un archivo externo en vez de tenerlas hardcodeadas.
- Permitir configurar el puntaje necesario para ganar.
- Interfaz gráfica en vez de consola.
