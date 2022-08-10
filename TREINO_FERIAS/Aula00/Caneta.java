package TREINO_FERIAS.Aula00;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // MÉTODOS
    public void status (){
        System.out.println("modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
      if (this.tampada == true){
        System.out.println("Erro! Não posso rabiscar");
      }
      else{
        System.out.println("estou rabiscando");
     }

    }
    public void tampar(){
      this.tampada = true;
    }
    public void destampar(){
      this.tampada = false;
    }
}