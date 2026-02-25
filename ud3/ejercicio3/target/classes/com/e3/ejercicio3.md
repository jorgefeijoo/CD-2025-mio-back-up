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
    -String tipo
    }
    
   


    class ArtigoCientifico{
   -String titulo
   -String tema
   -String tipo
+String obtenerResumenCorto() 
+boolean validarLongitud() 
  
    }

    class Autor{
    -String nombreCompleto
    -String email
    }

    

Conferencia "1" *-- "1..*" Sesions
    
    
    Participantes "1..*" -- "1" Conferencia
    Participantes "1..*" -- "1..*" Sesions
    ArtigoCientifico "1..*" -- "1" Sesions
    Autor "1" -- "1..*" ArtigoCientifico

    
```