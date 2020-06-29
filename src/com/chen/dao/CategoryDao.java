/**
 * 
 */
package com.chen.dao;

import java.util.List;

import com.chen.bean.Categorys;

/**
 * @author cookie
 * @email 
 */
public interface CategoryDao {
	public boolean add(Categorys cate);
	public boolean delete(int index);
	public boolean update(Categorys cate);
	public List<Categorys> getAll();
	/**
	 * @param id
	 * @return
	 */
	public Categorys find(int id);
}
