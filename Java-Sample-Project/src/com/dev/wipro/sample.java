package src.com.dev.wipro;



public class sample {
  public static	void main(String [] arg) {
	  System.out.println("Hello world");
        sample ob = new sample();
        ob.m1(null);
  }

  void m1(Object o)
  {
    System.out.println(o);
  }

    void m1(String o)
    {
        System.out.println(o);
    }

}
