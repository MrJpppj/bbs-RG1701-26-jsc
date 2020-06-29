/**
 * 
 */
package com.chen.dao;

import java.util.List;

import com.chen.bean.Helps;

/**
 * @author cookie
 * @email 
 */
public interface HelpDao {
	public List<Helps> getAll();

	/**
	 * @param index
	 * @return
	 */
	public Helps find(int index);

	/**
	 * @param thelp
	 */
	public void add(Helps thelp);

	/**
	 * @param thelp
	 */
	public void update(Helps thelp);

}
