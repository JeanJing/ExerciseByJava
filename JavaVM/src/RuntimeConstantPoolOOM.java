
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {  
        String str1 = new StringBuilder("¼ÆËã»ú").append("Èí¼þ").toString();  
        String str_1 = str1.intern();
        System.out.println( str_1 == str1);  
          
        String str2 = new StringBuilder("pri").append("vate").toString();  
        String str_2 = str2.intern();
        System.out.println(str_2 == str2); 
        String str3 = str2.intern();
        
        Object  o = new Object();
        
    }

}
