package com.room.dao;

import java.util.List;

import com.room.bean.Inspection;
/**
 * 
 * @ClassName: IInspectionDao
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:15:52
 * @param:
 */
public interface IInspectionDao {
	List<Inspection> getAllInspection();
	void save(Inspection i); 
	
	Inspection getInspectionById(String id);
	void update(Inspection i);
	
	void delete(String id);

}
