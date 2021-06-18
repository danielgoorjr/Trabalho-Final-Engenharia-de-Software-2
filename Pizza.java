import java.util.ArrayList;

public class Pizza {
    private String nome;
    private int codigo;
    private double preco;
    private int calorias;
    private ArrayList<Ingrediente> ingredientes = new ArrayList();
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    void setPreco(double preco){
        this.preco = preco;
    }
    
    String getNome(){
        return nome;
    }
    
    int getCodigo(){
        return codigo;
    }
    
    double getPreco(){
        return preco;
    }
    
    boolean addIgredientes(Ingrediente igrediente){
        for(Ingrediente antIgr : ingredientes)
            if(igrediente.getNome().equalsIgnoreCase(antIgr.getNome()))
                return false;
        return ingredientes.add(igrediente);
    }
    
    boolean consultarIngrediente(Ingrediente ingrediente){
        return ingredientes.contains(ingrediente);
    }
    
    Ingrediente consultarIngrediente(String nome){
        for(Ingrediente p : ingredientes){
            if(p.getNome().equalsIgnoreCase(nome))
                return p;
        }
        return null;
    }    
    
    ArrayList<Ingrediente> getTodosIgredientes(){
        return ingredientes;
    }
    
    boolean removerIngrediente(Ingrediente ingrediente){
        return ingredientes.remove(ingrediente);
    }
    
    double custo(){
        double custo=0;
        for(Ingrediente ingrediente : ingredientes ){
            custo += ingrediente.getPrecoPorPorção();
        }
        return custo;
    }
}
