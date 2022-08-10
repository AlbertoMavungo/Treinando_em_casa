package TREINO_FERIAS.Encapsulamento;

public class ControleRemoto implements Controlador{
  //ATRIBUTOS
  private int volume;
  private boolean ligado;
  private boolean tocando;

  //MÉTODOS ESPECIAIS
  //CONSTRUTOR (criar meio que um padrão de como os objetos irão estar já quando criados)
  //está sem parâmetros
  public ControleRemoto() {
      this.volume = 50;
      this.ligado = true;
      this.tocando = false;
  }

  private int getVolume() {
      return volume;
  }
  private void setVolume(int volume) {
      this.volume = volume;
  }
  private boolean getLigado(){
    return ligado;
  }
  private void setLigado(boolean ligado) {
      this.ligado = ligado;
  }
  private boolean getTocando(){
    return tocando;
  }
  private void setTocando(boolean tocando) {
      this.tocando = tocando;
  }

  /*Métodos astratos 
  vamos ter que conectar (lá na parte de cima no início na classe) 
  com a interface Controlador e digitar todos os métodos que lá tem*/
  
   public void ligar(){
      this.setLigado (true);
   }
   public void desligar(){
      this.setLigado (false);
   }
   public void abrirMenu(){
    System.out.println("--------------MENU---------");
    System.out.println("Está ligado? " + this.getLigado());
    System.out.println("Está tocando? " + this.getTocando());
    System.out.println("Volume " + this.getVolume());
     for (int i = 0; i<=this.getVolume(); i+=10){
        System.out.print("|");
     }
    System.out.println("");
   }
   public void fecharMenu(){
       System.out.println("Fechando menu");
   }
   public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }  
   }
   public void menosVolume(){
    if (this.getLigado()){
        this.setVolume(this.getVolume() - 5);
    } 
   }
   public void ligarMudo(){
       if (this.getLigado() && this.getVolume() > 0){
           this.setVolume(0);
       }
   }
   public  void desligarMudo(){
    if (this.getLigado() && this.getVolume() == 0){
        this.setVolume(50);
    }
   }
   public void play(){
       if (this.getLigado() && !(this.getTocando())){
        this.setTocando(true);
       }
   }
   public void pause(){
    if (this.getLigado() && (this.getTocando())){
        this.setTocando(false);
       }
   }
}