/**
 * @author jinba
 *
 */
package com.beautifish.dao;

import java.util.ArrayList;

import com.beautifish.models.InMoney;
import com.beautifish.models.MyProduct;
import com.beautifish.models.OutMoney;
import com.beautifish.models.Product;
import com.beautifish.models.User;

public interface IDAO {

	public boolean register(User user) throws Exception;
	public User login(User user) throws Exception;
	public ArrayList<Product> queryAllProduct() throws Exception;
	public boolean buyProduct(MyProduct myProduct) throws Exception;
	public ArrayList<MyProduct> queryMyProduct(User user) throws Exception;
	public boolean inMoney(InMoney inMoney) throws Exception;
	public ArrayList<InMoney> queryInMoney(User user) throws Exception;
	public boolean outMoney(OutMoney outMoney) throws Exception;
	public ArrayList<OutMoney> queryOutMoney(User user) throws Exception;
	
}