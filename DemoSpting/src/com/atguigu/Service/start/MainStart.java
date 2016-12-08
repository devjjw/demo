package com.atguigu.Service.start;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.atguigu.Service.impl.EmployeeServiceImpl;

public class MainStart {
	public static void main(String[] args) {
		JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
		bean.setAddress("http://localhost:8888/DemoSpting");
		bean.setServiceClass(EmployeeServiceImpl.class);
		bean.create().start();
	}
}
