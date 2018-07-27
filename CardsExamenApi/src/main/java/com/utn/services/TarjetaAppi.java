package com.utn.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.utn.model.Tarjeta;
import com.utn.repositories.TarjetaRepo;


@RestController
public class TarjetaAppi {

	@Autowired
	private TarjetaRepo tarjetarep;

	@Autowired
	private Gson gson;

	@Autowired
	private TarjetaDao tarjetadao;


	@CrossOrigin
	@PostMapping(value="save")
	public ResponseEntity<Tarjeta> saveTarjeta(@RequestBody Tarjeta card) {

		tarjetarep.save(card);

		return new ResponseEntity<Tarjeta>(HttpStatus.OK);
	}

	
	
	
}
