import org.jetbrains.annotations.NotNull;

public class Sorvete {

    private String sabor;
    private double preco;
    public Recipiente recipiente = new Recipiente();
    private Cobertura cobertura = new Cobertura();
    public static int cont;


    public Sorvete(String sabor,double preco, Recipiente recipiente){

        this.sabor = sabor;
        this.preco = preco;
        this.recipiente = recipiente;
        cont++;

    }

    public Sorvete() {

    }


    public void addRecipiente(@NotNull String rec){

    };


    public void setRecipiente(String recipiente){
        this.recipiente.setNomeRecipiente(recipiente);
    }

    public String getRecipiente(){
        return this.recipiente.getNomeRecipiente();
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void addCobertura(String respco){

    };

    public void addGranulado(String resp, String respcob){

    };

}
