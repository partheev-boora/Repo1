package Practice;
// Implementation class code
class DefaultM3 implements TestInterface3, TestInterface4
{
    
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface3.super.show();
        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface4.super.show();
    }
  
    public static void main(String args[])
    {
    	DefaultM3 d = new DefaultM3();
        d.show();
    }
    
}

