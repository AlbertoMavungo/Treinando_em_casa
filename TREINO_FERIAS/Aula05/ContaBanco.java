package TREINO_FERIAS.Aula05;

public class ContaBanco {
   public int nunConta;
   private String tipo;
   private String dono;
   private float saldo;
   private Boolean status;
// Métodos personalizados
  // médoto para verificar o estado atual
   public void estadoAtual () {
    System.out.println("-------------------");
    System.out.println("Conta: " + this. getNunConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: "+ this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: "+ this.getStatus());
   }
   
   public void abrirConta(String t){
   this.setTipo(t);
   this.setStatus(true);
   if (t == "CC") {
       //this.saldo = 50;
       //OU
       this.setSaldo(50);
   } else if (t == "CP"){
      //this.saldo = 150;
      //OU
      this.setSaldo(150);
      System.out.println("Conta aberta com sucesso");
   }
   };
   public void fecharConta(){
        if (this.getSaldo()> 0){
            System.out.println("A conta não pode ser fechada ainda porque tem dinheiro");
        }
        else if (this.getSaldo()< 0){
            System.out.println("A conta não pode ser fechada poir tem débito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
   };
   public void depopsitar(float v){
        if (this.getStatus()) {
            //this.saldo = this.saldo + v; Aqui está mexendo diretamente nos atributos
            this.setSaldo(this.getSaldo() + v); // aqui está trabalhando com os métodos especiais
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
   };
   public void sacar(float v){
        if (this.getStatus()) {
           if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
           }
           else {
            System.out.println("Saldo insuficiente para realizar saque");
          }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
   };
   public void pagarMensal(int v){
        if (this.getTipo() == "CC") {
            v= 12; 
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
           System.out.println("Impossível pagar uma conta fechada!"); 
        }
   };
   // CONSTRUTOR tem que ter o mesmo nome da classe 
   public  ContaBanco() {
     this.saldo =0;
     this.status = false;
   }

   public void setNunConta(int nunConta) {
       this.nunConta = nunConta;
   }
   public int getNunConta() {
       return this.nunConta;
   }

   public void setfecharConta(String dono) {
       this.dono = dono;
   }
   public void setTipo(String t) {
       this.tipo = t;
   }
   public String getTipo() {
       return tipo;
   }
   public void setDono(String d) {
       this.dono = d;
   }
   public String getDono() {
       return this.dono;
   }
   public void setSaldo(float s) {
       this.saldo = s;
   }
   public float getSaldo() {
       return saldo;
   }
   public void setStatus(Boolean s) {
       this.status = s;
   }
   public Boolean getStatus() {
       return status;
   }
}
