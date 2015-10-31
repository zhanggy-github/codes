package com.codes.persistence.hibernate.dao;

import java.util.List;
import java.util.Map;

/**
 * Hibernate Native SQL 接口
 * @author ZhangGuangYong
 *
 * 2015年11月1日 上午4:13:16
 */
public interface SqlDao extends HqlDao {
	
	// 单行单列->返回Object
	<T> T findForObject(String sql, Class<T> requiredType);
	
	<T> T findForObject(String sql, Class<T> requiredType, Object[] args);
	
	<T> T findForObject(String sql, Class<T> requiredType, Object arg0, Object...rest);
	
	<T> T findForObject(String sql, Class<T> requiredType, Map<String, Object> namedParameter);
	
	// 单行多列->返回Map
	Map<String, Object> findForMap(String sql);
	
	Map<String, Object> findForMap(String sql, Object[] args);
	
	Map<String, Object> findForMap(String sql, Object arg0, Object...rest);
	
	Map<String, Object> findForMap(String sql, Map<String, Object> namedParameter);
	
	// 多行单列->返回单值集合
	<T> List<T> findForList(String sql, Class<T> elementType);
	
	<T> List<T> findForList(String sql, Class<T> elementType, Object[] args);
	
	<T> List<T> findForList(String sql, Class<T> elementType, Object arg0, Object...rest);
	
	<T> List<T> findForList(String sql, Class<T> elementType, Map<String, Object> namedParameter);
	
	// 对数据库的批量写入
	int[] batchUpdate(String...sqls);
	
	int[] batchUpdate(String sql, List<Object[]> argsList);
	
	
	
	
}
