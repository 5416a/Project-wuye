package com.room.dao;

import java.util.List;

import com.room.bean.Notice;
/**
 * 
 * @ClassName: INoticeDao
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:16:36
 * @param:
 */
public interface INoticeDao {
	List<Notice> FindAll();
	Notice Select(String id);
	void Add(Notice n);
	void Update(Notice n);
	void Delete(String id);
}
