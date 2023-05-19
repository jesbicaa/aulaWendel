package aula1105;


public class Aula1105 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Leonardo Cezarino");
        c1.setCpf("32178654-88");
        
        Endereco e1 = new Endereco();
        e1.setRua("Rua Brasil");
        e1.setNumero("123");
        e1.setCidade("Mombuca");
        e1.setBairro("Centro");
        
        c1.setEndereco(e1);
        
        System.out.println(c1.getNome());
        System.out.println( c1.getEndereco().getCidade());
        
        Produto p1 = new Produto();
        p1.setNome("Coca-cola Lata");
        p1.setValor(4.5);
        p1.setQuantidade(2);
        
        Produto p2 = new Produto();
        p2.setNome("Salgado");
        p2.setValor(5);
        p2.setQuantidade(3);
        
        Venda v = new Venda();
        v.setId(1);
        v.setDataVenda("11/05/2023");
        v.setFormaPagamento("Dinheiro");
        v.setCliente(c1);
        
        //add os produtos
        v.addProduto(p1);
        
        System.out.println(v.getValorTotal());
        
        v.addProduto(p2);
        
        System.out.println(v.getValorTotal());
        
        Produto p3 = new Produto();
        p3.setNome("Bala");
        p3.setValor(0.15);
        p3.setQuantidade(30);
        
        v.addProduto(p3);
        
        System.out.println(v.getValorTotal());
    }
    
}
