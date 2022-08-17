
/**
 * @since 14 Agosto
 * @version 3.0
 * @author Anthony Mora Parra
 * @Universidad Estatal a Distancia
 * @Curso Programacion Intermedia
 */

public class Equivalencias {

    /**
     * Array & Matriz donde se almacenan los nombres de las monedas y los
     * precios de compra y venta
     */
    protected String[] Descripciones_monedas;
    protected Double[][] Tabla_conversiones;

    /**
     * Constructor sin parametros
     */
    public Equivalencias() {

        /**
         * Instanciacion del Array & Matriz (Quemando los valores) Primer valor
         * en el eje Y Segundo valor en el eje X
         */
        Descripciones_monedas = new String[7];
        Tabla_conversiones = new Double[7][2];

    }

    /**
     *
     * @param descripciones_monedas
     * @param tabla_conversiones
     */
    public Equivalencias(String[] descripciones_monedas, Double[][] tabla_conversiones) {
        Descripciones_monedas = descripciones_monedas;
        Tabla_conversiones = tabla_conversiones;
    }

    /**
     *
     * @param NombreMoneda
     * @return
     */
    public Double PrecioCompra(String NombreMoneda) {
        Double PrecioCompra = 0.0;
        int PosicionMoneda = PosicionMoneda(NombreMoneda);
        PrecioCompra = Tabla_conversiones[PosicionMoneda][1];
        return PrecioCompra;
    }

    /**
     *
     * @param NombreMoneda
     * @return
     */
    public Double PrecioVenta(String NombreMoneda) {
        Double PrecioMoneda = 0.0;
        int PosicionMoneda = PosicionMoneda(NombreMoneda);
        PrecioMoneda = Tabla_conversiones[PosicionMoneda][0];

        return PrecioMoneda;

    }

    /**
     *
     * @param Moneda
     * @return
     */
    public int PosicionMoneda(String Moneda) {
        int ResultadoPosicion = 0;

        for (int i = 0; i <= 1; i++) {

            if (Descripciones_monedas[i].equals(Moneda)) {
                ResultadoPosicion = i;
                break;
            }
        }
        return ResultadoPosicion;
    }

    /**
     * Getters y Setters
     *
     * @return
     */
    public Double[][] getTabla_conversiones() {
        return Tabla_conversiones;
    }

    public void setTabla_conversiones(Double[][] tabla_conversiones) {
        Tabla_conversiones = tabla_conversiones;
    }
}
