    public class TestException {  
        public static void main(String[] args) {  
            int[] intArray = new int[3];  
            try {  
                for (int i = 0; i <= intArray.length; i++) {  
                    intArray[i] = i;  
                    //System.out.println("intArray[" + i + "] = " + intArray[i]);  
                    System.out.println("intArray[" + i + "]ģ " + (i - 2) + "��ֵ:  "  
                            + intArray[i] / (i - intArray.length));  
                }  
            } catch (ArrayIndexOutOfBoundsException e) {  
                System.out.println("intArray�����±�Խ���쳣��");  
            } catch (ArithmeticException e) {  
                System.out.println("����Ϊ0�쳣��");  
            }  
            System.out.println("��������������");  
        }  
    }  