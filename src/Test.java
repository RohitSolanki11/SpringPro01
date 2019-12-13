
public class Test {
	private int id;
	private String s;
	public Test(int id , String s)
	{
		this.id = id;
		this.s = s;
	}

	public static void main(String[] args) {
		System.out.println("main");
        Test d = new Test(100,"shubham");
        Test d1 = new Test(100,"shubham");
        System.out.println(d.hashCode());
        System.out.println(d1.hashCode());
        System.out.println(d.equals(d1));
	}
	public boolean equals(Object o)
	{
		Test t =(Test) o;
		if(this.hashCode()==t.hashCode())
			
		return true;
		else
			return false;
	}
	
	public int hashCode()
	{
		
		String s1 = s+id;
		return s1.hashCode();
	}

	

	public String toString()
	{
		return ("id is ="+id+"  name is ="+s);
	}

	

}
