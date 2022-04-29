/**
 * El alumnado y el profesorado se identifican con un alias en el sistema y se 
 * comunican a través de correo electrónico. Por motivos administrativos es 
 * necesario  conocer el nombre y apellidos, dirección completa y teléfono de 
 * todas las personas que participan en el sistema, sea como  profesores o como 
 * alumnos. 
 * @author david
 */


public class Persona {

    private String nombre;

    private String direccion;

    private String telefono;

    private String alias;

    private String Apellidos;

    private String email;

    public Persona(String nombre, String direccion, String telefono, String alias, String Apellidos, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alias = alias;
        this.Apellidos = Apellidos;
        this.email = email;
    }
    

    /**
     * Devuelve el nombre de la Persona.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la Persona.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la Dirección de la Persona. 
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Modifica la Direccion de la Persona.
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el teléfono de la Persona.
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono de la Persona.
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el alias de la Persona.
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Modifica el alias de la Persona.
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Devuelve los apellidos de la Perona
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * Modifica los apellidos de la Persona.
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * Devuelve el Email de la Perona.
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica el Email de la Persona.
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
