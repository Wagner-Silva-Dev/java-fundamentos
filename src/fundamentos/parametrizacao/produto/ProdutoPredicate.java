package fundamentos.parametrizacao.produto;

/**
 * Filtro de {@link Produto}, criado apenas para estudo de parametrização de comportamento.
 *
 * @deprecated use {@link java.util.function.Predicate}{@code <Produto>}.
 */
@Deprecated
public interface ProdutoPredicate {
    boolean teste(Produto produto);
}