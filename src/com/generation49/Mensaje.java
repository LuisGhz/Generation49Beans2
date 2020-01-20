package com.generation49;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mimensajitu1")
@RequestScoped
public class Mensaje {

	public String diHola()
	{
		return "Holi!";
	}
	
	public String diHola(String msg)
	{
		return "Holi" + msg + "!";
	}
	
	public int suma(int a, int b)
	{
		return a + b;
	}
}
