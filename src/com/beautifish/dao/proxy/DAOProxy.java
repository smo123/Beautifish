/**
 * @author jinba
 *
 */
package com.beautifish.dao.proxy;

import java.util.ArrayList;

import com.beautifish.dao.IDAO;
import com.beautifish.dao.impl.DAOImpl;
import com.beautifish.db.DatabaseConnection;
import com.beautifish.models.InMoney;
import com.beautifish.models.MyProduct;
import com.beautifish.models.OutMoney;
import com.beautifish.models.Product;
import com.beautifish.models.User;

public class DAOProxy implements IDAO{

	private DatabaseConnection conn;
	private IDAO dao;
	
	public DAOProxy(){
		try {
			conn = new DatabaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao = new DAOImpl(conn.getConnection());
	}

	@Override
	public boolean register(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			flag = dao.register(user);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return flag;
	}

	@Override
	public User login(User user) throws Exception {
		// TODO Auto-generated method stub
		User mUser = null;
		try {
			mUser = dao.login(user);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return mUser;
	}

	@Override
	public ArrayList<Product> queryAllProduct() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Product> products = null;
		try {
			products = dao.queryAllProduct();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return products;
	}

	@Override
	public boolean buyProduct(MyProduct myProduct) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			flag = dao.buyProduct(myProduct);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return flag;
	}

	@Override
	public ArrayList<MyProduct> queryMyProduct(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<MyProduct> myProducts = null;
		try {
			myProducts = dao.queryMyProduct(user);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return myProducts;
	}

	@Override
	public boolean inMoney(InMoney inMoney) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			flag = dao.inMoney(inMoney);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return flag;
	}

	@Override
	public ArrayList<InMoney> queryInMoney(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<InMoney> iMoneys = null;
		try {
			iMoneys = dao.queryInMoney(user);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return iMoneys;
	}

	@Override
	public boolean outMoney(OutMoney outMoney) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			flag = dao.outMoney(outMoney);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return flag;
	}

	@Override
	public ArrayList<OutMoney> queryOutMoney(User user) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<OutMoney> outMoneys = null;
		try {
			outMoneys = dao.queryOutMoney(user);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			conn.close();
		}
		return outMoneys;
	}

}