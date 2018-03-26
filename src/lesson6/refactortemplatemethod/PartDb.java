package lesson6.refactortemplatemethod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lesson6.templatemethod.Part;

public class PartDb extends AbstractDB {
	public List<Part> populate() {
		List<Part> partList = new ArrayList<Part>();
		String SQL_SELECT_PARTS = "select * from part";
		Object[] params = new Object[] {};
		List<Object> objectList = super.populate(SQL_SELECT_PARTS, params);
		for (Object object : objectList) {
			Part part = (Part) object;
			partList.add(part);
		}
		return partList;
	}

	@Override
	protected List<Object> rowMapper(ResultSet rs) throws SQLException {
		List<Object> partList = new ArrayList<Object>();
		Part p = new Part();
		p.setName(rs.getString("name"));
		p.setBrand(rs.getString("brand"));
		p.setRetailPrice(rs.getDouble("retail_price"));
		partList.add(p);
		return partList;
	}
}