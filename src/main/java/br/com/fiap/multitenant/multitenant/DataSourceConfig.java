package br.com.fiap.multitenant.multitenant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DataSourceConfig implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6204631435410292754L;
	@Id @GeneratedValue
    private Long id;
    private String name;
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private boolean initialize;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public boolean getInitialize() {
        return initialize;
    }

}