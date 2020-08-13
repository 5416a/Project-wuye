package com.room.service;

import java.util.List;

import com.room.bean.House;

/**
 * 
 * @ClassName: IHouseService
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:24:56
 * @param:
 */
public interface IHouseService {
	List<House> findAllHouse();
	List<House> findByOwnerid(String oid);
	House findById(String id);
	void add(House h);
	void delete(String id);
	void update(House h);
}
