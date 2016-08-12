public class ExceptionTest
{
    public static void main(String[] args)
    {
        int c = 0;
        try
        {
            int a = 3;
            int b = 0;

            // 这块代码出现了异常
            c = a / b;

            // 那么异常之后的代码都不会被执行
            System.out.println("Hello World");
        }
        catch (ArithmeticException e)
        {
        	System.out.println("我怀疑这个没有catch到");
            //e.printStackTrace();
        }
        finally
        {
            //不管有没有发生异常，finally语句块都会被执行
            System.out.println("Welcome");
        }

        System.out.println(c);
        // 当b为0时，有异常，输出为c的初始值0
    }
}