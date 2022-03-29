package Ibanez_David_PROG06_Practica;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrollar un programa en Java que permita jugar a un juego de preguntas y
 * respuestas inspirado en el conocido concurso de televisión Saber y ganar.
 *
 * @author David
 */
public class Ibanez_Sanchez_David_Prog06 {
//Generamos las variables fuera del main.

    static int contJug = 0;
    static int xjug;
    static int rondas, i;
    static String[][] jugadores;
    static String[] nombreJug;
    static int matriz[][];
    static String[] arrays;
    static int numrondas = 0;
    static int npuntos = 0;
    static int arraysLengh;
    static int turnoJug;
    static int numEnt;
    static int puntMaxima = 0;

    static String ganadPart = "";

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

// Se muestra la función 'cabecera' introducción al juego.
        cabecera();

        int[][] inicializarPartida = inicializarPartida();

        //Para guardar los numeros y simbolos, para generar la pregunta.
        for (int i = 0; i <= rondas; i++) {

            for (int j = 0; j < jugadores.length; j++) {

                simbolo();

                generarPregunta();

                evaluarExpresionArray();

                comprobarRespuesta();
            }
            /*Al finalizar cada ronda*/
            finalizarRonda();
        }

        finalizarPartida();
    }

    public static void cabecera() {

        System.out.println("  =================================¡¡¡ Saber y Ganar !!! ==================================== ");
        System.out.println("  ========================== Presentado por: Jordi Hurtado ================================== ");
        System.out.println("  =========================================================================================== ");
        System.out.println("  =============== Saber y Ganar es el juego que habla todo el mundo, \n ===================== "
                + "en el que el ingenio os marcará la meta final. =======================================================");
        System.out.println("                                                                     ");
        System.out.println(" ================================ Serás tu el ganador ... !!! ================================");
        System.out.println("                                                                     ");
        System.out.println("                                                                     ");
        System.out.println("                                                                     ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                          =====================================                        ");
        System.out.println("                            =================================                          ");
        System.out.println("                              =============================                            ");
        System.out.println("                                =========================                              ");
        System.out.println("                                 =======================                               ");
        System.out.println("                                  =====================                                ");
        System.out.println("                                     ===============                                    ");
        System.out.println("                                          ======                                        ");
        System.out.println("                                          ======                                        ");
        System.out.println("                                        ==========                                      ");
        System.out.println("                                   ====================                                 ");
        System.out.println("                                ===========================                             ");
        System.out.println("                           =====================================                        ");

        System.out.println(" Para comenzar la partida ( Presione cualquier tecla ) ");
        entrada.nextLine();
    }

    /**
     * Una función del programa, en esta función, vamos a inicializar los
     * jugadores, guardar el nombre de los jugadores, inicializar las rondas de
     * la partida y guardar los puntos de cada jugador. Se va realizando uno a
     * uno de la inicialización.
     *
     * @param args
     */
// Función de inicializar la partida
    public static int[][] inicializarPartida() {

        while (true) {

            System.out.println("Introduce el número de jugadores entre 1 y 6 : ");
            xjug = entrada.nextInt();

// Con esta condicion lo que queremos indicar, es si el número marcado está comprendido entre 1 y el 6.
// Si no es así, saldrá un mensaje de fallo y volverá a indicar por pantalla que introduzca un número.
// Si está bien, salimos del bucle.
            if (xjug < 1 | xjug > 6) {
                System.out.println("UPPPSSS!!. El número introducido no es correcto.");

            } else {
                break;
            }
        }

// Preguntamos y guardamos el nombre de los jugadores.
        nombreJug = new String[xjug];
        int i = 0;

        for (i = 0; i < xjug; i++) {

// Utilizamos (i + 1) para que no muestre por pantalla el jugador 0.                 
            System.out.println("Introduce el nombre del jugador " + (i + 1) + ":");

// Almacenamos los nombre de los jugadores en el arrays[i].               
            nombreJug[i] = entrada.nextLine();
        }
// Los jugadores a preguntar se ordenan aleatoriamente.
        for (i = 0; i < xjug; i++) {

// Calculamos la posición del jugador.
            int pos = (int) (Math.random() * xjug);

// Creamos un cadena vacia de la posicion del jugador
            String posJugador;
// Guardamos al jugador en la cadena vacia.                
            posJugador = nombreJug[i];
// Ponemos el nombre del jugador en la posicion.               
            nombreJug[i] = nombreJug[pos];
// Guardamos la cadena  en la posicion del jugador.                
            nombreJug[pos] = posJugador;
        }

        System.out.println("Para saber el orden de partida seleccione la tecla (Intro)");

        entrada.nextLine();
// Mostramos por pantalla el orden de los jugadores.
        System.out.println("Así queda el orden de los jugadores :");

        for (i = 0; i < xjug; i++) {
            System.out.println((i + 1) + ":" + nombreJug[i]);
        }

        System.out.println("Introduce las rondas sabiendo que:\n"
                + " 1) 3 Rondas (partida rápida) \n"
                + " 2) 5 Rondas (partida corta) \n"
                + " 3) 10 Rondas (partida normal) \n"
                + " 4) 20 Rondas (partida larga)");

//Se leen las rondas.            
        char rondas = entrada.next().charAt(0);
// Asociamos las rondas, con el número al que corresponde al mostrar por pantalla.
        switch (rondas) {
// Generamos las rondas de la partida.
            /**
             * Función para comprobar el número de rondas que quiere el usuario.
             * Según escoja "1", "2", "3" o "4", se devolverá una cantidad u
             * otra.
             *
             * @param rondas Se lee la opción que ha seleccionado el usuario,
             * "1", "2", "3" o "4".
             */

            case '1':
                numrondas = 3;

            case '2':
                numrondas = 5;

            case '3':
                numrondas = 10;

            case '4':
                numrondas = 20;

        }

// Creamos matriz, indicando en [i] el numero de jugadores y se almacena en 2 columnas.  
        int matriz[][] = new int[xjug][2];
// recorremos la posición de los jugadores y sus puntuaciones.
        for (i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

// En esta matriz guardamos la posición.
                matriz[i][0] = i;
// Guardamos en la posición 1.
                matriz[i][1] = 0;

            }
        }
        return matriz;

    }

    /**
     * En esta función símbolo, utilizamos una serie de operaciones, para que
     * los símbolos tengan un valor aleatorio. En donde el número 1 sería el
     * simbolo"+". El numero 2 tendría el simbolo "-". El número 3 tendría el
     * simbolo "*".
     *
     * @return valor aleatorio de los simbolos.
     */
    public static char simbolo() {
// Realizamos estas operaciones, ya que nos indican que tienen que ser aleatorios el símbolo.
// Y cada número tendrá el valor de un simbolo.
        char simbolo;
        int A = (int) (1 + Math.random() * (3 - 1 + 1));
        if (A == 1) {
            simbolo = '+';
        } else if (A == 2) {
            simbolo = '-';
        } else {
            simbolo = '*';
        }
        return simbolo;
    }

    /**
     * En esta función generarPregunta, tenemos que utilizar la función
     * Math_Randon para calcular un número aleatorio para poder generar la
     * pregunta, la pregunta tiene que tener un mínimo de 4 números y un máximo
     * de 8, y estos números nunca tienen que repetirse . Después debemos
     * calcular número aleatório para que los números sean entre 12 y 2,
     * utilizaremos "arraysLengh" Para convertir un Array a String utilizamos el
     * "concat".
     *
     *
     */
    public static void generarPregunta() {
// Generamos un número entero entre 4 y 8, para hacer la pregunta.
        numEnt = (int) (4 + Math.random() * (8 - 4 + 1));
// El número entero que generamos, nunca se repita.
        arraysLengh = (numEnt * 2) - 1;
// Para que la longitud del array será suficiente para números y jugadores.
        arrays = new String[arraysLengh];
// Generar pregunta
        for (int x = 0; x < arraysLengh; x++) {
//Generamos un número aleatorio entre 12 y 2.
            int numMath = (int) (2 + Math.random() * (12 - 2 + 1));
// Guardar un entero en un String.
            arrays[x] = numMath + "";
            char operador = simbolo();

// Esta condición para que la expresión finaliza con un número.
            if (x != (arraysLengh - 1)) {
// Guardar un Char a un String                
                arrays[x + 1] = operador + "";
            }
// Para saltar la posición donde se ha guardado el operador.            
            x++;
        }
//Convertir  el Arrays a String
        String concat = "";

        for (int x = 0; x < arraysLengh; x++) {

            concat += arrays[x];
        }

// Nos muestra el resultado de la pregunta.
// Nos muestra que si el resultado es igual que el resultado, se mostrará que es correcto, y sumará un punto.
// si no indicará que es incorrecto y nos mostrará la solución correcta.
        int res = evaluarExpresionArray(concat);

        System.out.println("Calcula la siguiente expresión : (" + concat + ")");

        int respuesta = entrada.nextInt();
        int i = 0;
        if (respuesta == res) {
            System.out.println("Respuesta ¡¡¡¡ CORRECTA !!!! sumas 1 punto");
            matriz[i][1] += 1;
        } else {
            System.out.println("respuesta ¡¡¡¡ INCORRECTA !!!!. El Resultado" + concat + " es: " + res);

        }
        System.out.println("");
        System.out.println("El jugador " + nombreJug[i] + " tiene : " + matriz[i][1]);

    }

    /**
     * Esta función sirva para poder evaluar la experesión matemática.
     *
     * @param exp
     * @return valor
     */
    public static int evaluarExpresionArray(String[] exp) {

        int valor = 0;
        String[] expRed = new String[exp.length];
        expRed = Arrays.copyOf(exp, exp.length);

        for (int i = 0; i < expRed.length; i++) {
            if (expRed[i] == "*") {
                expRed[i + 1] = multiplicar(expRed[i - 1], expRed[i + 1]);
                expRed[i - 1] = "0";
                if (i - 2 > 0 && expRed[i - 2] == "-") {
                    expRed[i] = "-";
                } else {
                    expRed[i] = "+";
                }
            }
        }

        System.out.print("La expresión matemática reducida es: ");
        for (int i = 0; i < expRed.length; i++) {
            System.out.print(expRed[i]);
        }
        System.out.println();

        String op = "";
        for (int i = 0; i < expRed.length; i++) {
            if (i == 0) {
                valor = Integer.parseInt(expRed[i]);
            } else if (expRed[i] == "+") {
                op = "suma";
            } else if (expRed[i] == "-") {
                op = "resta";
            } else {
                if (op == "suma") {
                    valor = valor + Integer.parseInt(expRed[i]);
                    op = "";
                } else if (op == "resta") {
                    valor = valor - Integer.parseInt(expRed[i]);
                    op = "";
                }
            }
        }
        return valor;
    }
// Función multiplicar.

    /**
     * Función Multiplicar.
     *
     * @param num1
     * @param num2
     * @return resString
     */
    private static String multiplicar(String num1, String num2) {
        int num1Int, num2Int, resInt;
        String resString;

        num1Int = Integer.parseInt(num1);
        num2Int = Integer.parseInt(num2);
        resInt = num1Int * num2Int;
        resString = Integer.toString(resInt);
        return resString;
    }
// Función para para comprobar si la respuesta es correcta o no.

    /**
     * En la función comprobarRespuesta utilizamos el método boolean, se indica
     * que si la pregunta y la respuesta no coinciden el false y si coinciden da
     * como resultado true.
     *
     * @param respuesta
     * @param pregunta
     * @return correcto
     */
    public static boolean comprobarRespuesta(int respuesta, String pregunta) {
        boolean correcto = false;
        int evaluarExpresionArray = 0;
        if (evaluarExpresionArray != respuesta) {
        } else {
            correcto = true;
        }
        return correcto;
    }

    /**
     * En esta función finalizarRonda, es para mostrar las puntuaciones de cada
     * jugador. Para ello, se lee la matriz de las puntuaciones y muestra por
     * pantalla cada una.
     *
     */
    public static void finalizarRonda() {
// Leemos la longitud de los jugadores y mostramos los puntos de cada uno en la ronda.
        for (int j = 0; j < jugadores.length - 1; j++) {

            System.out.println(" El jugador " + nombreJug + " tiene " + npuntos);

        }
    }

    /**
     * Función para finalizarPartida, aquí se mostrara el resultado del jugardor
     * que haya conseguido más puntos y se indicara por pantalla.
     *
     */
    public static void finalizarPartida() {

        finalizarRonda();
        int i;
// Recorremos la matriz para saber los puntos.
        for (i = 0; i < matriz.length; i++) {
// Realizamos una condicion para saber cual es el ganador del juego
            if (i == 0) {
                puntMaxima = matriz[i][1];
                ganadPart = nombreJug[i];
            } else if (matriz[i][1] > puntMaxima) {

                puntMaxima = matriz[i][1];
                ganadPart = nombreJug[i];
            }

        }
        System.out.println(" El ganador de esta partida es: " + ganadPart);
        System.out.println("");
        System.out.println("¡¡¡¡¡¡¡¡¡ ENHORABUENA " + ganadPart + "!!!!!!!!!!");
    }

    private static void comprobarRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void evaluarExpresionArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static int evaluarExpresionArray(String concat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
