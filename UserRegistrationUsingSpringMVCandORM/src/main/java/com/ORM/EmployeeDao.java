package com.ORM;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entity.Employee;

public class EmployeeDao {
	private HibernateTemplate hiber;

	public HibernateTemplate getHiber() {
		return hiber;
	}

	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
	@Transactional
	public int insert(Employee e)
	{
		hiber.save(e);
		return 1;
	}
}
