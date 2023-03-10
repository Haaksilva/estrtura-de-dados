
import java.math.BigDecimal;

public class Gerente extends Object {

    private String nome = "Regina";
    private int codigo = 02;
    private int area = 51;
    private int bonus = 50;

    public Gerente(String nome, int codigo) {
        this.nome = nome;
        
    }

    @Override
    public String toString(){
        return nome + " Código do funcionário " + codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo; 
    }

    
    
}
}
