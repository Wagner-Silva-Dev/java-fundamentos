package fundamentos.parametrizacao.teste;

import fundamentos.parametrizacao.optional.Manga;
import fundamentos.parametrizacao.optional.MangaRepositorio;

public class MangaTeste {

    public static void main(String[] args) {
        MangaRepositorio.filtroPorTitulo("Berserk").ifPresent(System.out::println);

        Manga manga = MangaRepositorio.filtroPorId(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(manga);

        Manga newManga = MangaRepositorio.filtroPorTitulo("Dr Stone").orElse(new Manga(8, "Dr Stone"));

        System.out.println(newManga);
    }

}
