package TREINO_FERIAS.Heranca1;

import java.net.SocketTimeoutException;

public class ObjetosDePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("cláudio");
        p4.setNome("Fabiana");

        p1.setSexo(" M");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString()); 
        System.out.println(p4.toString());
    }
}
