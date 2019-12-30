package com.icss.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.OrderDao;
import com.icss.hotel.pojo.Order;
import com.icss.hotel.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderDao dao;

	@Override
	public int addOrder(Order o) {
		// TODO Auto-generated method stub
		return dao.addOrder(o);
	}

	@Override
	public List<Order> selectAllOrder() {
		List<Order> list = dao.selectAllOrder();
		return list;
	}

}