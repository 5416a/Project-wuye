package com.room.service;

import java.util.List;

import com.room.bean.Maintain;

/**
 * 
 * @ClassName: IMaintainService
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:25:16
 * @param:
 */
public interface IMaintainService {
	List<Maintain> findAllMaintains();
	void save(Maintain a); 
	
	Maintain findById(String id);
	List<Maintain> findByMaintainer(String maintainer);
	
	void update(Maintain a);
	
	void delete(String id);

}
