public class Message {
	public boolean isATrue;
	public boolean isBTrue;
	public boolean isCTrue;
	public boolean isDTrue;
	public boolean isETrue;
	public boolean isFTrue;
	public boolean isGTrue;
	public boolean isHTrue;
	
	public byte anAsciiChar;
	
	public int aFourByteNumber;
	
	public char aJavaChar;
	
	/**
	 * Turn a long into a Message object
	 * 
	 * @param l - an 8 byte long
	 * 
	 * The l is made of 8 bytes. For example:
	 * 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
	 * 
	 * How to parse the long:
	 * The first 8 BITS correspond to the boolean values isATrue, isBTrue... etc.
	 * The next byte represents anAsciiChar
	 * The next four bytes represent aFourByteInteger
	 * The last two bytes represent aJavaChar
	 * 
	 * If you add up the above you'll see one 8 byte long has enough information to populate
	 * the message class.
	 */
	public Message(long input) {
		this.isATrue = ((( input >> 63 ) & 0x01L ) == 0x01L);
		
		//Homework
		//TODO #1: this.isBTrue = ???
		//TODO #2: this.isCTrue = ???
		//TODO #3: this.isDTrue = ???
		//TODO #4: this.isETrue = ???
		//TODO #5: this.isFTrue = ???
		//TODO #6: this.isGTrue = ???
		//TODO #7: this.isHTrue = ???
		//TODO #8: this.anAsciiChar = ???
		//TODO #9: this.aFourByteNumber = ???
		//TODO #10: this.aJavaChar = ???
	}
	
	/**
	 * A second constructor useful for testing
	 * 
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @param E
	 * @param F
	 * @param G
	 * @param H
	 * @param asciiChar
	 * @param i
	 * @param c
	 */
	public Message( boolean A, boolean B, boolean C, boolean D,
					boolean E, boolean F, boolean G, boolean H,
					byte asciiChar, int i, char c ) {
		isATrue = A;
		isBTrue = B;
		isCTrue = C;
		isDTrue = D;
		isETrue = E;
		isFTrue = F;
		isGTrue = G;
		isHTrue = H;
		
		anAsciiChar = asciiChar;
		aFourByteNumber = i;
		aJavaChar = c;		
	}
	
	/**
	 * Default construct. Not useful.
	 */
	public Message() {
		// does nothing.
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return  true;
		}
		
		if(!(o instanceof Message)) {
			return false;
		}
		
		Message that = (Message) o;
		
		//Classwork
		//TODO TODO TODO finish this with class
		// Need to check if the ascii char, int and char are equal too.
		boolean areEqual = (( that.isATrue == this.isATrue ) &&
							( that.isBTrue == this.isBTrue ) &&
							( that.isCTrue == this.isCTrue ) &&
							( that.isDTrue == this.isDTrue ) &&
							( that.isETrue == this.isETrue ) &&
							( that.isFTrue == this.isFTrue ) &&
							( that.isGTrue == this.isGTrue ) &&
							( that.isHTrue == this.isHTrue ) );
		return areEqual;
							
	}
				
}
