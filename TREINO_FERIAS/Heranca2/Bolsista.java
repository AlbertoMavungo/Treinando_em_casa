package TREINO_FERIAS.Heranca2;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovaBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    public void exibir() {
            System.out.println(this.getMatricula()
                              + this.getNome()
                              + this.getBolsa()
                              + this.getSexo());
    }
    //@Override é sobrepor (porque o metodo de pagar a mensalidade 
    //já está na classe aluno que o bolsista está herdando, só o pagar mensalidade 
    //do bolsista será diferente)
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
