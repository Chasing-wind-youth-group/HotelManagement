package com.icss.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.TypeDao;
import com.icss.hotel.pojo.Type;
import com.icss.hotel.service.TypeService;
@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
	TypeDao dao;
	@Override
	public List<Type> selectAllType() {
		// TODO Auto-generated method stub
		List<Type> list = dao.selectAllType();
		System.out.println("service"+list);
		return list;
	}

}
