package TREINO_FERIAS.Polimorfismo;


public class Mamifero extends Animal {
    //Tem quye implementar todos os métodos que estão abstratas na classe que está sendo extendida
    private String corPelo;

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
