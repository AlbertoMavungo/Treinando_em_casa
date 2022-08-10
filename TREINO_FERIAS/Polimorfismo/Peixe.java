package TREINO_FERIAS.Polimorfismo;

public class Peixe extends Animal {
    //Tem quye implementar todos os métodos que estão abstratas na classe que está sendo extendida
    private String corEscama; 
    @Override
    
    public void alimentar() {
       System.out.println("Comendo Substâncias"); 
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    public void soltarBolhas() {
        System.out.println("Soultou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
