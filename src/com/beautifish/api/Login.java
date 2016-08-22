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
import com.beautifish.models.ReqResult;
import com.beautifish.models.User;
import com.google.gson.Gson;

public class Login extends HttpServlet {
	private static final long serialVersionUID = -3526241376784691309L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setPhone(phone);
		user.setPassword(password);
		
		PrintWriter out = resp.getWriter();
		try {
			User mUser = DAOFactory.getIDAOInstance().login(user);
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(mUser.getPhone() != null){
				reqResult.setCode("200");
				reqResult.setMsg("µÇÂ¼³É¹¦");
				map.put(ReqResult.TAG, reqResult);
				map.put(User.TAG, mUser);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("µÇÂ¼Ê§°Ü£¬ÇëÖØÐÂµÇÂ¼");
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