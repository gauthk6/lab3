import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = new int[]{ 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);

    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
  } 

  @Test
  public void testReversed2() {
    int[] input1 = new int[]{1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void nullTestReversed() {
    int[] input1 = new int[]{};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }

  @Test
  public void nullTestReverseInPlace() {
    int[] input1 = new int[]{};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{}, input1);
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 1, 2, 3 , 4, 5 };
    
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1),0.0);
  }
}
