package br.com.fiap.multitenant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.multitenant.model.BeerStyle;

@Repository
public interface BeerStyleRepository extends JpaRepository<BeerStyle, Long> {

}
