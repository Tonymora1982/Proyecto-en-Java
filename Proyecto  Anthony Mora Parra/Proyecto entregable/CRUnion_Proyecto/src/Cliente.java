
/**
 * @since 14 Agosto
 * @version 3.0
 * @author Anthony Mora Parra
 * @Universidad Estatal a Distancia
 * @Curso Programacion Intermedia
 */
public class Cliente {

    protected String IdCliente;
    protected String NombreCliente;
    protected String Apellidos;
    protected String Nacionalidad;
    protected int Edad;

    /**
     * Constructor con Parametros
     *
     * @param IdCliente
     * @param NombreCliente
     * @param Apellidos
     * @param Nacionalidad
     * @param Edad
     *
     */
    public Cliente(String IdCliente, String NombreCliente, String Apellidos, String Nacionalidad, int Edad) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.Apellidos = Apellidos;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;

    }

    /**
     * Constructor sin Parametros
     */
    public Cliente() {
    }

    /**
     * Getters & Setters
     *
     * @return
     */
    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * Metodo ToString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cliente: " + "IdCliente=" + IdCliente + ", NombreCliente=" + NombreCliente + ", Apellidos=" + Apellidos + ", Nacionalidad=" + Nacionalidad + ", Edad=" + Edad + '}';
    }

    public String agregarComa() {
        return IdCliente + "," + NombreCliente + "," + Apellidos + "," + Nacionalidad + "," + Edad + ",";
    }

}
