// Esse Scanner é para capturar dados pela linha de comando
import java.util.Scanner;
public class IfSimples {
    public static void main(String[] v) {
        //variável de referência (de tipo Scanner, neste caso optamos por criar uma variável chamada leitor
        //ela que vai ler os dados do imput (como no JOptionPane) só para o Scanner)
        Scanner leitor;
        //Constroi um objeto de tipo scanner
        //new é semelhante ao malloc da linguagem c
        //System.in ==> Faça leitura de dados
        leitor = new Scanner(System.in); 
        double nota;
        //System.ou mostra a mensagem para o usuário digitrar algo que será pego pelo leitor
        //como se fosse o printf na linguagem c
        System.out.printf("Digite a sua nota\n");
        //nextDouble ==> pegando o dado digitado (como se fosse o scanf na linguagem c)
        nota = leitor.nextDouble();
        if (nota >=  6){
            System.out.println("Aprovado");
        }
        else System.out.println("Reprovadasso");
        //No final precisa fechar o leitor de dados
        leitor.close();
    }

}
