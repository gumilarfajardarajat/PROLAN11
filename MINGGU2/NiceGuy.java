public class NiceGuy{
	private String name;
	
	public NiceGuy(String name)
	{
		this.name=name;
		System.out.println("Instanitation of NiceGuy named"+name);
	}
	
	public void sayHello()
	{
		System.out.println("Hello Object Oriented World..!!!");
	}
	
	public void sayHelloOutLoud()
	{
		System.out.println("HELLOOO OBJECT ORIENTED WORLD..!!!");
	}
	public String getName()
	{
		return name;
	}
}