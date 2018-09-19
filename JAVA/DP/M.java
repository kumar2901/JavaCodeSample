interface Parent
{
    public void run();
}
class Child implements Parent
{
    public void run()
    {
        System.out.println("HackerEarth");
    }
}
class Subclass extends Child
{
    public void run()
    {
        System.out.println("IndiaHacks");
    }
}
class M
{
    public static void main(String args[])
    {
     Parent sc= new Subclass();
        sc.run();
       Parent c=new Child();
         c.run();
}
}