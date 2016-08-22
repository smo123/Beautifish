/**
 * @author jinba
 *
 */
package com.beautifish.factory;

import com.beautifish.dao.IDAO;
import com.beautifish.dao.proxy.DAOProxy;

public class DAOFactory {
	
	public static IDAO getIDAOInstance(){
		return new DAOProxy();
	}
	
}