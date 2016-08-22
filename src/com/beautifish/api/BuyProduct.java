/**
 * @author jinba
 *
 */
package com.beautifish.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beautifish.factory.DAOFactory;
import com.beautifish.models.MyProduct;
import com.beautifish.models.ReqResult;
import com.google.gson.Gson;

public class BuyProduct extends HttpServlet {
	private static final long serialVersionUID = 1042908819327573683L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String product_id = req.getParameter("product_id");
		String icon = req.getParameter("icon");
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		String price = req.getParameter("price");
		String sales = req.getParameter("sales");
		String sale_price = req.getParameter("sale_price");
		String is_sale = req.getParameter("is_sale");
		String is_hot = req.getParameter("is_hot");
		String is_recommend = req.getParameter("is_recommend");
		String uid = req.getParameter("uid");
		String buy_time = req.getParameter("buy_time");

		MyProduct myProduct = new MyProduct();
		myProduct.setProduct_id(product_id);
		myProduct.setIcon(icon);
		myProduct.setTitle(title);
		myProduct.setDescription(description);
		myProduct.setPrice(price);
		myProduct.setSales(sales);
		myProduct.setSale_price(sale_price);
		myProduct.setIs_sale(is_sale);
		myProduct.setIs_hot(is_hot);
		myProduct.setIs_recommend(is_recommend);
		myProduct.setUid(uid);
		myProduct.setBuy_time(buy_time);

		PrintWriter out = resp.getWriter();
		try {
			boolean flag = DAOFactory.getIDAOInstance().buyProduct(myProduct);
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(flag){
				reqResult.setCode("200");
				reqResult.setMsg("π∫¬Ú≥…π¶");
				map.put(ReqResult.TAG, reqResult);
				map.put(MyProduct.TAG, myProduct);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("π∫¬Ú ß∞‹£¨«Î÷ÿ ‘");
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