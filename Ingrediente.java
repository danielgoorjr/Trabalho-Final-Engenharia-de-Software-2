public class Ingrediente {
    private String nome;
    private int caloriasPorPorcao;
    private double precoPorPorcao;
    private double quantidadePorPorcao;
    
    void setNome(String nome){
        this.nome = nome;
    }
       
    void setPrecoPorPorcao(double preco){
        precoPorPorcao = preco;
    }
       
    void setCaloriasPorPorcao(int caloria){
        caloriasPorPorcao = caloria;
    }
    
    void setQuantidadePorPorcao(double quantidade){
        quantidadePorPorcao = quantidade;
    }
    
    String getNome(){
        return nome;
    }
    
    int getCaloriaPorPorcao(){
        return caloriasPorPorcao;
    }
    
    double getPrecoPorPorção(){
        return precoPorPorcao;
    }
    
    double getQuantidadePorPorção(){
        return quantidadePorPorcao;
    }
}
