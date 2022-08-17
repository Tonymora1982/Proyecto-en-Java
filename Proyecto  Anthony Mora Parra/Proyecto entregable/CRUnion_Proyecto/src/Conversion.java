/**
 * @since 14 Agosto
 * @version 3.0
 * @author Anthony Mora Parra
 * @Universidad Estatal a Distancia
 * @Curso Programacion Intermedia
 */

public class Conversion {

    /**
     * Instanciacion de la Clase Equivalencias
     */
    private static Equivalencias_Nuevas equivalencias_nuevas = new Equivalencias_Nuevas();

    /**
     * Metodo que recibe dos valores por parametro para calcular el precio de
     * compra de una moneda con respecto al $Dolar Almacena en la variable
     * ResultadoCompra la multiplicacion de la cantidad de dolares ingresado por
     * el usuario X el precio - Compra de la moneda almacenado en la matriz
     * Tabla_conversiones.
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double CompraDolares(Double MontoDolares, String NombreMoneda) {
        return equivalencias_nuevas.CompraDolares(MontoDolares, NombreMoneda);
    }

    /**
     * Metodo que recibe dos valores por parametro para calcular el precio de
     * venta de una moneda con respecto al $Dolar Almacena en la variable
     * ResultadoVenta la multiplicacion de la cantidad de dolares ingresado por
     * el usuario X el precio - Venta de la moneda almacenado en la matriz
     * Tabla_conversiones.
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double VentaDolares(Double MontoDolares, String NombreMoneda) {
        return equivalencias_nuevas.VentaDolares(MontoDolares, NombreMoneda);
    }

    public boolean Agregar_Nueva_Equivalencia(String Nombre, Double PrecioCompra, Double PrecioVenta) {
        return equivalencias_nuevas.Agregar_Nueva_Equivalencia(Nombre, PrecioCompra, PrecioVenta);
    }

    public boolean Actualizar_Valores_Equivalencias(String NombreActualizado, Double PrecioCompra, Double PrecioVenta) {
        return equivalencias_nuevas.Actualizar_Valores_Equivalencias(NombreActualizado, PrecioCompra, PrecioVenta);
    }

    public String[] ListarMonedas() {
        return equivalencias_nuevas.ListarMonedas();
    }

    public String[] ListarMonedaCompleto() {
        return equivalencias_nuevas.ListarMonedaCompleto();
    }

}
