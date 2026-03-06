package ud4.javadoc;
/**
 * La clase persona proporciona unos metodos para imprimir un nombre y una edad de una persona
 */
public class Persona {
    private String nombre;
    private int edad;

    /**
     * Construye una nueva persona con un nombre y una edad
     * @param nombre El nombre de la persona 
     * @param edad La edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * Obtiene el valor de nombre de la persona 
 * @return  Devuelve el nombre de la persona
 */
    public String getNombre() {
        return nombre;
    }
/**
 *  
 * @param nombre Establece el nombre de la persona
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Obtiene el valor de la edad de la persona
 * @return Devuelve la edad de la persona
 */
    public int getEdad() {
        return edad;
    }



 /**
 * Establece la edad de la persona 
 * @param edad  Establece la edad de la persona 
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * Imprime el nombre y la edad de la persona 
 */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
     
