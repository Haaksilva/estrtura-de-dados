import java.math.BigDecimal;

import javax.lang.model.element.VariableElement;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var produto1 = new Produto(
            "X BOX 360",
            new BigDecimal(5.000)
        );

        var eletronico = new Eletronico(
            "Tablet Samsung", 
            new BigDecimal(2.000), 
            "Samsung", 
            "16D4k"
        );
        System.out.println(produto1);
        System.out.println(eletronico);
    }
}