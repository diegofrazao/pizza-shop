package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator implements Pizza {

    private Pizza wrappee;

    public StuffedCrustDecorator(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 1.20f;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " (stuffed crust)";
    }
}
