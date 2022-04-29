/**
 * Los exámenes se componen de 30 preguntas que se eligen y ordenan al azar. Las 
 * preguntas tienen un enunciado y cuatro posibles respuestas, sólo una de ellas 
 * válida.
 * @author david
 */

public class Pregunta {

    private String enunciado;

    private String respuesta;

    private String respuestaValida;

    public Pregunta(String enunciado, String respuesta, String respuestaValida) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.respuestaValida = respuestaValida;
    }

    /**
     * Devuelve el enunciado de la Pregunta.
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Modifica el enunciado de la Pregunta.
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * Devuelve la respuesta de la Pregunta.
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Modifica la respuesta de la Pregunta.
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Devuelve la respuesta correcta de la Pregunta.
     * @return the respuestaValida
     */
    public String getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * Modifica la respuesta correcta de la Pregunta.
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(String respuestaValida) {
        this.respuestaValida = respuestaValida;
    }
    
}
