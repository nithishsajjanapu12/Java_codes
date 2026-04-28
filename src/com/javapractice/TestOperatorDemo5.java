package com.javapractice;

public class TestOperatorDemo5 {

	// 8	4	2	1
	// 0	0	1	1
	// 0	1	0	0
	//--------------------
	// 0	1	1	1       -> 0 + 4 + 2 + 1 = 7
	public static void main(String[] args) {
		int x = 6,y = 3 ,z = 4;
		//           ( 6 > 3 )? (3 ^ 4) : (4 ^ 6)
		/*              true ?  (3 ^ 4 )    
		 *         				= 7
		 */
		int result = (x > y) ? (y ^ z) : ( z ^ x);
		System.out.println(result);
	}

}
