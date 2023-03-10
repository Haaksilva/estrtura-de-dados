
    import java.math.BigDecimal;

public class Engenheiro extends Object {

    private String nome = "Rafael";
    private int codigo = 01;

    public Engenheiro(String nome, int codigo) {
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
}
