/**
 * 
 */
package com.chen.dao;

import java.util.List;

import com.chen.bean.Topics;
import com.chen.bean.Types;

/**
 * @author cookie
 * @email 
 */
public interface TopicDao {
	public boolean add(Topics topic);

	/**
	 * @param id
	 * @return
	 */
	public Topics find(int id);

	public boolean update(Topics topic);

	/**
	 * @param index
	 * @return
	 */
	public List<Topics> getIndexFresh(int index);

	/**
	 * @return
	 */
	public List<Topics> getAll();

	/**
	 * @param index
	 * @return
	 */
	public List<Topics> getIndexHot(int index);

	/**
	 * @param listType
	 * @return
	 */
	public List<Topics> getByType(List<Types> listType);

	/**
	 * @param topic
	 */
	public void delete(Topics topic);

	/**
	 * @param index
	 * @return
	 */
	public List<Topics> getIndexNice(int index);

}
