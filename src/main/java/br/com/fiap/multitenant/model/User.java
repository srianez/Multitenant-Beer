package br.com.fiap.multitenant.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
/*    private Set<Beer> beers;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

/*    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public Set<Beer> getBeers(){
        return beers;
    }*/

/*    public void setBeers(Set<Beer> beers) {
        this.beers = beers;
    }*/
}
