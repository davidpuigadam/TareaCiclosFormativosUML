/**
 * Si un alumno o alumna no termina de cursar el ciclo completo puede pedir un 
 * certificado que acredite las competencias que sí tenga adquiridas. 
 * @author david
 */

public class Competencia {

    private String nombre;

    private String descripcion;

    public Competencia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el nombre de la competencia.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la competencia.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descipción de la competencia.
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la competencia.
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
