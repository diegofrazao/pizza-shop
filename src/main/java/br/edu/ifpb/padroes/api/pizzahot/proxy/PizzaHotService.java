package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;

import java.util.List;

public interface PizzaHotService {

    List<PizzaHotPizza> getPizzas();

}
