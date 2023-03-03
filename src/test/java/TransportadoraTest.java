import aula.*;
import lombok.var;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransportadoraTest {
    @Test
    public void deveCalcularFreteMotocicleta(){
        TransportadoraMotocicleta motocicleta =  new TransportadoraMotocicleta(Tipo.EXPRESSA);

        Double frete = motocicleta.calcularFrete(2.0, 2.0);

        assertEquals(20.0, frete);
    }

    @Test
    public void deveCalcularFreteOnibus(){
        TransportadoraOnibus onibus =  new TransportadoraOnibus(Tipo.RODOVIARIA);

        Double frete = onibus.calcularFrete(3.0, 10.0);

        assertEquals(158.6, frete);
    }

    @Test
    public void deveCalcularDeFormaAbstrata(){

        var onibus = new TransportadoraOnibus(Tipo.RODOVIARIA);
        var motocicleta = new TransportadoraMotocicleta(Tipo.EXPRESSA);

//        Transportadora transportadora = new Transportadora(List.of(onibus, motocicleta));
//
//        var resultados = transportadora.calculosTransportadoras(8.0, 5.0);
//
//        // verificar qual o menor valor e retornar seu objeto (tipo e valor de frete)
//        // criar assert para o teste passar (verificar tipo e valor e frete)
//
//        var moto = resultados.stream().filter(transporte -> Tipo.EXPRESSA.equals(transporte.getTipo())).findFirst().orElse(null);


//        assertNotNull(moto);

    }

}
