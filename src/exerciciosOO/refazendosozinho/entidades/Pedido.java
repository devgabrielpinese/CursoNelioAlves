package exerciciosOO.refazendosozinho.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item) {
        itens.add(item);
    }

    public void removeItem(ItemPedido item) {
        itens.remove(item);
    }
    public Double total(){
        double soma=0;
        for (ItemPedido i:itens             ) {
            soma+= i.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("momento pedido: "+momento+"\n ");
        sb.append("status pedido: "+status+"\n");
        sb.append("cliente pedido: "+cliente+"\n");
        sb.append("itens do pedido: ");
        for (ItemPedido i : itens) {
            sb.append(i.toString()+"\n");

        }
        sb.append("total: "+String.format("%.2f",total()));

        return sb.toString();
    }
}
