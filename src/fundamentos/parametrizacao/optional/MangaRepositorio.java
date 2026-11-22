package fundamentos.parametrizacao.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> listaManga = List.of(new Manga(1, "Berserk"),  new Manga(2, "One Piece"), new Manga(3, "Naruto"),
                                                    new Manga(4, "Fire Force"), new Manga(5, "Hajime no Ippo"));

    public static Optional<Manga> filtroPorId(Integer id) {
        return filtroManga(manga ->  manga.getId().equals(id));
    }

    public static Optional<Manga> filtroPorTitulo(String titulo) {
        return filtroManga(manga ->  manga.getTitulo().equals(titulo));
    }

    private static Optional<Manga> filtroManga(Predicate<Manga> predicate) {
        Manga mangaFiltro = null;
        for (Manga manga : listaManga) {
            if (predicate.test(manga)) {
                mangaFiltro = manga;
            }
        }
        return Optional.ofNullable(mangaFiltro);
    }
}
