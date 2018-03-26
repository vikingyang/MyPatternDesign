package lesson6.refactortemplatemethod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lesson6.templatemethod.Vehicle;

public class VehicleDb extends AbstractDB {
	public List<Vehicle> populate() {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		String SQL_SELECT_PARTS = "select * from vehicle";
		Object[] params = new Object[] {};
		List<Object> objectList = super.populate(SQL_SELECT_PARTS, params);
		for (Object object : objectList) {
			Vehicle vehicle = (Vehicle) object;
			vehicleList.add(vehicle);
		}
		return vehicleList;
	}

	@Override
	protected List<Object> rowMapper(ResultSet rs) throws SQLException {
		List<Object> vehicleList = new ArrayList<Object>();
		Vehicle p = new Vehicle();
		p.setName(rs.getString("name"));
		p.setLogo(rs.getString("logo"));
		p.setName(rs.getString("color"));
		p.setSpeed(rs.getDouble("speed"));
		vehicleList.add(p);
		return vehicleList;
	}
}