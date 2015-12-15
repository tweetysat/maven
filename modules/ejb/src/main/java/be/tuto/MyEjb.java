package be.tuto;

import javax.ejb.Remote;

@Remote
public interface MyEjb
{
	public String sayHello();
}
