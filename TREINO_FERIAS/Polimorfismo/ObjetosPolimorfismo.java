package TREINO_FERIAS.Polimorfismo;

public class ObjetosPolimorfismo {
    public static void main(String[] args) {
       // Animal a1 = new Animal(); (NÃO DÁ PARA CRIAR OBJETOS NUMA CLASSE ABSTRATA)
       
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();  
       Ave a = new Ave();
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       Cobra j = new Cobra();
       Tartaruga t = new Tartaruga();
       Goldfish g = new Goldfish();
       Arara e = new Arara();
       
       m.locomover();
       c.locomover();
       r.locomover();
       k.emitirSom();
       c.emitirSom();
    }
}
