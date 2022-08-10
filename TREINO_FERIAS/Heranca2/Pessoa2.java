package TREINO_FERIAS.Heranca2;

// Com a classe abstrata não pode criar novos objetos, só server para criar heranças
public abstract class Pessoa2 {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Dados [idade = " + idade + ", nome = " + nome + ", sexo= " + sexo + "]";
    }
   
    
}
