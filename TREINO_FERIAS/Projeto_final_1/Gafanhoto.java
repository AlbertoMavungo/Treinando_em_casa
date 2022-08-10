package TREINO_FERIAS.Projeto_final_1;

public class Gafanhoto extends Pessoa3 {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String log) {
        super(nome, idade, sexo);
        this.login = log;
        this.totAssistido = 0;
    }
    public void viuMaisUm() {
        this.totAssistido ++;
    }
    @Override
    protected void ganharExp() {
      
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }
   
}
