package com.plateformeweb.gestion.etablissement.scolaire.ml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class ProjetGestionDesEtablissementScolaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetGestionDesEtablissementScolaireApplication.class, args);
	}

}
