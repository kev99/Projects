package com.utn.repositories.dao;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.utn.model.Tarjeta;
import com.utn.repositories.TarjetaRepo;


@Repository
public class TarjetaDao {

	@Autowired
	private TarjetaRepo tarjetarep;
	
	@Transactional
	public void guardoTarjeta(Tarjeta tarj ) {
		tarjetarep.save(tarj);
	}
	
}
