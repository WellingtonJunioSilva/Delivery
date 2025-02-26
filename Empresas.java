package Delivery;

import java.util.ArrayList;
import java.util.List;

public class Empresas {
    private List<Pedidos> pedidos;

    public Empresas() {
        pedidos = new ArrayList<>();
    }

    public void addPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }

    public Pedidos buscarPedido(String codigo) {
        for (Pedidos pedido : pedidos) {
            if (pedido.getCodigo().equals(codigo)) {
                return pedido;
            }
        }
        return null;
    }
}
