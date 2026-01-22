package ejemplo.com;

import java.util.Scanner;

public class DiasSemana2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int mes = sc.nextInt();
    switch (mes) {
      case 1:// ponemos los casos
        System.out.println(" El dia equivalente es Lunes");
        break;
      case 2:
        System.out.println(" El dia equivalente es Martes");
        break;
      case 3:
        System.out.println(" El dia  equivalente es Miercoles");
        break;

      case 4:
        System.out.println(" El dia equivalente es Jueves");
        break;

      case 5:
        System.out.println(" El dia equivalente es Viernes");
        break;

      case 6:
        System.out.println(" El dia equivalente es Sabado");
        break;
      case 7:
        System.out.println(" El dia equivalente es Domingo");
        break;
      default:// si no es ninguno de los casos anteriores
        System.out.println("dia introducido no valido");
        break;
    }
    sc.close();
  }
}
