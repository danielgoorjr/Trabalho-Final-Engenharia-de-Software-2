import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoDePagamento;
    private double precoPizzas=0;
    private double taxaDeEntrega=0;
    private double precoTotal=0; 
    private Date data = new Date();
    private ArrayList<Pizza> pizzas = new ArrayList();
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    void setTipoDePagamento(String tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }
    
    void setTaxaDeEntrega(double taxa){
        taxaDeEntrega = taxa;
    }
    
    String getNome(){
        return nome;
    }
    
    String getEndereco(){
        return endereco;
    }
    
    String getTelefone(){
        return telefone;
    }
    
    String getTipoDePagamento(){
        return tipoDePagamento;
    }
      
    double getTaxaDeEntrega(){
        return taxaDeEntrega;
    }
    
    double getPrecoPizzas(){
        return precoPizzas;
    }
        
    double getPrecoTotal(){
        return precoTotal;
    }
    
    Date getData(){
        return data;
    }
    
    boolean addPizza(Pizza pizza){
        return pizzas.add(pizza);
    }
    
    boolean removePizza(Pizza pizza){
        return pizzas.remove(pizza);
    }
    
    boolean removePizza(int indece){
        return pizzas.remove(pizzas.get(indece));
    }
    
    boolean alteraPizza(Pizza pizza){
        if(pizzas.contains(pizza)){
            pizzas.add(pizzas.indexOf(pizza),pizza);
            return true;
        }
        return false;
    }
    
    boolean consultarPizza(Pizza pizza){
        return pizzas.contains(pizza);
    }
    
    Pizza consultarPizza(String nome){
        for(Pizza p : pizzas){
            if(p.getNome().equalsIgnoreCase(nome))
                return p;
        }
        return null;
    }
    
    Pizza consultarPizza(int codigo){
        for(Pizza p : pizzas){
            if(p.getCodigo()==codigo)
                return p;
        }
        return null;
    }
    
    ArrayList<Pizza> getTodosPizzas(){
        return pizzas;
    }
    
    void fecharPedido(){
        precoPizzas = 0;
        for(Pizza p : pizzas)
            precoPizzas += p.getPreco();
        precoTotal = precoPizzas+ taxaDeEntrega;
        data = new Date();
    }
    
    void mostrarPedido(){
        System.out.println("        Data: "+ data);
        System.out.println("        Nome: "+ nome);
        System.out.println("        Endereço: "+ endereco);
        System.out.println("        Telefone: "+ telefone);
        System.out.print("        Pedido: ");
        for(Pizza pizza: pizzas)
            System.out.print(pizza.getNome()+"; ");
        System.out.println();
        System.out.println("        Tipo de Pagamento: "+ tipoDePagamento);
        System.out.println("        Taxa de Entrega: "+ taxaDeEntrega);
        System.out.println("        Preço das Pizzas: "+ precoPizzas);
        System.out.println("        Total: "+ precoTotal);
    }
}
