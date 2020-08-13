package com.room.dao;

import java.util.List;
import com.room.bean.Charge;
/**
 * 
 * @ClassName: IChargeDao
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:14:57
 * @param:
 */
public interface IChargeDao {
	List<Charge> getAllCharge();
	void save(Charge a); 
	Charge getChargeById(String id);
	List<Charge> getChargeByUser(String username);
	void update(Charge a);
	void delete(String id);
}
