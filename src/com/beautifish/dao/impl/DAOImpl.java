/**
 * @author jinba
 *
 */
package com.beautifish.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.beautifish.dao.IDAO;
import com.beautifish.models.InMoney;
import com.beautifish.models.MyProduct;
import com.beautifish.models.OutMoney;
import com.beautifish.models.Product;
import com.beautifish.models.User;

public class DAOImpl implements IDAO{

	private PreparedStatement psptmt;
	private Connection conn;
	
	public DAOImpl(Connection conn){
		this.conn = conn;
	}
	
	@Override
	public boolean register(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO user(uid, userName, password, phone, wechat, qq, alipay, parent, money, registerTime) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, user.getUid());
		psptmt.setString(2, user.getUserName());
		psptmt.setString(3, user.getPassword());
		psptmt.setString(4, user.getPhone());
		psptmt.setString(5, user.getWechat());
		psptmt.setString(6, user.getQq());
		psptmt.setString(7, user.getAlipay());
		psptmt.setString(8, user.getParent());
		psptmt.setString(9, user.getMoney());
		psptmt.setString(10, user.getRegisterTime());
		int result = psptmt.executeUpdate();
		if (result>0) {
			flag = true;
		}
		psptmt.close();
		return flag;
	}

	@Override
	public User login(User user) throws Exception {
		// TODO Auto-generated method stub
		User mUser = new User();
		String sql = "SELECT * FROM user WHERE phone=? AND password=?";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, user.getPhone());
		psptmt.setString(2, user.getPassword());
		ResultSet result = psptmt.executeQuery();
		if (result.next()) {
			mUser.setUid(result.getString(1));
			mUser.setUserName(result.getString(2));
			mUser.setPhone(result.getString(4));
			mUser.setWechat(result.getString(5));
			mUser.setQq(result.getString(6));
			mUser.setAlipay(result.getString(7));
			mUser.setParent(result.getString(8));
			mUser.setMoney(result.getString(9));
			mUser.setRegisterTime(result.getString(10));
		}
		psptmt.close();
		return mUser;
	}

	@Override
	public ArrayList<Product> queryAllProduct() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM product";
		psptmt = conn.prepareStatement(sql);
		ResultSet result = psptmt.executeQuery();
		while(result.next()) {
			Product product = new Product();
			product.setProduct_id(result.getString(1));
			product.setIcon(result.getString(2));
			product.setTitle(result.getString(3));
			product.setDescription(result.getString(4));
			product.setPrice(result.getString(5));
			product.setSales(result.getString(6));
			product.setSale_price(result.getString(7));
			product.setIs_sale(result.getString(8));
			product.setIs_hot(result.getString(9));
			product.setIs_recommend(result.getString(10));
			products.add(product);
		}
		psptmt.close();
		return products;
	}

	@Override
	public boolean buyProduct(MyProduct myProduct) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO myproduct(product_id, icon, title, description, price, sales, sale_price, is_sale, is_hot, is_recommend, uid, buy_time) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, myProduct.getProduct_id());
		psptmt.setString(2, myProduct.getIcon());
		psptmt.setString(3, myProduct.getTitle());
		psptmt.setString(4, myProduct.getDescription());
		psptmt.setString(5, myProduct.getPrice());
		psptmt.setString(6, myProduct.getSales());
		psptmt.setString(7, myProduct.getSale_price());
		psptmt.setString(8, myProduct.getIs_sale());
		psptmt.setString(9, myProduct.getIs_hot());
		psptmt.setString(10, myProduct.getIs_recommend());
		psptmt.setString(11, myProduct.getUid());
		psptmt.setString(12, myProduct.getBuy_time());
		int result = psptmt.executeUpdate();
		if (result>0) {
			flag = true;
		}
		psptmt.close();
		return flag;
	}

	@Override
	public ArrayList<MyProduct> queryMyProduct(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<MyProduct> myProducts = new ArrayList<>();
		String sql = "SELECT * FROM myproduct WHERE uid=?";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, user.getUid());
		ResultSet result = psptmt.executeQuery();
		while(result.next()) {
			MyProduct myProduct = new MyProduct();
			myProduct.setProduct_id(result.getString(1));
			myProduct.setIcon(result.getString(2));
			myProduct.setTitle(result.getString(3));
			myProduct.setDescription(result.getString(4));
			myProduct.setPrice(result.getString(5));
			myProduct.setSales(result.getString(6));
			myProduct.setSale_price(result.getString(7));
			myProduct.setIs_sale(result.getString(8));
			myProduct.setIs_hot(result.getString(9));
			myProduct.setIs_recommend(result.getString(10));
			myProduct.setUid(result.getString(11));
			myProduct.setBuy_time(result.getString(12));
			myProducts.add(myProduct);
		}
		psptmt.close();
		return myProducts;
	}

	@Override
	public boolean inMoney(InMoney inMoney) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO in_money(money_id, from_uid, to_uid, money_amount, direct, in_money_time, is_open) VALUES(?, ?, ?, ?, ?, ?, ?)";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, inMoney.getMoney_id());
		psptmt.setString(2, inMoney.getFrom_uid());
		psptmt.setString(3, inMoney.getTo_uid());
		psptmt.setString(4, inMoney.getMoney_amount());
		psptmt.setString(5, inMoney.getDirect());
		psptmt.setString(6, inMoney.getIn_money_time());
		psptmt.setString(7, inMoney.getIs_open());
		int result = psptmt.executeUpdate();
		if (result>0) {
			flag = true;
		}
		psptmt.close();
		return flag;
	}

	@Override
	public ArrayList<InMoney> queryInMoney(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<InMoney> inMoneys = new ArrayList<>();
		String sql = "SELECT * FROM in_money WHERE from_uid=?";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, user.getUid());
		ResultSet result = psptmt.executeQuery();
		while(result.next()) {
			InMoney inMoney = new InMoney();
			inMoney.setMoney_id(result.getString(1));
			inMoney.setFrom_uid(result.getString(2));
			inMoney.setTo_uid(result.getString(3));
			inMoney.setMoney_amount(result.getString(4));
			inMoney.setDirect(result.getString(5));
			inMoney.setIn_money_time(result.getString(6));
			inMoney.setIs_open(result.getString(7));
			inMoneys.add(inMoney);
		}
		psptmt.close();
		return inMoneys;
	}

	@Override
	public boolean outMoney(OutMoney outMoney) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "INSERT INTO out_money(money_id, applicant_uid, applicant_uname, applicant_phone, applicant_wechat, applicant_alipay, applicant_qq, money_amount, apply_time, handle_time, handler, status_code, status_msg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, outMoney.getMoney_id());
		psptmt.setString(2, outMoney.getApplicant_uid());
		psptmt.setString(3, outMoney.getApplicant_uname());
		psptmt.setString(4, outMoney.getApplicant_phone());
		psptmt.setString(5, outMoney.getApplicant_wechat());
		psptmt.setString(6, outMoney.getApplicant_alipay());
		psptmt.setString(7, outMoney.getApplicant_qq());
		psptmt.setString(8, outMoney.getMoney_amount());
		psptmt.setString(9, outMoney.getApply_time());
		psptmt.setString(10, outMoney.getHandle_time());
		psptmt.setString(11, outMoney.getHandler());
		psptmt.setString(12, outMoney.getStatus_code());
		psptmt.setString(13, outMoney.getStatus_msg());
		int result = psptmt.executeUpdate();
		if (result>0) {
			flag = true;
		}
		psptmt.close();
		return flag;
	}

	@Override
	public ArrayList<OutMoney> queryOutMoney(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<OutMoney> outMoneys = new ArrayList<>();
		String sql = "SELECT * FROM out_money WHERE applicant_uid=?";
		psptmt = conn.prepareStatement(sql);
		psptmt.setString(1, user.getUid());
		ResultSet result = psptmt.executeQuery();
		while(result.next()) {
			OutMoney outMoney = new OutMoney();
			outMoney.setMoney_id(result.getString(1));
			outMoney.setApplicant_uid(result.getString(2));
			outMoney.setApplicant_uname(result.getString(3));
			outMoney.setApplicant_phone(result.getString(4));
			outMoney.setApplicant_wechat(result.getString(5));
			outMoney.setApplicant_alipay(result.getString(6));
			outMoney.setApplicant_qq(result.getString(7));
			outMoney.setMoney_amount(result.getString(8));
			outMoney.setApply_time(result.getString(9));
			outMoney.setHandle_time(result.getString(10));
			outMoney.setHandler(result.getString(11));
			outMoney.setStatus_code(result.getString(12));
			outMoney.setStatus_msg(result.getString(13));
			outMoneys.add(outMoney);
		}
		psptmt.close();
		return outMoneys;
	}

}