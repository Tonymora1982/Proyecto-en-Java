
/**
 * @since 14 Agosto
 * @version 3.0
 * @author Anthony Mora Parra
 * @Universidad Estatal a Distancia
 * @Curso Programacion Intermedia
 */
public class Equivalencias_Nuevas extends Equivalencias {

    static int CantidadRegistrada = 0;

    public Equivalencias_Nuevas() {
    }

    /**
     * Metodo que permite agregar una nueva Moneda, por default el boleano
     * (false) hasta que en el (for) se realize una moneda ingresada En el (else
     * if) verifica que no haya alguna moneda con el mismo nombre de en el Array
     * (Descripciones_monedas) En el (else) actualiza el nomre, precio compra y
     * precio venta de las monedas
     *
     * @param Nombre
     * @param PrecioCompra
     * @param PrecioVenta
     * @return
     */
    public boolean Agregar_Nueva_Equivalencia(String Nombre, Double PrecioCompra, Double PrecioVenta) {
        boolean resultado = false;
        for (int i = 0; i <= CantidadRegistrada; i++) {
            if (CantidadRegistrada == 0) {
                Descripciones_monedas[CantidadRegistrada] = Nombre;
                this.Tabla_conversiones[CantidadRegistrada][0] = PrecioCompra;
                this.Tabla_conversiones[CantidadRegistrada][1] = PrecioVenta;
                CantidadRegistrada++;
                resultado = true;
                break;
            } else {
                if (Descripciones_monedas[i].equals(Nombre)) {
                    // Aqui no guarda nada //
                    resultado = false;
                    break;

                    // Aqui asigna nuevos valores en Nombre, Precio Compra y Precio Venta //
                } else {
                    Descripciones_monedas[CantidadRegistrada] = Nombre;
                    this.Tabla_conversiones[CantidadRegistrada][0] = PrecioCompra;
                    this.Tabla_conversiones[CantidadRegistrada][1] = PrecioVenta;
                    CantidadRegistrada++;
                    resultado = true;
                    break;

                }
            }

        }

        return resultado;
    }

    /**
     *
     * @param Nombre
     * @param PrecioCompra
     * @param PrecioVenta
     * @return
     */
    public boolean Actualizar_Valores_Equivalencias(String NombreActualizado, Double PrecioCompra, Double PrecioVenta) {
        boolean mensaje = true;
        boolean validacion = false;
        int contador = 0;
        while (validacion == false) {
            if (Descripciones_monedas[contador].equals(NombreActualizado)) {
                this.Tabla_conversiones[contador][0] = PrecioCompra;
                this.Tabla_conversiones[contador][1] = PrecioVenta;
                mensaje = true;
                validacion = true;
                break;
            } else {
                mensaje = false;
            }
            contador++;
        }
        return mensaje;

    }

    /**
     *
     * @return
     */
    public String[] ListarMonedas() {
        String[] ResultadosMonedas = new String[CantidadRegistrada];
        if (CantidadRegistrada != 0) {
            //cambio en la condicion
            for (int i = 0; i < CantidadRegistrada; i++) {
                ResultadosMonedas[i] = Descripciones_monedas[i];
            }
        }

        return ResultadosMonedas;
    }

    /**
     *
     * @return
     */
    public String[] ListarMonedaCompleto() {
        String[] ResultadosMonedas = new String[CantidadRegistrada];
        if (CantidadRegistrada != 0) {
            //cambio en la condicion
            for (int i = 0; i < CantidadRegistrada; i++) {
                ResultadosMonedas[i] = Descripciones_monedas[i] + " " + Tabla_conversiones[i][0] + " " + Tabla_conversiones[i][1] + "\n";
                //ResultadosMonedas[i] = Descripciones_monedas[i];
            }
        }

        return ResultadosMonedas;
    }

    /**
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double CompraDolares(Double MontoDolares, String NombreMoneda) {
        Double PrecioCompra = 0.0;
        int PosicionMoneda = PosicionMoneda(NombreMoneda);
        PrecioCompra = Tabla_conversiones[PosicionMoneda][1];
        Double ResultadoCompra = MontoDolares * PrecioCompra(NombreMoneda);
        return ResultadoCompra;
    }

    /**
     *
     * @param Moneda
     * @return
     */
    public int PosicionMoneda(String Moneda) {
        int ResultadoPosicion = 0;

        for (int i = 0; i < CantidadRegistrada; i++) {

            if (Descripciones_monedas[i].equals(Moneda)) {
                ResultadoPosicion = i;
                break;
            }
        }
        return ResultadoPosicion;
    }

    /**
     *
     * @param MontoDolares
     * @param NombreMoneda
     * @return
     */
    public Double VentaDolares(Double MontoDolares, String NombreMoneda) {
        Double PrecioMoneda = 0.0;
        int PosicionMoneda = PosicionMoneda(NombreMoneda);
        PrecioMoneda = Tabla_conversiones[PosicionMoneda][0];
        return PrecioMoneda;
    }
}
