package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao viz[] = new Visualizacao[5];
        viz[0] = new Visualizacao(g[0], v[2]);
        viz[0].avaliar();
        System.out.println(viz[0].toString());
        viz[1] = new Visualizacao(g[0], v[1]);
        viz[0].avaliar(87.0f);
        System.out.println(viz[0].toString());
        /*System.out.println(v[0].toString());
        System.out.println(g[0].toString());*/
    }
}
