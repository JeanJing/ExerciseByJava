
public class StringTest {
	public static void main(String args[]){
		//理解string对象是不可变，通过赋值变得是引用
		/**************
		 * String str1 = "Jing is a good girl.";
		 * String str2 = "Jing is a good girl.";
		 * String str3 = new String("Jing is a good girl.");
		 * System.out.println(str1 == str2);//str是引用，有点像指针
	     * System.out.println(str1 == str3);
		 */
		String str = "Jing is a good girl.           She is very pretty and kind. ";
		String start = "jing";
		String end = "girl";
		System.out.println(str.charAt(1));
		System.out.println(str.endsWith(end));
		System.out.println(str.startsWith(start));
		System.out.println(str.concat("hello"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,7));
		
		//字符串的转换
		System.out.println(str.toUpperCase());//转换为大写字母
		System.out.println(str.toLowerCase());//转换为小写字母
		
		System.out.println(str.trim());//trim 去掉字符串前后的空白符
		//字符串的替换
		System.out.println(str.replace('r', ' '));
		System.out.println(str.replaceAll("is", "are"));
		System.out.println(str.replaceFirst("is", "are"));
		 
		//字符串的分隔
		String []str_new = str.split("is");//split应用新模式的那种不太懂
		for(int i = 0; i < str_new.length; i++){
			System.out.println(str_new[i]);//这个分隔就是用is将字符串分为了两段
		}
        // 重要的事情说三遍	
		// 字符串的匹配，替换，和分割统统可以用正则表达式表示
		//  字符串的匹配，替换，和分割统统可以用正则表达式表示
		// 字符串的匹配，替换，和分割统统可以用正则表达式表示
		
		
		//返回字字符串中某个字符或字符串的索引值
		System.out.println(str.indexOf("very", 18));
		System.out.println(str.lastIndexOf("very",45));//lastValueOf 从最后一个字符开始的第一个字符的位置
		
		//字符串与数组之间的转换
		
		//把字符串转换为数组
		char chars_new[] = str.toCharArray();
		for(int i = 0; i < chars_new.length; i++){
			System.out.print(chars_new[i]);
		}
		System.out.println();
		//把数组转换为字符串
		String str_new1 = String.valueOf(new char[]{'i','c','a','n'});
		System.out.println(str_new1);
		//把字符和数值转换为字符串
		//利用的都是String.valueOf()
		String str_2 = String.valueOf('E');
		System.out.println(str_2);
		
		//格式化一个字符串
		
		System.out.println(String.format("%5.2f", 45.536563465345));
	}

}
