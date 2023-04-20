import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

@Test
public void testFilter() {
    List<String> in = new ArrayList<>();
    in.add("whats up");
    in.add("hey");
    in.add("a");
    in.add("b");

    List<String> out = ListExamples.filter(in, new LongerThan5());
    List<String> expected = new ArrayList<>();
    expected.add("whats up");
    assertEquals(expected.size(), out.size());
}

@Test
public void testMerge() {
    List<String> in1 = new ArrayList<>();
    in1.add("a");
    in1.add("b");
    in1.add("c");

    List<String> in2 = new ArrayList<>();
    in2.add("d");
    in2.add("e");
    in2.add("f");

    List<String> out = ListExamples.merge(in1, in2);

    String[] expected = {"a", "b", "c", "d", "e", "f"};
    assertArrayEquals(expected, out.toArray());
}



}