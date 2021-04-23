package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator implements Pizza {

    private Pizza wrappee;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 1.10f;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " (extra cheese)";
    }
}
