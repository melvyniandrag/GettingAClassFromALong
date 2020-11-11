
public class ExtractMessageFromLong {
	
	public static void main(String[] args) {
		/**
		 * TEST 1
		 */
		// Note that for long literals you have to put an "L" at the end of the Hex String.
		long input1 = 0x7F0000FFFF0000FFL;
		// 01111111 00000000 00000000 11111111 11111111 00000000 00000000 11111111
		Message message1      = new Message(input1);
		Message message1_test = new Message(false, true, true, true, true, true, true, true, 
											(byte)0x00, 0x00FFFF00, (char)0x00FF);
		System.out.println("Test 1 Passed: " + message1.equals(message1_test));
		
		/**
		 * TEST 2
		 */
		long input2 = 0x11FFAAFF00112233L;
		// Classwork write out input2 in binary
		Message message2 = new Message(input2);
		// Classwork fill in the Message constructor
		Message message2_test = new Message();
		System.out.println("Test 2 Passed: " + message2.equals(message2_test));
		
		
		/**
		 * TEST 3
		 */
		long input3 = 0x0123456789ABCDEFL;
		// Classwork write out input 3 in binary
		Message message3 = new Message(input3);
		// Classwork fill in the Message constructor
		Message message3_test = new Message();
		System.out.println("Test 3 Passed: " + message3.equals(message3_test));
	}
}

