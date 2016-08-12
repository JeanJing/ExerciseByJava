package newi;

import new2.zheng;

class maomao extends zheng{
	zheng zh1 = new zheng();
	{
		//zh1.produce();//不同包的情况下是不可以的
	}
	{
		maomao mao = new maomao();
	    mao.produce();
	}

	
}
public class test{
	public static void main(String args[]){
	     zheng zhe = new zheng();
	     zhe
	}
}