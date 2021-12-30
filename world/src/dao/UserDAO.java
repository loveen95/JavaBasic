package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {

	public int insert(String uid,String upass, String uname)
			throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = ConnectionPool.get();
			String sql = "INSERT INTO user(id,password,name) VALUES(?,?,?)";
			stmt = conn.prepareStatement(sql);
			
					stmt.setString(1, uid);
					stmt.setString(2, upass);
					stmt.setString(3, uname);
					
					int count = stmt.executeUpdate();
					return(count);
		}finally {
			if(stmt != null) stmt.close();
			if(stmt != null) stmt.close();
			
		}
	}
	public int delete(String uid) throws NamingException, SQLException{
	
		Connection conn = null; //연결 초기화
		PreparedStatement stmt = null; //구문 초기화
		

		conn = ConnectionPool.get();
		String sql = "DELETE FROM user WHERE id =?";
		stmt = conn.prepareStatement(sql);
		  stmt.setNString(1, uid);
		  int count = stmt.executeUpdate();
		  return count;
	
		

	}
	public int login(String uid, String upass) 
			throws NamingException, SQLException{
		Connection conn = null; 
		PreparedStatement stmt = null; 
		ResultSet rs = null;
		
		conn = ConnectionPool.get(); //구문 만들기
		String sql = "SELECT * FROM user WHERE id=?";
		stmt = conn.prepareStatement(sql);
		   stmt.setNString(1, uid);
		   
		rs = stmt.executeQuery(); //rs 결과값을 받아오는것
		if(!rs.next())return 1;
		if(!upass.equals(rs.getString("password"))) return 2; 
		
			return 0;
	}
}
