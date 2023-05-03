package br.com.alura.screenmatch.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);


        


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item :lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificação() > 2){
            System.out.println("Classificação  " + filme.getClassificação());
            }

        }


           List<String> buscaPorArtista =new ArrayList<>();
            buscaPorArtista.add("Adam sandler");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jaqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println(buscaPorArtista);
             Collections.sort(lista);
             System.out.println(lista);

             lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
             System.out.println("Ordenando por ano: "+ lista);





           
            

        



    }
    
}
