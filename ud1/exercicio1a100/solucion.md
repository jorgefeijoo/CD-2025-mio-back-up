# Compilar en python

Creas un archivo Python con el siguiente contenido:

```python
   
   for i in range(1, 101):
    print(i)

    Una vez tienes esto llegas a la carpeta donde tienes el archivo y pones

    python3 nombre del archivo.py
```
# Compilar en java 

Creas un archivo java con el siguiente contenido:

```java
public class NumerosNaturales {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
        }
    }
}
Una vez tienes esto abres la carpeta en la que esta en la terminal usando cd en este caso 

cd exercicio1a100 

y una vez haces eso para compilar haces 
javac nombre del archivo + la extensión en este caso

javac NumerosNaturales.java

y para ejecutar tienes que hacer java mas el nombre del archivo en este caso

java NumerosNaturales
```
# Compilar en C

Creas un archivo C con el siguiente contenido :

```C
#include <stdio.h>

int main() {
    for (int i = 1; i <= 100; i++) {
        printf("%d\n", i);
    }
    return 0;
}
Una vez tienes esto tienes que compilar el archivo para eso tienes que tener gcc instalado si no haces sudo apt install gcc para compilar el archivo tines que hacer :

gcc nombre del archivo.c -o nombre sin la extension

y para ejecutarlo tienes que poner 

./exercicio para poder ejecutarlo


