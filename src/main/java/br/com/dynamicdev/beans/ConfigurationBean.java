package br.com.dynamicdev.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

/**
 * Classe necessaria para injetar FacesContext, ExternalContext, ...
 * @author renan
 *
 */

@FacesConfig(version = JSF_2_3)
@ApplicationScoped
public class ConfigurationBean {

}
