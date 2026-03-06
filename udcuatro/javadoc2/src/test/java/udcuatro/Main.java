package udcuatro;

import java.text.DecimalFormat;

/**
 * Clase principal para probar la clase circulo y mostrar los resultados
 * obtenidos de cada uno de sus metodos.
 */
public final class Main {

    private static final int X_INICIAL = 37;
    private static final int Y_INICIAL = 43;
    private static final double RADIO_INICIAL = 2.5;
    private static final int X_NUEVO = 35;
    private static final int Y_NUEVO = 20;
    private static final double RADIO_NUEVO = 4.2;

    /**
     * Constructor privado para evitar que la clase de utilidad sea instanciada.
     */
    private Main() {
        // Se deja vacío intencionadamente
    }

    /**
     * Metodo principal para mostrar los resultados obtenidos de cada uno de los
     * metodos del circulo.
     *
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        /*
         * Creamos un objeto circulo y se le da unos valores a los atributos.
         */
        Circulo circulo = new Circulo(X_INICIAL, Y_INICIAL, RADIO_INICIAL);

        /*
         * Variables para mostrar los resultados obtenidos de los metodos del circulo
         * para mostrar el resultado de cada uno de ellos.
         */
        String salida = "La coordenada X es " + circulo.obtenerX()
                + "\nLa coordenada Y es " + circulo.obtenerY()
                + "\nEl radio es " + circulo.obtenerRadio();

        /*
         * Usamos los metodos para establecerle unos nuevos valores a los atributos del
         * circulo y mostrar el resultado de cada uno de ellos.
         */
        circulo.establecerX(X_NUEVO);
        circulo.establecerY(Y_NUEVO);
        circulo.establecerRadio(RADIO_NUEVO);

        salida += "\n\nLa nueva ubicación y el radio de círculo son\n"
                + circulo.toString();
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida += "\nEl diámetro es "
                + dosDigitos.format(circulo.obtenerDiametro());
        salida += "\nLa circunferencia es "
                + dosDigitos.format(circulo.obtenerCircunferencia());
        salida += "\nEl área es "
                + dosDigitos.format(circulo.obtenerArea());
        System.out.println(salida);
        System.exit(0);
    }
}
