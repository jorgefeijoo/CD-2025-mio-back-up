package udcuatro;

/**
 * Clase que obten el radio, el diametro, la circunferencia y el area de un
 * circulo mediante x e y.
 */

public class Circulo {
    private int x;
    private int y;
    private double radio;

    /**
     * Se crea el circulo con sus dos valores y su radio.
     * * @param valorX     Valor x del circulo
     * @param valorY     Valor y del ciirculo
     * @param valorRadio Valor del radio del circulo
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Este metodo establece el valor de X.
     * * @param valorX Establece el valor X
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Obtiene el valor de X.
     *
     * @return Devuelve el valor X
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece el valor de Y.
     *
     * @param valorY Establece el valor de Y
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Obtiene el valor de Y.
     *
     *@return Devuelve el valor de Y
     */
    public int obtenerY() {
        return y;
    }

    /**
     *Metodo para establecer el valor del radio.
     * * @param valorRadio Asegura que el radio no sea negativo
     */
    public void establecerRadio(double valorRadio) {
        radio = valorRadio < 0.0 ? 0.0 : valorRadio;
    }

    /**
     * Obtiene el valor del radio.
     * * @return Devuelve el valor del radio
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Obtiene el valor del diametro.
     * * @return Devuelve el valor del diametro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Obtiene la circunferencia.
     * * @return Devuelve el valor de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Obtiene el valor del area.
     * * @return Devuelve el valor del area
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Creamos el constructor que devuelve el centro de la circunferencia.
     * * @return Devuelve el valor del centro del circulo
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
