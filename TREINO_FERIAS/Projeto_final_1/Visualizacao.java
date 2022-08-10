package TREINO_FERIAS.Projeto_final_1;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public void avaliar() {
        
    }
    public void avaliar(int nota) {
        
    }
    public void avaliar(String porc) {
        
    }
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    @Override
    public String toString() {
        return "Visualizavao [espectador=" + espectador + ", filme=" + filme + "]";
    }
}
