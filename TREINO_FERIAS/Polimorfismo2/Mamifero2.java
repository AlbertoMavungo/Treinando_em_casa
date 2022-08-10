package TREINO_FERIAS.Polimorfismo2;

public class Mamifero2 extends Animal2 {
    protected String corPelo;
    @Override
    public void emitirSom() {
      System.out.println("Som de mamífero");
    }
    
}
