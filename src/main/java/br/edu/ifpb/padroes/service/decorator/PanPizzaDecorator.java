package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator implements Pizza {

    private Pizza wrappee;

    PanPizzaDecorator(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 1.15f;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " (pan pizza)";
    }
}
