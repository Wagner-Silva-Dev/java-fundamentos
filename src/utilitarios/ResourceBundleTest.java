package utilitarios;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("linguagem", Locale.getDefault());
        System.out.println("Em português");
        System.out.println(bundle.getString("sistema.nome"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));

        System.out.println();

        bundle = ResourceBundle.getBundle("linguagem", new Locale("en", "US"));
        System.out.println("Em inglês");
        System.out.println(bundle.getString("sistema.nome"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));
    }
}