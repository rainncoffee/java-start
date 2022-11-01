package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		//boolean isMarried = true;
		//System.out.println(isMarried);
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
				
		System.out.println(str);
	}

}
