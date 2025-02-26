package Delivery;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresas empresa = new Empresas();

        Produtos produto1 = new Produtos("Luva Pulser 14oz", 300.0);
        Produtos produto2 = new Produtos("Caneleira Pulser Tam M", 259.99);
        Produtos produto3 = new Produtos("Atadura Pulser 5M elástica",60.0);
        Produtos produto4 = new Produtos("Protetor Bucal", 70);

        Pedidos pedido1 = new Pedidos( "1", produto1, Status.Pendente);
        Pedidos pedido2 = new Pedidos( "2", produto2, Status.EmRota);
        Pedidos pedido3 = new Pedidos( "3", produto3, Status.Entregue);
        Pedidos pedido4 = new Pedidos( "4", produto4, Status.Cancelado);

        empresa.addPedido(pedido1);
        empresa.addPedido(pedido2);
        empresa.addPedido(pedido3);
        empresa.addPedido(pedido4);

        System.out.println("Digite o codigo do pedido: ");
        String codigoPedido = sc.nextLine();

        Pedidos pedidoEncontrado = empresa.buscarPedido(codigoPedido);
        if (pedidoEncontrado != null) {
            System.out.println("Pedido: " + pedidoEncontrado);
        } else
            System.out.println("Pedido nao encontrado");
    }
}
