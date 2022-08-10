package TREINO_FERIAS.Polimorfismo2;

//Polimormismo de sobrecarga: assinatura difernte e na mesmo classe
public class Cachorro2 extends Mamifero2 {
    @Override
    public void emitirSom() {
      System.out.println("au au au");
    }
    public void reagir(String frase) {
        //não usei igual em baixo e sim o equals porque a frase é um objeto da classe Stritng 
        //do cara do youtube não funcionou, mas no meu funcionou mas fiz igual ao dele
        if (frase.equals("Toma Comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min) {
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }

    public void regir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

}
