package TREINO_FERIAS.Polimorfismo;

/* POLIMORFISMO
Usa o mesmo nome, mesmo método declarado numa classe "mãe" 
mas os resultados são diferentes em cada objetto de acordo com a sua classe que a instanciou*/ 
/*No caso o de sobreposição é com mesma assinatura e em classes diferentes */
public abstract class Animal {
    //Atributos de animal
    protected float peso;
    protected int idade;
    protected int membros;
    /*Métodos de Animal (São abstratos então só as classes filhas poderão desenvolver) */ 
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
}
