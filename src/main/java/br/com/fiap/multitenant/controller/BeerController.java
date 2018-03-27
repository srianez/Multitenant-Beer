package br.com.fiap.multitenant.controller;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.multitenant.model.BeerStyle;
import br.com.fiap.multitenant.repository.BeerStyleRepository;

@RestController
@RequestMapping(value = "/beerStyle")
public class BeerController {

    @Autowired
    private BeerStyleRepository beerStyleRepository;

    @GetMapping
    public Iterator<BeerStyle> getAll() {
        return beerStyleRepository.findAll().iterator();
    }

    @PostMapping
    public void save(@RequestBody BeerStyle beerStyle) {
    	beerStyleRepository.save(beerStyle);
    }

}
