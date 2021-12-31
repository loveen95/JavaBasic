package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {

	public boolean insert(String uid, String ume) throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "INSERT INTO memo(id,memo) VALUES(?,?)";

		conn = ConnectionPool.get();
		
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);
		stmt.setNString(2, ume);

		int result = stmt.executeUpdate();

		return result == 1;
	}
}