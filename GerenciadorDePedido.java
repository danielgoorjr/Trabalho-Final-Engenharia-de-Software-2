import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GerenciadorDePedido {
    private  ArrayList<Pedido> pedidos = new ArrayList();
    
    boolean addPedido(Pedido pedido){
        return pedidos.add(pedido);
    }
    
    boolean removePedido(Pedido pedido){
        return pedidos.remove(pedido);
    }
      
    boolean alterarPedido(Pedido pedido){
        if(pedidos.contains(pedido)){
            pedidos.remove(pedido);
            pedidos.add(pedido);
            return true;
        }
        return false;
    }
    
    boolean consultarPedido(Pedido pedido){
        return pedidos.contains(pedido);
    }
    
    ArrayList<Pedido> consultarPedido(String telefone){
        ArrayList<Pedido> listaPedidos = new ArrayList();
        for(Pedido p : pedidos){
            if(p.getTelefone().equalsIgnoreCase(telefone))
                listaPedidos.add(p);
        }
        return listaPedidos;
    }
        
    ArrayList<Pedido> getTodosPedido(){
        return pedidos;
    }
    
    Pedido consultarUltimoPedido(String telefone){
        Pedido UltimoPedidos = new Pedido();
        for(Pedido p : pedidos){
            if(p.getTelefone().equalsIgnoreCase(telefone))
                UltimoPedidos=p;
        }
        return UltimoPedidos;
    }
}
