package com.room.service;

import java.util.List;

import com.room.bean.Notice;

/**
 * 
 * @ClassName: INoticeService
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����9:25:25
 * @param:
 */
public interface INoticeService {
	List<Notice> FindAll();
	Notice Select(String id);
	void Add(Notice n);
	void Delete(String id);
	void Update(Notice n);

}
