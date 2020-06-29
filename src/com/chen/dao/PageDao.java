/**
 * 
 */
package com.chen.dao;

import java.util.List;

import org.hibernate.Query;

/**
 * @author cookie
 * @email 
 */
public interface PageDao {
	public int getAllRowCount(String hql);
	public List query_Objects_ForPages(String hql, int offset, int length);
}
