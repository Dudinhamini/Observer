package com.pattern.observer;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;
import java.math.BigDecimal;

public class ObserverApplication {

    public static void main(String[] args) {

        args.run(ObserverApplication.class, args);

        BigDecimal valorInicial = new BigDecimal("1100.00");
        BigDecimal desconto = new BigDecimal("10.00");
        Gerente gerente = new Gerente("Maria");
        Estoque estoque = new Estoque("camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);
    }
}
