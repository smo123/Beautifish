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
import com.beautifish.models.OutMoney;
import com.beautifish.models.ReqResult;
import com.google.gson.Gson;

public class OUTMoney extends HttpServlet {
	private static final long serialVersionUID = -6618713857659810958L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String money_id = req.getParameter("money_id");
		String applicant_uid = req.getParameter("applicant_uid");
		String applicant_uname = req.getParameter("applicant_uname");
		String applicant_phone = req.getParameter("applicant_phone");
		String applicant_wechat = req.getParameter("applicant_wechat");
		String applicant_alipay = req.getParameter("applicant_alipay");
		String applicant_qq = req.getParameter("applicant_qq");
		String money_amount = req.getParameter("money_amount");
		String apply_time = req.getParameter("apply_time");
		String handle_time = req.getParameter("handle_time");
		String handler = req.getParameter("handler");
		String status_code = req.getParameter("status_code");
		String status_msg = req.getParameter("status_msg");

		OutMoney outMoney = new OutMoney();
		outMoney.setMoney_id(money_id);
		outMoney.setApplicant_uid(applicant_uid);
		outMoney.setApplicant_uname(applicant_uname);
		outMoney.setApplicant_phone(applicant_phone);
		outMoney.setApplicant_wechat(applicant_wechat);
		outMoney.setApplicant_alipay(applicant_alipay);
		outMoney.setApplicant_qq(applicant_qq);
		outMoney.setMoney_amount(money_amount);
		outMoney.setApply_time(apply_time);
		outMoney.setHandle_time(handle_time);
		outMoney.setHandler(handler);
		outMoney.setStatus_code(status_code);
		outMoney.setStatus_msg(status_msg);

		PrintWriter out = resp.getWriter();
		try {
			boolean flag = DAOFactory.getIDAOInstance().outMoney(outMoney);
			ReqResult reqResult = new ReqResult();
			HashMap<String, Object> map = new HashMap<>();
			if(flag){
				reqResult.setCode("200");
				reqResult.setMsg("…Í«Î≥…π¶£¨«Îµ»¥˝…Û∫À");
				map.put(ReqResult.TAG, reqResult);
				map.put(OutMoney.TAG, outMoney);
			}else {
				reqResult.setCode("400");
				reqResult.setMsg("…Í«Î ß∞‹£¨«Î÷ÿ–¬…Í«Î");
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