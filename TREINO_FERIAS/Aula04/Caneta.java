package TREINO_FERIAS.Aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //Construtor está diretamente ligado com a construção dos objetos
    public Caneta(String m, String c, float p){ /*Este é o método construtor, tem o mesmo nome da classe, 
        tem parâmetros também um mais simples poderia não ter os parâmetros*/
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar(); 
    }
    //Getters e setters, todos são públicos e os setters devem ter sempre parâmetros
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tampada: "+ this.tampada);
    }
}
