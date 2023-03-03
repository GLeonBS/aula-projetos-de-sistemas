package aula;

import lombok.Getter;

public class TransportadoraOnibus  implements TransportadoraInt{
    @Getter
    private Tipo tipo;

    public TransportadoraOnibus(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public Double calcularFrete(Double altura, Double largura) {
        return (altura + largura) * 12.2;
    }
}
