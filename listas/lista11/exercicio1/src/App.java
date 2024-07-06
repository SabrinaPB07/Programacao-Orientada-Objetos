import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Musica> musica1 = new HashMap<>();

        musica1.put("Life on mars", new Musica("Life on mars", "David Bowie", "Hunky Dory"));

        BibliotecaMusical bibliotecaMusical = new BibliotecaMusical(musica1);

        bibliotecaMusical.adicionarusica("Enjoy the Silence ", new Musica("enjoy the Silence",
        "Depeche Mode", "Violator"));
        bibliotecaMusical.adicionarusica("Mania de você", new Musica("Mania de você",
         "Rita Lee", "Rita Lee"));
         bibliotecaMusical.adicionarusica("Bohemian Rhapsody", new Musica("Bohemian Rhapsody",
          "Queen", "A Night at the Opera"));
          bibliotecaMusical.adicionarusica("Wuthering Heigths", new Musica("Wuthering Heigths",
           "Kate Bush", "The Kick Inside"));

          bibliotecaMusical.listarMusicas();

          bibliotecaMusical.buscarMusica("Mania de você");
    }
}
