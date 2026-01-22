public class TestPlayer {
    public static void main(String[] args) {
        Player p1 = new Player("Pudelko", "Iniesta8", "Pudelkito@gmail.com");
        System.out.println("O username es: " + p1.username);
        System.out.println("A contraseña do usuario: " + p1.password);
        System.out.println("O email de " + p1.username + " e " + p1.email);
        p1.Comprar("FIFA14");
        p1.Vender("clash royale");
        System.out.println(" ");

        Player p2 = new Player("luwawu", "Tonecho2007", "luwawu@paraninfo.es");
        System.out.println("O username es: " + p2.username);
        System.out.println("A contraseña do usuario: " + p2.password);
        System.out.println("O email de " + p2.username + " e " + p2.email);

        p2.Comprar("GTAV");
        p2.Vender("Call of duty");

    }
}
