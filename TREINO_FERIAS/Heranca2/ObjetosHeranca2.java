package TREINO_FERIAS.Heranca2;

public class ObjetosHeranca2 {
    public static void main(String[] args) {
        //Esta linha está errada pq está criando objeto atravez de uma classe que é abstrata
        //Pessoa2 p1 = new Pessoa2(); 
        Visitante v1 = new Visitante();
        v1.setNome("Alberto");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula (1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        //System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        b1.exibir();
    }
}
