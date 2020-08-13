package com.room.service.impl;

import java.util.List;

import com.room.bean.Inspection;
import com.room.dao.IInspectionDao;
import com.room.dao.impl.InspectionDaoImpl;
import com.room.service.IInspectionService;
/**
 * 
 * @ClassName: InspectionServiceImpl
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:27:12
 * @param:
 */
public class InspectionServiceImpl implements IInspectionService{
	IInspectionDao iid = new InspectionDaoImpl();
	public List<Inspection> findAllinspections() {
		List<Inspection> list = iid.getAllInspection();
		return list;
	}

	public void save(Inspection i) {
		iid.save(i);
	}

	public Inspection findById(String id) {
		Inspection i = iid.getInspectionById(id);
		return i;
	}

	public void update(Inspection i) {
		iid.update(i);
	}

	public void delete(String id) {
		iid.delete(id);
	}

}
