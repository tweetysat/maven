package be.tuto;

import javax.ejb.Stateless;

@Stateless(mappedName="testEjb")
public class MyEjbImp implements MyEjb
{
	private Tools tools = new Tools();
	
	@Override
	public String sayHello()
	{
		tools.setName("Toto");
		return "Hello World "+tools.getName();
	}

}
