package com.atguigu.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.atguigu.pojo.Employee;

@Path("/crm")
public interface EmployeeService {
	@GET
	@Path(value = "/employee/{id}")
	@Produces(value = "application/json")
	Employee getEmployee(@PathParam("id") Integer id);
}
