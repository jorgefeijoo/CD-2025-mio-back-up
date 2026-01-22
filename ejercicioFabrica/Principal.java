public class Principal {
    public static void main(String[] args) {
      // crear 3 clientes
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
// cada un realiza e elimina un pedido
    c1.realizarPedido();
    c2.realizarPedido();
    c3.realizarPedido();

    c1.eliminarPedido();
    c2.eliminarPedido();
    c3.eliminarPedido();
    }
}
