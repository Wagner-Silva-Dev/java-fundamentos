    package fundamentos.parametrizacao.teste;

    import fundamentos.parametrizacao.produto.Produto;
    import fundamentos.parametrizacao.produto.ProdutoPredicate;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.function.Predicate;

    public class ProdutoTeste {
        private static List<Produto> produtos = List.of(new Produto("caderno" , 10.5),
                                                        new Produto("caneta", 2.5),
                                                        new Produto("lápis", 2.0));

        public static void main(String[] args) {
            List<Produto> produtosAcimaDe5 = filtroProduto(produtos, produto ->  produto.getPreco() >= 5);

            System.out.println(produtosAcimaDe5);
        }

        private static List<Produto> filtroProduto(List<Produto> produtos, Predicate<Produto> produtoPredicate) {
            List<Produto> filtroProdutos = new ArrayList<>();
            for(Produto produto : produtos){
                if (produtoPredicate.test(produto)) {
                    filtroProdutos.add(produto);
                }
            }

            return filtroProdutos;
        }

    }
