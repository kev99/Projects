package com.utn.factory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.utn.dao.IConnection;
import com.utn.dao.Itransaction;
import com.utn.modelo.Combo;

public class PedidoFactory implements Itransaction<Combo> {
	private IConnection connex;

	@Override
	public List<Combo> getAll() throws ClassNotFoundException, SQLException {
		List<Combo> lista = new ArrayList<>();
		try {
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select * from ventas");
			while (rs.next()) {
				lista.add(new Combo(rs.getString("nombre"), rs.getInt("precio")));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	@Override
	public boolean insert(Combo tobject) throws ClassNotFoundException, SQLException {
		boolean res = false;
		try {
			String sql = "insert into ventas(nombre, precio ) values (?,?)";
			PreparedStatement ps = (PreparedStatement) connex.getConnection().prepareStatement(sql);
			ps.setString(1, tobject.getNombre());
			ps.setInt(2, tobject.getPrecio());
			res = ps.execute();
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return res;
	}

	 
	
	 
	
}
