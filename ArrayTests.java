import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
    public void goodReversedInPlace(){
    int[] input1 = {77, 3, 9};
    int[] expected = {9, 3, 77};
    ArrayExamples.reverseInPlace(input1);

    assertArrayEquals(expected, input1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void threeElmReversed(){
    int[] input1 = {34, 21, 76};
   int[] exOut = {76, 21, 34};
    assertArrayEquals(exOut, ArrayExamples.reversed(input1));
  }
}
