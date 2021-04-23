package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DamenosServiceProxy implements DamenosService {
    private DamenosService damenosService;
    private List<DamenosPizza> cachePizzas = new ArrayList<>();

    public DamenosServiceProxy() {
        this.damenosService = new DamenosServiceImpl();
    }

    @Override
    public List<DamenosPizza> getPizzas() {
        if (cachePizzas.isEmpty()) {
            cachePizzas = damenosService.getPizzas();
        }
        return cachePizzas;
    }
}
