package com.utn.dao;

import java.sql.SQLException;
import java.util.List;

public interface Itransaction<T> {	

		public List<T> getAll() throws ClassNotFoundException, SQLException;

		public boolean insert(T tobject) throws ClassNotFoundException, SQLException;
 
 }
