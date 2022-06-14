import org.jetbrains.annotations.NotNull;

public class SorveteMorango extends Sorvete implements Granulado{

    public SorveteMorango(String sabor, double preco, Recipiente recipiente) {
        super(sabor, preco, recipiente);
    }

    public SorveteMorango() {

    }

    @Override
    public void addRecipiente(@NotNull String rec) {
        if(rec.equals("copinho")){
            this.recipiente = new Copinho("copinho");
            System.out.println("Sorvete de morango sera no copinho;");
        }
        else if (rec.equals("casquinha")){
            this.recipiente = new Casquinha("casquinha");
            System.out.println("Sorvete de morango sera na casquiha;");
        }
        else{
            System.out.println("Opção invalida, ficou sem recipiente para aprender kkk...");
        }
    }

    @Override
    public void addGranulado(String resp, String respcob){
        if(resp.equals("sim")){
            if(respcob.equals("nao")) {
                System.out.println("Granulado adicionado!");
                this.setPreco(this.getPreco() + 1.50);
                this.setSabor(this.getSabor() + " com granulado");
            }
            else if(respcob.equals("sim")){
                System.out.println("Granulado adicionado!");
                this.setPreco(this.getPreco() + 1.50);
                this.setSabor(this.getSabor() + " e granulado");
            }
        }
        else if(resp.equals("nao")){
            System.out.println(this.getSabor() + " sem granulado;");
        }
    }

    @Override
    public void addCobertura(String respcob){
        if(respcob.equals("sim")){
            getCobertura().addCobertura();
            this.setPreco(this.getPreco() + getCobertura().getPrecocob());
            this.setSabor(this.getSabor() + " com cobertura");
        }
        else if(respcob.equals("nao")){
            System.out.println(this.getSabor() + " sem cobertura;");
        }
    }

}
