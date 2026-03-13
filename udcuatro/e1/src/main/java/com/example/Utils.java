package com.example;

/**
 * Clase de utilidades generales para operaciones con cadenas y cálculos.
 */
public class Utils {

  /**
 * Concatena dos cadenas y valida su contenido.
     *
     * @param a Primera cadena de texto.
     * @param b Segunda cadena de texto.
     * @return La cadena concatenada o null si alguna entrada es nula.
     */
  public static String doStuff(String a, String b) {
    if (a == null || b == null) {
      return null;
    }

    String r = a + b;
    if (r.length() > 120) {
      System.out.println("too long: " + r);
    }

    try {
      if (a.trim().equals("") || b.trim().equals("")) {
        throw new RuntimeException("bad");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return r;
  }

  /**
     * Realiza un cálculo matemático predeterminado.
     *
     * @param a Primer operando.
     * @param b Segundo operando.
     */
  public static void calc(int a, int b) {
    int res = a * b + 42;
    System.out.println("res = " + res);
  }

  /**
* Método de demostración sin uso actual.
*/
  public void unusedMethod() {
    int i = 0;
    i = i + 1;
  }
}