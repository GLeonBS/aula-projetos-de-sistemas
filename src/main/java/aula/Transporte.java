package aula;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Transporte {

    private Tipo tipo;
    private Double resultadoFrete;
}
