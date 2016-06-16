package org.cap.productDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.cap.pojo.Category;



public class ProductDaoImpl {


	public Connection getMySqlConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "India123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	

	public List<Category> getAllCategory() {

		List<Category> categories = new ArrayList<Category>();
		
	
		Connection conn= getMySqlConnection();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		String sql="select * from category;";
		
		
		
		try {
			stmt=conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){  
		Category category=new Category();
				category.setCategory_Id(rs.getInt("category_Id"));
				category.setCategory_name(rs.getString("category_Name"));
			
				categories.add(category);
		
				}  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				if(stmt!=null)
				stmt.close();
				if(conn!=null)
					conn.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return categories;
	}

}
