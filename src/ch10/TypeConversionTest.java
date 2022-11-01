package ch10;

public class TypeConversionTest {
	
	public static void main(String[] args) {

		//byte bNum = 125;
		//int iNum = bNum;
		
		int iNum = 255;
		byte bNum = (byte)iNum;
		
		//System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		System.out.println(inum);
		
		double dnum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dnum + (int)fNum;
		int iNum2 = (int)(dnum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
	
}
