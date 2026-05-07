package com.example;

import java.util.ArrayList;

public class CarrinhoCompra {
private ArrayList<Produto> carrinho = new ArrayList<>();

public void engadirProduto(Produto p1){
    carrinho.add(p1);
}

public void eliminarProduto(Produto p1){
    carrinho.remove(p1);
}

public int getNumeroProdutos(){
    return carrinho.size();
}

public double calcularTotal(){
    double total = 0;
    for (Produto productos: carrinho) {
        total= total + productos.getPrezo();
    }
    return total;
}

}
