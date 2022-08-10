package TREINO_FERIAS.Aula05;

public class Objetos5 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNunConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depopsitar(100);
        p2.depopsitar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
