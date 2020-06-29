/**
 * 
 */
package com.chen.service;


import com.chen.bean.Pages;
import com.chen.bean.Types;

/**
 * @author cookie
 * @email 
 */

public interface TypeService {
	public Pages getAllForPages(int pageSize, int nowPage, int typeId);

	/**
	 * @param id
	 * @return
	 */
	public Types find(int id);

	/**
	 * @param type
	 */
	public void add(Types type);

	/**
	 * @param type
	 */
	public void update(Types type);
	
}
