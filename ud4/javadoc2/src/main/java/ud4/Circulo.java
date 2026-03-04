package ud4;

/**
 * clase que obten el radio,el diametro,la circunferencia y el area de un circulo mediante x e y
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;
/**
 * Se crea el circulo con sus dos valores y su radio
 * @param valorX valor x del circulo
 * @param valorY valor y del ciirculo
 * @param valorRadio valor del radio del circulo
 */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Este metodo establece el metodo de X
     * @param valorX establece el metodo X
     */

    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obtenerX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}

