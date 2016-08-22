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

public class Register extends HttpServlet {
	private static final long serialVersionUID = -9078435212376481584L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = req.getParameter("uid");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String wechat = req.getParameter("wechat");
		String qq = req.getParameter("qq");
		String alipay = req.getParameter("alipay");
		String parent = req.getParameter("parent");
		String money = req.getParameter("money");
		String registerTime = req.getParameter("registerTime");
		
		User user = new User();
		user.setUid(uid);
		user.setUserName(userName);
		user.setPassword(password);
		user.setPhone(phone);
		user.setWechat(wechat);
		user.setQq(qq);
		user.setAlipay(alipay);
		user.setParent(parent);
		user.setMoney(money);
		user.setRegisterTime(registerTime);

		PrintWriter out = resp.getWriter();
		try {
			boolean flag = DAOFactory.getIDAOInstance().register(user);
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(flag){
				reqResult.setCode("200");
				reqResult.setMsg("×¢²á³É¹¦");
				map.put(ReqResult.TAG, reqResult);
				map.put(User.TAG, user);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("×¢²áÊ§°Ü£¬ÇëÖØÐÂ×¢²á");
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