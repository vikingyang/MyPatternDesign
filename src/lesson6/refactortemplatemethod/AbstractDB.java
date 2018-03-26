package lesson6.refactortemplatemethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDB {
	protected List<Object> populate(String sql, Object[] params) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Object> result = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				result = rowMapper(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.free(rs, ps, conn);
		}
		return result;
	}

	protected abstract List<Object> rowMapper(ResultSet rs) throws SQLException;
}