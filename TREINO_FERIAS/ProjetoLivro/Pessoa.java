package TREINO_FERIAS.ProjetoLivro;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniver(){
         this.idade ++; 
    }
    // Métodos especias
    //Construtor

    public Pessoa (String nome, int idade, String sexo) {
        this.nome =nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNomne(String nome) {
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
}
