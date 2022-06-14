import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Arquivo arquivo = new Arquivo();

        Sorveteria sorveteria = new Sorveteria();
        System.out.println(" ");
        System.out.println("Digite o nome da sorveteria por favor! ");
        sorveteria.setNome(sc.nextLine());

        boolean flag = true;

        System.out.println(" ");
        System.out.println("Ola, Bem Vindo à " + sorveteria.getNome() + "!");
        System.out.println("O que deseja fazer?");

        while (flag){
            System.out.println(" ");
            System.out.println("Opções disponiveis: ");
            System.out.println("1 - Criar novo sorvete;");
            System.out.println("2 - Adicionar um sorvete no carrinho;");
            System.out.println("3 - Mostrar carrinho de compras;");
            System.out.println("4 - Calcular valor total do carrinho;");
            System.out.println("5 - Limpar carrinho de compras;");
            System.out.println("6 - Mostrar sorvetes criados com informações;");
            System.out.println("7 - Apagar historico de sorvetes;");
            System.out.println("8 - Sair;");
            System.out.println("Sua opção: ");

            int opcao1 = sc.nextInt();

            switch (opcao1){

                case 1:
                    System.out.println("Deseja criar um sorvete de qual sabor? ");
                    System.out.println("Sabores disponiveis: ");
                    System.out.println("1 - Baunilha;");
                    System.out.println("2 - Chocolate;");
                    System.out.println("3 - Misto;");
                    System.out.println("4 - Morango;");
                    System.out.println("Sua opção: ");

                    int opcao2 = sc.nextInt();

                    switch (opcao2) {

                        case 1:
                            sc.nextLine();
                            SorveteBaunilha sorveteBaunilha = new SorveteBaunilha();
                            System.out.println("Casquinha ou copinho?");
                            String recib = sc.nextLine();
                            sorveteBaunilha.addRecipiente(recib);
                            System.out.println("Digite o nome do sorvete: ");
                            sorveteBaunilha.setSabor(sc.nextLine());
                            System.out.println("Digite o preço do sorvete: ");
                            sorveteBaunilha.setPreco(sc.nextDouble());
                            sc.nextLine();
                            System.out.println("Deseja adicionar cobertura? ");
                            String respcobb = sc.nextLine();
                            sorveteBaunilha.addCobertura(respcobb);
                            System.out.println("Deseja acionar granulado? ");
                            String respgb = sc.nextLine();
                            sorveteBaunilha.addGranulado(respgb, respcobb);
                            sorveteria.addSorvete(sorveteBaunilha);
                            arquivo.escrever(sorveteBaunilha);
                            break;

                        case 2:
                            sc.nextLine();
                            SorveteChocolate sorveteChocolate = new SorveteChocolate();
                            System.out.println("Casquinha ou copinho?");
                            String recic = sc.nextLine();
                            sorveteChocolate.addRecipiente(recic);
                            System.out.println("Digite o nome do sorvete: ");
                            sorveteChocolate.setSabor(sc.nextLine());
                            System.out.println("Digite o preço do sorvete: ");
                            sorveteChocolate.setPreco(sc.nextDouble());
                            sc.nextLine();
                            System.out.println("Deseja adicionar cobertura? ");
                            String respcobc = sc.nextLine();
                            sorveteChocolate.addCobertura(respcobc);
                            System.out.println("Deseja acionar granulado? ");
                            String respgc = sc.nextLine();
                            sorveteChocolate.addGranulado(respgc, respcobc);
                            sorveteria.addSorvete(sorveteChocolate);
                            arquivo.escrever(sorveteChocolate);
                            break;

                        case 3:
                            sc.nextLine();
                            SorveteMisto sorveteMisto = new SorveteMisto();
                            System.out.println("Casquinha ou copinho?");
                            String recimi = sc.nextLine();
                            sorveteMisto.addRecipiente(recimi);
                            System.out.println("Digite o nome do sorvete: ");
                            sorveteMisto.setSabor(sc.nextLine());
                            System.out.println("Digite o preço do sorvete: ");
                            sorveteMisto.setPreco(sc.nextDouble());
                            sc.nextLine();
                            System.out.println("Deseja adicionar cobertura? ");
                            String respcobmi = sc.nextLine();
                            sorveteMisto.addCobertura(respcobmi);
                            System.out.println("Deseja acionar granulado? ");
                            String respgmi = sc.nextLine();
                            sorveteMisto.addGranulado(respgmi, respcobmi);
                            sorveteria.addSorvete(sorveteMisto);
                            arquivo.escrever(sorveteMisto);
                            break;

                        case 4:
                            sc.nextLine();
                            SorveteMorango sorveteMorango = new SorveteMorango();
                            System.out.println("Casquinha ou copinho?");
                            String recimo = sc.nextLine();
                            sorveteMorango.addRecipiente(recimo);
                            System.out.println("Digite o nome do sorvete: ");
                            sorveteMorango.setSabor(sc.nextLine());
                            System.out.println("Digite o preço do sorvete: ");
                            sorveteMorango.setPreco(sc.nextDouble());
                            sc.nextLine();
                            System.out.println("Deseja adicionar cobertura? ");
                            String respcobmo = sc.nextLine();
                            sorveteMorango.addCobertura(respcobmo);
                            System.out.println("Deseja acionar granulado? ");
                            String respgmo = sc.nextLine();
                            sorveteMorango.addGranulado(respgmo, respcobmo);
                            sorveteria.addSorvete(sorveteMorango);
                            arquivo.escrever(sorveteMorango);
                            break;

                        default:
                            System.out.println("Opção invalida!");
                            System.out.println("Entre com um sabor existente!");
                            break;

                    }
                    break;

                case 2:
                    sc.nextLine();
                    sorveteria.verificaSorvetes();
                    if (sorveteria.verifica == true){
                        System.out.println("Qual sorvete deseja adicionar no carrinho?");
                        sorveteria.mostraInfo();
                        int sab = sc.nextInt();
                        sorveteria.addCarrinho(sab);
                        break;
                    }
                    else if (sorveteria.verifica == false){
                        System.out.println("Nenhum sorvete criado ainda;");
                        System.out.printf("Caso queira criar um sorvete para adicionar ao carrinho, ");
                        System.out.println("favor utilizar a opção '1' ;");
                        System.out.println("Grato!");
                        break;
                    }

                case 3:
                    sorveteria.mostraCarrinho();
                    break;

                case 4:
                    sorveteria.calculaValorTotal();
                    break;

                case 5:
                    sorveteria.limpaCarrinho();
                    break;

                case 6:
                    ArrayList<Sorvete> sorvetes = arquivo.ler();
                    for (int i = 0; i < sorvetes.size(); i++) {
                        System.out.println("Sabor: " + sorvetes.get(i).getSabor());
                        System.out.println("Recipiente: " + sorvetes.get(i).getRecipiente());
                        System.out.println("Preço: " + sorvetes.get(i).getPreco());
                    }
                    break;

                case 7:
                    arquivo.apagar();
                    break;

                case 8:
                    System.out.println(" Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção invalida! ");
                    System.out.println("** Por favor entrar com uma opção valida **");
                    break;

            }
        }
    }
}
