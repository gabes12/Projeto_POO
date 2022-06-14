import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Sorvete sorvete){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Sorveteria.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Sorvete");
            bw.newLine();
            bw.write(sorvete.getSabor() + "\n");
            bw.write(sorvete.recipiente.getNomeRecipiente() + "\n");
            bw.write(sorvete.getPreco() + "\n");

        }catch(Exception e){

            System.out.println(e);

        }finally {

            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }

    public void apagar(){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Sorveteria.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write(" ");

        }catch(Exception e){

            System.out.println(e);

        }finally {

            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public ArrayList<Sorvete> ler(){

        ArrayList<Sorvete> sorvetes = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Sorveteria.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Sorvete")){
                    Sorvete sorvete = new Sorvete();
                    sorvete.setSabor(br.readLine());
                    sorvete.setRecipiente(br.readLine());
                    sorvete.setPreco(Double.parseDouble(br.readLine()));
                    sorvetes.add(sorvete);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }


        return sorvetes;
    }

}
