package ud4;

import java.text.DecimalFormat;

    /**
     * Clase principal para probar la clase circulo y mostrar los resultados obtenidos de cada uno de sus metodos
    */
public class Main {
    /**.
    * Metodo principal para mostrar los resultados obtenidos de cada uno de los metodos del circulo
    * @param args
    */
    public static void main(String[] args) {
        
         /**.
         * creamos un objeto circulo y se le da unos valores a los atributos
         */
        Circulo circulo = new Circulo(37 , 43 , 2.5);
        /**.
         * variables para mostrar los resultados obtenidos de los metodos del circulo para mostrar el resultado de cada uno de ellos
         */
        String salida =
                "La coordenada X es " + circulo.obtenerX()
                +
                "\nLa coordenada Y es " + circulo.obtenerY()
                +
                "\nEl radio es " + circulo.obtenerRadio();
                /**.
                 * usamos los metodos para establecerle unos nuevos valores a los atributos del circulo y 
                 * mostrar el resultado de cada uno de ellos
                 */
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);
        salida += "\n\nLa nueva ubicación y el radio de círculo son\n" + circulo.toString();
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida += "\nEl diámetro es " + dosDigitos.format(circulo.obtenerDiametro());
        salida += "\nLa circunferencia es " + dosDigitos.format(circulo.obtenerCircunferencia());
        salida += "\nEl área es " + dosDigitos.format(circulo.obtenerArea());
        System.out.println(salida);
        System.exit(0);
    }
}

