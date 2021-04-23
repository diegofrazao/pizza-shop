package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCouponDecorator implements Pizza {
    private Pizza wrappee;

    public DiscountCouponDecorator(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 0.75f;
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }
}
