package TREINO_FERIAS.Polimorfismo;

public class Reptil extends Animal {
    //Tem quye implementar todos os métodos que estão abstratas na classe que está sendo extendida

    private String corEscama;
    @Override
    public void alimentar() {
       System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de réptil");
    }

    @Override
    public void locomover() {
       System.out.println("Rastejando"); 
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
