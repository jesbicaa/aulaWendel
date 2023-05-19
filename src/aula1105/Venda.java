package aula1105;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private String dataVenda;
    private String formaPagamento;
    private double valorTotal;
    private Cliente cliente;
    private List<Produto> listaProdutos;
    
    public Venda(){
        this.listaProdutos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
    
    public void addProduto(Produto p){
    //adicionar o produto p na listaProdutos
        this.listaProdutos.add(p);
        this.calcularValorTotal(); 
    }

    public void calcularValorTotal(){
        // soma o valor total da compra
        this.valorTotal = 0;
        for(Produto p : this.listaProdutos){
            double valorProdutoAtual = p.getValor() * p.getQuantidade();
            this.valorTotal += valorProdutoAtual;
        }
    }
    
    
}
