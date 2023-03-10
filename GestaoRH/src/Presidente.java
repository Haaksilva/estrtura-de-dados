

import java.math.BigDecimal;

public class Presidente extends Object {

    private String nome = "lula Incio";
    private int codigo = 03;

    public Presidente(String nome, int codigo) {
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

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo; 
    }

    
    
}

