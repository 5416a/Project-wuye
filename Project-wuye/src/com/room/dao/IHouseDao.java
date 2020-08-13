package com.room.dao;

import java.util.List;

import com.room.bean.House;
/**
 * 
 * @ClassName: IHouseDao
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:15:37
 * @param:
 */
public interface IHouseDao {
	List<House> getAllHouse();
	void add(House h);
	void update(House h);
	void delete(String id);
	List<House> getHouseByOwnerid(String oid);
	House findById(String id);
}
