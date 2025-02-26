package Delivery;

public class Pedidos {
    private String codigo;
    private Produtos produto;
    private Status status;

    public Pedidos(String codigo, Produtos produto, Status status) {
        this.codigo = codigo;
        this.produto = produto;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public Produtos getProduto() {
        return produto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido " + codigo + " - Produto " + produto.toString() + " - Status: " + status;
    }
}
