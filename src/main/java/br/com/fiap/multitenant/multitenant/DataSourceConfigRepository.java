package br.com.fiap.multitenant.multitenant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.multitenant.model.BeerStyle;

@Repository
public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, Long> {

    DataSourceConfig findByName(String name);
	List<BeerStyle> findByOrganization(int idOrganization);

}