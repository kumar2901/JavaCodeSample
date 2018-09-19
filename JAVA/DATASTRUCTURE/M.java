 class Base
    {
        int i=20;
        public  void  fun()
        {
            System.out.println("Base" +i);
        }
    }

    class Derived extends Base
    {
       static int i=100;
        public void  fun()
        {

            System.out.println("Der" +i);
        }
    }

    class M
    {
        public static void main(String args[])
        {

           Base d=new Derived();
           d.fun();
        }
    }