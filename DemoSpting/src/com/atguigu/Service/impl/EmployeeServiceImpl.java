package com.atguigu.Service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.atguigu.Service.EmployeeService;
import com.atguigu.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@GET
	@Path(value = "/employee/{id}")
	@Produces(value = "application/json")
	@Override
	public Employee getEmployee(@PathParam(value = "id") Integer id) {
		return new Employee(id, "уехЩ", 28);
	}

}
