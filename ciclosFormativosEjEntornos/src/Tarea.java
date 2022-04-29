/**
 * Para superar un módulo hay que hacer una tarea y un examen que se calificarán 
 * de uno a diez, y sacar en ambos casos una puntuación superior a cinco.
 * @author david
 */


public class Tarea {

    private String descripcion;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Método para calificar a los alumnos.
     */
    public void calificar() {
    }

    /**
     * Devuelve la descripción de la Tarea.
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripcion de la Tarea.
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
