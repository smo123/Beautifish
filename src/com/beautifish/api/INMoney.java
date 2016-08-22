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
import com.beautifish.models.InMoney;
import com.beautifish.models.ReqResult;
import com.google.gson.Gson;

public class INMoney extends HttpServlet {
	private static final long serialVersionUID = -6618713857659810958L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String money_id = req.getParameter("money_id");
		String from_uid = req.getParameter("from_uid");
		String to_uid = req.getParameter("to_uid");
		String money_amount = req.getParameter("money_amount");
		String direct = req.getParameter("direct");
		String in_money_time = req.getParameter("in_money_time");
		String is_open = req.getParameter("is_open");

		InMoney inMoney = new InMoney();
		inMoney.setMoney_id(money_id);
		inMoney.setFrom_uid(from_uid);
		inMoney.setTo_uid(to_uid);
		inMoney.setMoney_amount(money_amount);
		inMoney.setDirect(direct);
		inMoney.setIn_money_time(in_money_time);
		inMoney.setIs_open(is_open);

		PrintWriter out = resp.getWriter();
		try {
			boolean flag = DAOFactory.getIDAOInstance().inMoney(inMoney);
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(flag){
				reqResult.setCode("200");
				reqResult.setMsg("充值成功");
				map.put(ReqResult.TAG, reqResult);
				map.put(InMoney.TAG, inMoney);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("充值失败，请重新充值");
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