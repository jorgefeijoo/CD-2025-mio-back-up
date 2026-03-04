package ud4;

/**
 * Clase que obten el radio,el diametro,la circunferencia y el area de un circulo mediante x e y
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;
/**
 * Se crea el circulo con sus dos valores y su radio
 * @param valorX Valor x del circulo
 * @param valorY Valor y del ciirculo
 * @param valorRadio Valor del radio del circulo
 */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Este metodo establece el metodo de X
     * @param valorX Establece el valor X
     */

    public void establecerX(int valorX) {
        x=valorX;
    }
    /**
     * 
     * @return Devuelve el valor X
     */

    public int obtenerX() {
        return x;
    }

    /**
     * 
     * @param valorY Establece el valor de Y
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * 
     * @return Devuelve el valor de Y
     */
    public int obtenerY() {
        return y;
    }
/**
 * Metodo para establecer el valor del radio
 * @param valorRadio Asegura que el radio no sea negativo
 */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * 
     * @return Devuelve el valor del radio
     */
    public double obtenerRadio() {
        return radio;
    }
/**
 * @return Devuelve el valor del diametro
 */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * 
     * @return Devuelve el valor de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
/**
 * 
 * @return Devuelve el valor del area
 */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Creamos o constructor que devuelve el centro de la circunferencia
     * @return Devuelve el valor del centro del circulo
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}

