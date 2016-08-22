/**
 * @author jinba
 *
 */
package com.beautifish.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beautifish.factory.DAOFactory;
import com.beautifish.models.Product;
import com.beautifish.models.ReqResult;
import com.google.gson.Gson;

public class QueryAllProduct extends HttpServlet {
	private static final long serialVersionUID = -743165200608281338L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		try {
			ArrayList<Product> products = DAOFactory.getIDAOInstance().queryAllProduct();
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(products.size()>0){
				reqResult.setCode("200");
				reqResult.setMsg("数据加载成功");
				map.put(ReqResult.TAG, reqResult);
				map.put(Product.TAG, products);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("数据加载失败，请再次请求");
				map.put(ReqResult.TAG, reqResult);
			}
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("application/json; charset=utf-8");
			out.write(new Gson().toJson(map));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			out.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
}