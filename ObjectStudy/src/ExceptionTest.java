public class ExceptionTest
{
    public static void main(String[] args)
    {
        int c = 0;
        try
        {
            int a = 3;
            int b = 0;

            // ������������쳣
            c = a / b;

            // ��ô�쳣֮��Ĵ��붼���ᱻִ��
            System.out.println("Hello World");
        }
        catch (ArithmeticException e)
        {
        	System.out.println("�һ������û��catch��");
            //e.printStackTrace();
        }
        finally
        {
            //������û�з����쳣��finally���鶼�ᱻִ��
            System.out.println("Welcome");
        }

        System.out.println(c);
        // ��bΪ0ʱ�����쳣�����Ϊc�ĳ�ʼֵ0
    }
}