package TREINO_FERIAS.Projeto_final_1;

public class ObjetosVideo_1 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 15 de java");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Alberto", 22, "M", "juba");
        g[1] = new Gafanhoto("cabo", 12, "F", "KIK");
        
        
       /*/ System.out.println("VIDEOS\n-----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/

        Visualizacao vis = new Visualizacao(g[0], v[1]);
        System.out.println(vis.toString());
    }
}
