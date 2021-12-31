package dao;

import java.sql.*;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemberDAO {

	public int login(String uid, String pw) throws NamingException, SQLException {

		Connection conn = null; // DB연결
		PreparedStatement stmt = null; // SQL 구문
		ResultSet rs = null; // SQL 결과

		String sql = "SELECT id, password FROM user WHERE id=?";

		conn = ConnectionPool.get();
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);

		rs = stmt.executeQuery();

		if (!rs.next()) { // 아이디 존재 X
			return 1;
		}
		if (!pw.equals(rs.getNString("password"))) { // 비밀번호 불일치
			return 2;
		}
		return 0;
	}

	public boolean exist(String uid) throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT id FROM user WHERE id = ?";

		conn = ConnectionPool.get();
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);

		rs = stmt.executeQuery();

		return rs.next();
	}

	public boolean insert(String uid, String upw, String una, String uem, String uge)
			throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "INSERT INTO user(id,password,name,gender,email) VALUES(?,?,?,?,?)";

		conn = ConnectionPool.get();
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);
		stmt.setNString(2, upw);
		stmt.setNString(3, una);
		stmt.setNString(4, uge);
		stmt.setNString(5, uem);

		int result = stmt.executeUpdate();

		return result == 1;
	}

	public boolean delete(String uid) throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		String sql = "DELETE FROM user WHERE id = ?";

		conn = ConnectionPool.get();
		stmt = conn.prepareStatement(sql);
		stmt.setNString(1, uid);

		int result = stmt.executeUpdate();

		return result == 1;
	}
}