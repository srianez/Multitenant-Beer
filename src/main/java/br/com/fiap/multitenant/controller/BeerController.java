package br.com.fiap.multitenant.controller;


import br.com.fiap.multitenant.model.Beer;
import br.com.fiap.multitenant.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping(value = "/beer")
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

    @GetMapping
    public Iterator<Beer> getAll() {
        return beerRepository.findAll().iterator();
    }

    @PostMapping
    public void save(@RequestBody Beer beer) {
        beerRepository.save(beer);
    }

}
