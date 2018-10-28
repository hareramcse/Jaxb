package com.cisco;

import javax.xml.bind.JAXBContext;

public class ObjectToSchema {
	public static void main(String[] args) {
		try {
			JAXBContext.newInstance(Employee.class).generateSchema(new MySchemaOutputResolver());
			System.out.println("schema generated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
