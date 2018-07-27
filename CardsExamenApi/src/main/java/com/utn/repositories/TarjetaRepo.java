package com.utn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



import com.utn.model.Tarjeta;


@Component
@Repository
public interface TarjetaRepo extends JpaRepository<Tarjeta, Integer>{

	
	
	
}
