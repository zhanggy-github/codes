package com.codes.persistence.hibernate.dao;

import java.io.Serializable;

import com.codes.persistence.hibernate.domain.Entity;
/**
 * 实体DAO的标识接口
 * @author Administrator
 *
 * 2015年10月27日 下午5:50:55
 */
public interface EntityDao<T extends Entity<ID>, ID extends Serializable> extends Dao {
}
