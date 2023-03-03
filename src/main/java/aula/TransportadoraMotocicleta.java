package aula;

public class TransportadoraMotocicleta implements TransportadoraInt {
    private Tipo tipo;

    public TransportadoraMotocicleta(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public Tipo getTipo() {
        return this.tipo;
    }

    @Override
    public Double calcularFrete(Double altura, Double largura) {
        return (altura + largura) * 5;
    }
}
