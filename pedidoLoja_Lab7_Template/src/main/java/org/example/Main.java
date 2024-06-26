package org.example;

public class Main {


    public static void main(String[] args) {
        PedidoTemplate pedido1 = new PedidoOnline(3, 10.0, "Cartão de Crédito");
        pedido1.processarPedido();

        System.out.println();

        PedidoTemplate pedido2 = new PedidoNaLoja(2, 15.0, "Dinheiro");
        pedido2.processarPedido();

        System.out.println();

        PedidoTemplate pedido3 = new PedidoCriptomoedas(1, 20.0, "Bitcoin");
        pedido3.processarPedido();
    }
}

//O padrão Template define o esqueleto de um algoritmo, deixando para as subclasses 
//a implementação de certos passos, enquanto o Decorator adiciona novas funcionalidades
//a objetos existentes em tempo de execução sem alterar sua estrutura.
