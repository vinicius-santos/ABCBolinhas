

public class Imposto {

    public Imposto() {
    }

    public double calcula(Orcamento orcamento) {
        System.out.println("teste");
        return orcamento.getValor() * 0.1;
        //trs
    }
}
