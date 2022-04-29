/**
 *  Los exámenes se componen de 30 preguntas que se eligen y ordenan al azar. 
 * Las preguntas tienen un enunciado y cuatro posibles respuestas, sólo una de 
 * ellas válida
 * @author david
 */

public class Examen {

    private String descripcion;

    private Pregunta[] listapreguntas;

    public Examen(String descripcion, Pregunta[] listapreguntas) {
        this.descripcion = descripcion;
        this.listapreguntas = listapreguntas;
    }
    
/**
 * Métodoa realizar para las preguntas del examen. 
 */
    public void calificar() {
    }
/**
 *  Método para la calificación del examen.
 */
    public void elegirpregunta() {
    }
/**
 * Método para ordena las pregunstas del examen.
 */
    public void ordenarPregunta() {
    }

    /**
     * Devuelve la descripción del examen.
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del examen
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve la lista de las preguntas del examen.
     * @return the listapreguntas
     */
    public Pregunta[] getListapreguntas() {
        return listapreguntas;
    }

    /**
     * Modifica la lista de las preguntas del examen.
     * @param listapreguntas the listapreguntas to set
     */
    public void setListapreguntas(Pregunta[] listapreguntas) {
        this.listapreguntas = listapreguntas;
    }
    
}
