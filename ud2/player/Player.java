import java.util.HashSet;
import java.util.Set;

public class Player {
  // creamos os atributos de instancia
  public String username;
  public String password;
  public String email;
  public Set<String> games;

  // creamos o constructor por defecto
  public Player() {
    games = new HashSet<>();
  }

  // creamos o constructor
  public Player(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
    games = new HashSet<>();
  }

  // creamos os metodos
  public void Comprar(String x) {
    games.add(x);
    System.out.println("O xogo que estas comprando e: " + x);
  }

  public void Vender(String nomeV) {
    games.remove(nomeV);
    System.out.println("O xogo que estas vendendo e: " + nomeV);
  }

}
