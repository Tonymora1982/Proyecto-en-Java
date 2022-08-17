
/**
 * @since 14 Agosto
 * @version 3.0
 * @author Anthony Mora Parra
 * @Universidad Estatal a Distancia
 * @Curso Programacion Intermedia
 */
public class Conversion_Nueva extends Conversion {

    private static Equivalencias_Nuevas equivalencias = new Equivalencias_Nuevas();

    /**
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double CompraDolaresC(Double MontoDolares, String NombreMoneda) {

        Double ResultadoCashBack = this.CompraDolares(MontoDolares, NombreMoneda);

        if (MontoDolares >= 3000 && MontoDolares <= 6000) {
            Double Compra = ResultadoCashBack;
            Double Venta = this.VentaDolaresC(MontoDolares, NombreMoneda);
            Double ResultadoDiferencia = Venta - Compra;
            Double ResultadoPorcentaje = ResultadoDiferencia * 0.15;
            ResultadoCashBack += ResultadoPorcentaje;

        } else if (MontoDolares >= 6000 && MontoDolares <= 9000) {
            Double Compra = ResultadoCashBack;
            Double Venta = this.VentaDolaresC(MontoDolares, NombreMoneda);
            Double ResultadoDiferencia = Venta - Compra;
            Double ResultadoPorcentaje = ResultadoDiferencia * 0.25;
            ResultadoCashBack += ResultadoPorcentaje;
        } else {
            Double Compra = ResultadoCashBack;
            Double Venta = this.VentaDolaresC(MontoDolares, NombreMoneda);
            Double ResultadoDiferencia = Venta - Compra;
            Double ResultadoPorcentaje = ResultadoDiferencia * 0.35;
            ResultadoCashBack += ResultadoPorcentaje;
        }

        return ResultadoCashBack;
    }

    /**
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double VentaDolaresC(Double MontoDolares, String NombreMoneda) {

        Double ImpuestoVenta = this.CompraDolares(MontoDolares, NombreMoneda);

        if (MontoDolares >= 3000 && MontoDolares <= 6000) {
            Double Venta = ImpuestoVenta * 1.0;
            ImpuestoVenta += Venta;

        } else if (MontoDolares >= 6000 && MontoDolares <= 9000) {
            Double Venta = ImpuestoVenta * 2.0;
            ImpuestoVenta += Venta;
        } else {
            Double Venta = ImpuestoVenta * 3.0;
            ImpuestoVenta += Venta;
        }

        return ImpuestoVenta;

    }

    public boolean Agregar_Nueva_EquivalenciaC(String Nombre, Double PrecioCompra, Double PrecioVenta) {
        return this.Agregar_Nueva_Equivalencia(Nombre, PrecioCompra, PrecioVenta);
    }

    public boolean Actualizar_Valores_EquivalenciasC(String NombreActualizado, Double PrecioCompra, Double PrecioVenta) {
        return this.Actualizar_Valores_Equivalencias(NombreActualizado, PrecioCompra, PrecioVenta);
    }

    public String[] ListarMonedasC() {
        return this.ListarMonedas();
    }

    public String[] ListarMonedaCompletoC() {
        return this.ListarMonedaCompleto();
    }

}
