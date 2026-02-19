```mermaid
classDiagram
  

    class Conferencia{
    -String nombre
    -String descripcion
    -date data
    -date hora

    +void agregarSes() 
    +boolean registrarParticipante()

    }

    class Sesions{
    -String titulo
    -String codigoSala
    +void asignarArticulo()
    +boolean cambiarSala()
    }
    
    
    class Participantes{
    -String orador
    -String publico
    }
    
   


    class ArtigoCientifico{
   -String titulo
   -String tema
   -String corto
   -String largo
   +String obtenerResumenCorto() 
+boolean validarLongitud() 
  
    }

    class Autor{
    -String nombreCompleto
    -String email
    }

    


    Conferencia "1" --"1..*" Sesions
    Sesions "1"--"1" Conferencia
    Participantes "1..*" -- "1" Conferencia
    ArtigoCientifico "1..*"-- "1" Sesions
    Autor "1"--"1..* " ArtigoCientifico

    
```