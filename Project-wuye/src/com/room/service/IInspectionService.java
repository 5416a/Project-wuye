package com.room.service;

import java.util.List;

import com.room.bean.Inspection;

/**
 * 
 * @ClassName: IInspectionService
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:25:07
 * @param:
 */
public interface IInspectionService {
	List<Inspection> findAllinspections();
	void save(Inspection i);
	Inspection findById(String id);
	void update(Inspection i);
	void delete(String id);
}
