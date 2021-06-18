import java.util.ArrayList;
import java.util.Calendar;
public class Relatorio{
    private Calendar dataDoRelatorio;
    private Calendar dataInicial;
    private Calendar dataFinal;
    private String nomeCLiente;
    private ArrayList<Pedido> pedidos = new ArrayList();
    private ArrayList<Pizza> pizzas = new ArrayList();
    private double lucroBrutoTotal;
    private double lucroLiquidoTotal;
    private double custoEntrega;
    private double custoPizza;
    private int quantPedidoRealizados;
    private int quantPizzasVendidas;
    
    Relatorio(GerenciadorDePedido geren, Calendar dataInicial,Calendar dataFinal){
        dataDoRelatorio = Calendar.getInstance();
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        for(Pedido pedido: geren.getTodosPedido()){
            if(pedido.getData().before(dataFinal.getTime()) && pedido.getData().after(dataInicial.getTime())){
                pedidos.add(pedido);
                lucroBrutoTotal += pedido.getPrecoTotal();
                custoEntrega += pedido.getTaxaDeEntrega();
            }
        }
        quantPedidoRealizados = pedidos.size();
        for(Pedido pedido: pedidos){
            for(Pizza pizza : pedido.getTodosPizzas()){
                pizzas.add(pizza);
                custoPizza += pizza.custo();
            }
        }
        quantPizzasVendidas = pizzas.size();
        lucroLiquidoTotal = lucroBrutoTotal - custoEntrega - custoPizza;
        mostrar();
    }
        
    void mostrar(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("        Realatorio de Vendas     " + dataDoRelatorio.getTime());
        System.out.println();
        System.out.println("Intervalo de análise:   Início: " + dataInicial.getTime());
        System.out.println("                        Final: "+dataFinal.getTime());
        System.out.println();
        System.out.println("Quantida de Pedidos: " + quantPedidoRealizados);
        System.out.println("Total de Pizzas Vendidas: " + quantPizzasVendidas);
        System.out.println("Valor Total das Vendas: " + lucroBrutoTotal);
        System.out.println("Valor do Custo da Taxa De Entrega: " + custoEntrega);
        System.out.println("Valor do Custo das Pizzas: " + custoPizza);
        System.out.println("Lucro Obtido: " + lucroLiquidoTotal);
        System.out.println();
        System.out.println("Quantidade de pizza vendida de cada sobor: ");
        int quant;
        ArrayList<Pizza> pizzasTemp = pizzas;
        while(!pizzasTemp.isEmpty()){
            Pizza pizza = pizzasTemp.get(0);
            System.out.print("    "+pizza.getNome()+": ");
            quant = 1;
            pizzasTemp.remove(pizza);
            while(pizzasTemp.contains(pizza)){
                pizzasTemp.remove(pizza);
                quant++;
            }
            System.out.println(quant);
        }
        System.out.println("---------------------------------------------------------------");
    }
}
