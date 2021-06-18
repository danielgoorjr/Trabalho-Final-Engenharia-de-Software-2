
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        Ingrediente ingrediente = new Ingrediente();
        Pizza p1 = new Pizza();
        
        //Cadastro dos Ingredientes
        System.out.println("Cadastrando Ingredientes");
        ingrediente.setNome("Queijo Mussarela");
        ingrediente.setQuantidadePorPorcao(300);
        ingrediente.setCaloriasPorPorcao(840);
        ingrediente.setPrecoPorPorcao(12);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Igrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Igrediente "+ingrediente.getNome()+ " não cadastrado!!");
            
        ingrediente = new Ingrediente();
        ingrediente.setNome("Tomate");
        ingrediente.setQuantidadePorPorcao(100);
        ingrediente.setCaloriasPorPorcao(18);
        ingrediente.setPrecoPorPorcao(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Igrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Igrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Molho de Tomate");
        ingrediente.setQuantidadePorPorcao(50);
        ingrediente.setCaloriasPorPorcao(15);
        ingrediente.setPrecoPorPorcao(0.4);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Linguiça Calabresa");
        ingrediente.setQuantidadePorPorcao(350);
        ingrediente.setCaloriasPorPorcao(1050);
        ingrediente.setPrecoPorPorcao(7);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = new Ingrediente();
        ingrediente.setNome("Cebola");
        ingrediente.setQuantidadePorPorcao(150);
        ingrediente.setCaloriasPorPorcao(60);
        ingrediente.setPrecoPorPorcao(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        //Alterar Igrediente
        System.out.println("Consultando/Alterando Ingrediente");
        ingrediente = cardapio.consultarIngrediente("Queijo Muçarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Mussarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Mussarela não encontrado!!");
        
        ingrediente.setNome("Queijo Muçarela");
        cardapio.alterarIngrediente(ingrediente);
        ingrediente = cardapio.consultarIngrediente("Queijo Mussarela");
        if(ingrediente==null){
            ingrediente = cardapio.consultarIngrediente("Queijo Muçarela");
            if(ingrediente!=null)
                System.out.println("    Ingrediente alterado para " +ingrediente.getNome()+ " com sucesso!!");
            else
                System.out.println("    Ingrediente Muçarela não encontrado!!");
        }
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não Alterado!!");
        
        
        //Remover Igrediente
        System.out.println("Removendo Ingrediente");
        ingrediente = new Ingrediente();
        ingrediente.setNome("Queijo Branco");
        ingrediente.setQuantidadePorPorcao(150);
        ingrediente.setCaloriasPorPorcao(60);
        ingrediente.setPrecoPorPorcao(0.6);
        if(cardapio.addIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " cadastrado com sucesso!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não cadastrado!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Branco");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Branco não encontrado!!");
        
        cardapio.removeIngrediente(ingrediente);
        if(cardapio.consultarIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " não removido!!");
        else
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " removido com sucesso!!");
        
        ingrediente = cardapio.consultarIngrediente("Queijo Branco");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Branco não encontrado!!");
        
        //Cadastro Das Pizzas
        System.out.println("Cadastrando Pizzas");
        p1.setNome("Mussarela");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Tomate"));
        p1.setPreco(30);
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        p1 = new Pizza();
        p1.setNome("Calabresa");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Cebola"));
        p1.addIgredientes(cardapio.consultarIngrediente("Linguiça Calabresa"));
        p1.setPreco(35);
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        
        //Consultar/Alterar Pizza
        System.out.println("Consultando/Alterando Pizzas");
        p1 = cardapio.consultarPizza("Muçarela");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Muçarela não encontrada!!");
        
        p1 = cardapio.consultarPizza("Mussarela");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        p1.setNome("Muçarela");
        if(cardapio.alterarPizza(p1))
            System.out.println("    Pizza alterado para "+ p1.getNome() +" com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        p1 = cardapio.consultarPizza("Mussarela");
        if(p1 != null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Mussarela não encontrada!!");
        
        p1 = cardapio.consultarPizza("Muçarela");
        if(p1 != null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Muçarela não encontrada!!");
        
        //Consultar/Remover Ingrediente da Pizza
        System.out.println("Consultando/Alterando Ingrediente Pizzas");
        
        p1 = cardapio.consultarPizza("Calabresa");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa não encontrada!!");
        System.out.print("    Ingredientes: ");
        for(Ingrediente ingr : p1.getTodosIgredientes()){
            System.out.print(ingr.getNome()+"; ");
        }
        System.out.println();
        
        ingrediente = p1.consultarIngrediente("Queijo Muçarela");
        if(ingrediente!=null)
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " encontrado com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        if(p1.removerIngrediente(ingrediente))
            System.out.println("    Ingrediente "+ingrediente.getNome()+ " removido com sucesso!!");
        else
            System.out.println("    Ingrediente Queijo Muçarela não encontrado!!");
        
        System.out.print("    Ingredientes: ");
        for(Ingrediente ingr : p1.getTodosIgredientes()){
            System.out.print(ingr.getNome()+"; ");
        }
        System.out.println();
        cardapio.alterarPizza(p1);
        if(cardapio.alterarPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" alterado com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não encontrada!!");
        
        //Remover Pizza
        System.out.println("Removendo Pizza");
        p1 = new Pizza();
        p1.setNome("Calabresa II");
        p1.addIgredientes(cardapio.consultarIngrediente("Queijo Muçarela"));
        p1.addIgredientes(cardapio.consultarIngrediente("Molho de Tomate"));
        p1.addIgredientes(cardapio.consultarIngrediente("Cebola"));
        p1.addIgredientes(cardapio.consultarIngrediente("Linguiça Calabresa"));
        if(cardapio.addPizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" cadastrada com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não cadastrada!!");
        
        p1 = cardapio.consultarPizza("Calabresa II");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa II não encontrada!!");
        
        if(cardapio.removePizza(p1))
            System.out.println("    Pizza "+ p1.getNome() +" removida com sucesso!!");
        else
            System.out.println("    Pizza "+ p1.getNome() +" não removida com sucesso!!");
        
        p1 = cardapio.consultarPizza("Calabresa II");
        if(p1!=null)
            System.out.println("    Pizza "+ p1.getNome() +" encontrada com sucesso!!");
        else
            System.out.println("    Pizza Calabresa II não encontrada!!");
        
        //Realização de Pedidos
        System.out.println("\nRealização de Pedidos");
        GerenciadorDePedido gerenPedidos = new GerenciadorDePedido();
        Pedido pedido = new Pedido();
        
        pedido.setNome("Ana");
        pedido.setEndereco("Na casa dela");
        pedido.setTelefone("123456789");
        pedido.addPizza(cardapio.consultarPizza("Muçarela"));
        pedido.addPizza(cardapio.consultarPizza("Muçarela"));
        pedido.setTaxaDeEntrega(5.5);
        pedido.setTipoDePagamento("Cartão de Debito");
        pedido.fecharPedido();
        
        if(gerenPedidos.addPedido(pedido)){
            System.out.println("    Pedido realizado com sucesso!!");
            pedido.mostrarPedido();
        }
        else
            System.out.println("    Pedido de "+ pedido.getNome() +" não realizado com sucesso!!");
        
        pedido = new Pedido();
        pedido.setNome("Daniel");
        pedido.setEndereco("Na casa dele");
        pedido.setTelefone("987654321");
        pedido.addPizza(cardapio.consultarPizza("Muçarela"));
        pedido.addPizza(cardapio.consultarPizza("Calabresa"));
        pedido.setTaxaDeEntrega(5.5);
        pedido.setTipoDePagamento("Cartão de Credito");
        pedido.fecharPedido();
        
        if(gerenPedidos.addPedido(pedido)){
            System.out.println("    Pedido realizado com sucesso!!");
            pedido.mostrarPedido();
        }
        else
            System.out.println("    Pedido de "+ pedido.getNome() +" não realizado com sucesso!!");
        
        pedido = new Pedido();
        pedido.setNome("Fabio");
        pedido.setEndereco("Na Pizzaria");
        pedido.setTelefone("543219876");
        pedido.addPizza(cardapio.consultarPizza("Calabresa"));
        pedido.addPizza(cardapio.consultarPizza("Calabresa"));
        pedido.setTaxaDeEntrega(0);
        pedido.setTipoDePagamento("Dinheiro");
        pedido.fecharPedido();
        
        if(gerenPedidos.addPedido(pedido)){
            System.out.println("    Pedido realizado com sucesso!!");
            pedido.mostrarPedido();
        }
        else
            System.out.println("    Pedido de "+ pedido.getNome() +" não realizado com sucesso!!");
        
        //Alterar pedido
        System.out.println("Alterar pedido");
        
        pedido = gerenPedidos.consultarUltimoPedido("123456789");
        if(pedido!=null){
            System.out.println("    Pedido encontrado com sucesso!!");
            pedido.mostrarPedido();
        }
        else
            System.out.println("    Pedido encontrado não com sucesso!!");
        
        p1 = pedido.consultarPizza("Muçarela");
        if(pedido.removePizza(p1)){
            System.out.println("    Pizza Removida com sucesso!!");
            pedido.fecharPedido();
            pedido.mostrarPedido();
        }
        else{
            System.out.println("    Pizza Removida não com sucesso!!");
        }
        
        if(gerenPedidos.alterarPedido(pedido)){
            System.out.println("    Pedido alterado com sucesso!!");
        }
        else
            System.out.println("    Pedido não alterado com sucesso!!");
        
        //Remover/Cancelar pedido
        System.out.println("Remover/Cancelar pedido");
        
        pedido = gerenPedidos.consultarUltimoPedido("987654321");
        if(pedido!=null){
            System.out.println("    Pedido encontrado com sucesso!!");
            pedido.mostrarPedido();
        }
        else
            System.out.println("    Pedido encontrado não com sucesso!!");
                
        if(gerenPedidos.removePedido(pedido)){
            System.out.println("    Pedido removido com sucesso!!");
        }
        else
            System.out.println("    Pedido não removido com sucesso!!");
        
        //todos os pedidos
        System.out.println("Todos os pedidos");
        ArrayList<Pedido> pedidos;
        pedidos = gerenPedidos.getTodosPedido();
        for(Pedido pe : pedidos){
            pe.mostrarPedido();
            System.out.println("--------------------------------------");
        }
        
        Calendar calInc = Calendar.getInstance();
        Calendar calFinal = Calendar.getInstance();
        calInc.set(2021,05,14);
        Relatorio relatorio = new Relatorio(gerenPedidos,calInc,calFinal);
    }
    
    
    
    
}
