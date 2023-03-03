package aula;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Transportadora {
    private List<TransportadoraInt> transportadoras;


    public List<Transporte> calculosTransportadoras(Double altura, Double largura){
        return this.transportadoras.stream().map(tp -> new Transporte(tp.getTipo(), tp.calcularFrete(altura, largura))).collect(Collectors.toList());
    };


}
