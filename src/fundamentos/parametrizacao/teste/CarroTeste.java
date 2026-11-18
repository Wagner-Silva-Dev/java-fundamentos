package fundamentos.parametrizacao.teste;

import fundamentos.parametrizacao.Carro;
import fundamentos.parametrizacao.CarroPredicate;

import java.util.ArrayList;
import java.util.List;

public class CarroTeste {
    private static List<Carro> carros = List.of(new Carro("Audi", "preto", 1900),
            new Carro("BMW", "branca", 2000),
            new Carro("Palio", "cinza", 2025));

    public static void main(String[] args) {
        List<Carro> carrosCinza = filtro(carros, new CarroPredicate() {
            @Override
            public boolean teste(Carro carro) {
                return carro.getCor().equalsIgnoreCase("branca");
            }
        });
        System.out.println(carrosCinza);
    }

    private static List<Carro> filtro(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> filtroCarro = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.teste(carro)) {
                filtroCarro.add(carro);
            }
        }

        return filtroCarro;
    }
}