package TREINO_FERIAS.Relacionamento;

import java.util.Random;

public class Luta {
    //Atributos
    // tipo abstratos de dados
    // AGEGAÇÃO, ESTÁ CLASSE TEM DENTRO DELA LUTADORES
    //A LUTADOR PODE TER UMA OU NEHUMA LUTA, MAS A LUTA TEM *.2 NO MÍNIMO
    private Lutador desafiado;
    private Lutador desafiante;
    //tipos primitivos
    private int rounds;
    private boolean aprovada;
    //Métodos público
    public void marcarLuta(Lutador l1, Lutador l2){
         if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            System.out.println("Lutadores aprovados");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
         } else{
            System.out.println("Lutadores nao aprovados");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
         }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            //O random é para gerar um resultado aleatório, importei ele lá em cima
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// vai gerar 3 resultados 0,1 ou 2
            // Agora vamos usar o switch, que é escolha, para escolher
            switch(vencedor){
                case 0: //Empare
                    System.out.println("Luta empatada");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
           
                case 1: // desafiado vence
                    System.out.println("Vitória do " + this.getDesafiado());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence 
                    System.out.println("Vitória do " + this.getDesafiante());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;   
            }
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }

    //Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
