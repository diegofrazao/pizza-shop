package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;
import br.edu.ifpb.padroes.service.decorator.DiscountCouponDecorator;
import br.edu.ifpb.padroes.service.decorator.ExtraCheeseDecorator;
import br.edu.ifpb.padroes.service.decorator.StuffedCrustDecorator;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        for (Pizza pizza : pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }

        StuffedCrustDecorator stuffedCrust = new StuffedCrustDecorator(
                new ExtraCheeseDecorator (
                        new DiscountCouponDecorator (
                                new PizzaShopPizza("pepperoni", 55.0f)
                        )
                )
        );

        pizzaShopService.orderPizza(stuffedCrust);

    }
}