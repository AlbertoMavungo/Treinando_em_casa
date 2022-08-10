package TREINO_FERIAS.Relacionamento;

public class Lutador {
    //Atributos
    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("-----------------------------------------------");  
        System.out.println("CHEGOU A HORA! apresentamos o lutador " + this.getNome()); 
        System.out.println("Diretamente de " + this.getNacionalidade()); 
        System.out.println("Com " + this.getIdade() + " anos e " + this.altura + " de altura");
        System.out.println("Pesando " + this.getPeso() + "kilos");
        System.out.println( this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");  
    }
    public void status(){
        System.out.println("O " + this.getNome());
        System.out.println("Ganhou " + this.getVitorias() + " é um peso " + this.getCategoria());
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
        System.out.println("Empatou " + this.getEmpates() + " Vezes"); 
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public Lutador(String no, String na, int id, float al, float pe,
          int vi, int de, int em){
         this.nome = no;
         this.nacionalidade = na;
         this.altura = al;
         this.setPeso(pe);
         this.idade = id;
         this.vitorias = vi;
         this.derrotas = de;
         this.empates = em;
     }
    //Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
       if (this.peso < 52.2){
           this.categoria = "Inválido";
       }else if (this.peso <= 70.3){
           this.categoria = "Leve"; 
       }else if (this.peso <= 83.9){
           this.categoria = "Médio";
       }else if (this.peso <= 120.2){
           this.categoria = "Pesado"; 
       }else{
           this.categoria = "Inválido";
       }
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias){
       this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
} 

    
