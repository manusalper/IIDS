package prBinaryString;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryStringTest {
	
	private BinaryString bitset1, bitset2, bitset3, bitset4, bitset5;
	private String pruebaString2 = "1010101010", pruebaString3="100101", pruebaString4="0110101", pruebaString5="1111000";
	
@Before
public void antesDelTest(){
	bitset1=new BinaryString (10);
	bitset2=new BinaryString(pruebaString2);
	bitset3=new BinaryString(pruebaString3);
	bitset4=new BinaryString(pruebaString4);
	bitset5=new BinaryString(pruebaString5);
}

@Test
public void testLength(){
	assertEquals(10, bitset1.length());
	assertEquals(10, bitset2.length());
	assertEquals(6, bitset3.length());
	assertEquals(7, bitset4.length());
	assertEquals(7, bitset5.length());

	
}

}


