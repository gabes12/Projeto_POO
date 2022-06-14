public class Sorveteria{

    private String nome;
    private double vtotal = 0;
    boolean verifica;

    Sorvete [] sorvetes = new Sorvete[100];
    Sorvete [] carrinho = new Sorvete[100];

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addSorvete(Sorvete sorvete){
        for (int i = 0; i < this.sorvetes.length; i++){
            if(sorvetes[i] == null){
                sorvetes[i] = sorvete;
                System.out.println("Sorvete criado!");
                break;
            }
        }
    }

    public void verificaSorvetes(){
        for (int i = 0; i < this.sorvetes.length; i++){
            if(i == 0 && sorvetes[0] != null){
                verifica = true;
                break;
            }
            else if(i == 0 && sorvetes[0] == null){
                verifica = false;
                break;
            }
        }
    }

    public void addCarrinho(int j){
        for (int i = 0; i < this.carrinho.length; i++){
            if(carrinho[i] == null){
                if(sorvetes[j-1] != null){
                    carrinho[i] = sorvetes[j-1];
                    System.out.println("Sorvete adicionado ao carrinho!");
                    break;
                }
                else if(sorvetes[j-1] == null){
                    System.out.println("Selecionou sorvete errado;");
                    System.out.println("Favor tentar adicioar sorvete novamente;");
                    break;
                }
            }
        }
    }

    public void mostraCarrinho(){
        for (int i = 0; i < this.carrinho.length; i++){
            if(i == 0 && carrinho[i] == null){
                System.out.println("O carrinho esta vazio! ");
            }
            if(carrinho[i] != null){
                System.out.println(carrinho[i].getSabor() + " " + carrinho[i].getPreco() + "R$ ;");
            }
        }
    }

    public void calculaValorTotal(){
        for (int i = 0; i < this.carrinho.length; i++){
            if(i == 0 && carrinho[i] == null){
                System.out.println("O carrinho esta vazio! ");
            }
            if(carrinho[i] != null){
                vtotal = vtotal + carrinho[i].getPreco();
            }
        }
        if(vtotal != 0) {
            System.out.println("Valor total do carrinho até o momento é de: " + vtotal + " R$ ; ");
        }
    }

    public void limpaCarrinho(){
        for (int i = 0; i < this.carrinho.length; i++){
            if(i == 0 && carrinho[0] == null){
                System.out.println("O carrinho ja estava vazio;");
                break;
            }
            else if(carrinho[i] != null){
                if(carrinho[0] != null){
                    System.out.println("Carrinho esvaziado com sucesso!");
                }
                carrinho[i] = null;
            }
        }
        vtotal = 0;
    }

    void mostraInfo(){
        for (int i = 0; i < this.sorvetes.length; i++){
            if(sorvetes[i] != null) {
                System.out.println(i+1 + "- " + sorvetes[i].getSabor() + ";");
            }
        }
    }

    void mostraInfoTotal(){
        for (int i = 0; i < this.sorvetes.length; i++){
            if(sorvetes[0] == null){
                System.out.println("Nenhum sorvete criado ainda;");
                System.out.println("Caso queira criar um novo sorvete, selecione a opção '1' ;");
                System.out.println("Grato!");
            }
            if(sorvetes[i] != null){
                System.out.printf("- sabor: " + sorvetes[i].getSabor() + "; ");
                System.out.printf(" preço: " + sorvetes[i].getPreco() + ";");
                System.out.println(" ");
            }
        }
    }
}
