class Hi extends Thread
{
   public void run()
   {
    for(i=0;i<10;i++)
	{
     print("hi");
    }
   }
}
class Huku extends thread 
{
   public void run()
   {
    for (i=0;i<10;i++)
	 {
      print("Huku"); 
     }
   }
}
class mainclass 
{
Hi t1 = new Hi ();
Huku t2 = new Huku();

t1.start();
t2.start();
}
 