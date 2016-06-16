package org.cap.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cap.pojo.Category;
import org.cap.productDao.ProductDaoImpl;

import com.google.gson.Gson;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		ProductDaoImpl pdao=new ProductDaoImpl();
		List<Category> categories=pdao.getAllCategory();

		Gson myJson=new Gson();
		
	String categoryJson=myJson.toJson(categories);
		
		out.println(categoryJson);
		
		
	}

}
