import java.util.ArrayList;
public class Cardapio {
    private ArrayList<Pizza> pizzas = new ArrayList();
    private ArrayList<Ingrediente> ingredientes = new ArrayList();
    
    boolean addPizza(Pizza pizza){
        for(Pizza p : pizzas)
            if (p.getNome().equalsIgnoreCase(pizza.getNome())){
                return false;
            }
        pizzas.add(pizza);
        return true;
    }
    
    boolean removePizza(Pizza pizza){
        return pizzas.remove(pizza);
    }
      
    boolean alterarPizza(Pizza pizza){
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
    
    boolean addIngrediente(Ingrediente ingrediente){
        for(Ingrediente p : ingredientes)
            if (p.getNome().equalsIgnoreCase(ingrediente.getNome())){
                return false;
            }
        ingredientes.add(ingrediente);
        return true;
    }
    
    boolean removeIngrediente(Ingrediente ingrediente){
        return ingredientes.remove(ingrediente);
    }
      
    boolean alterarIngrediente(Ingrediente ingrediente){
        if(ingredientes.contains(ingrediente)){
            ingredientes.add(ingredientes.indexOf(ingrediente),ingrediente);
            return true;
        }
        return false;
    }
    
    boolean consultarIngrediente(Ingrediente ingrediente){
        return ingredientes.contains(ingrediente);
    }
    
    Ingrediente consultarIngrediente(String nome){
        for(Ingrediente ing : ingredientes){
            if(ing.getNome().equalsIgnoreCase(nome))
                return ing;
        }
        return null;
    }   
}
