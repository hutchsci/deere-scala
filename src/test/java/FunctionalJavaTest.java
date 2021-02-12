// import org.junit.Before;
// import org.junit.Test;

// import java.util.Arrays;
// import java.util.List;

// import static org.junit.Assert.assertEquals;

// public class FunctionalJavaTest {

//     private FunctionalJava functional;

//     @Before
//     public void setUp() throws Exception {
//         functional = new FunctionalJava();
//     }

//     @Test
//     public void a_shouldReturnEvenNumbers() {
//         List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//         List<Integer> evenIntegers = functional.evenOnly(numbers);

//         List<Integer> expectedInts = Arrays.asList(0, 2, 4, 6, 8);
//         assertEquals(expectedInts, evenIntegers);
//     }

//     @Test
//     public void b_shouldMapStringsToIntegers() {
//         List<String> numberStrings = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

//         List<Integer> numberInts = functional.mapToIntegers(numberStrings);

//         List<Integer> expectedInts = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//         assertEquals(expectedInts, numberInts);
//     }

//     @Test
//     public void c_shouldMapStringsToEvenIntegers() {
//         List<String> numberStrings = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

//         List<Integer> evenIntegers = functional.mapToEvenIntegers(numberStrings);

//         List<Integer> expectedInts = Arrays.asList(0, 2, 4, 6, 8);
//         assertEquals(expectedInts, evenIntegers);
//     }

//     @Test
//     public void d_shouldReturnSquaresOfOddIntegers() {
//         List<String> numberStrings = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

//         List<Integer> squares = functional.squareOdd(numberStrings);

//         List<Integer> expectedInts = Arrays.asList(1, 9, 25, 49, 81);
//         assertEquals(expectedInts, squares);
//     }

//     @Test
//     public void e_shouldNormalizeStrings() {
//         assertEquals("1199AAFF", functional.normalizeColor("1199AAFF"));
//         assertEquals("1199AAFF", functional.normalizeColor("0x1199AAFF"));
//         assertEquals("1199AAFF", functional.normalizeColor("#1199AAFF"));
//         assertEquals("1199AAFF", functional.normalizeColor("0x1199AA"));
//         assertEquals("1199AAFF", functional.normalizeColor("#1199AA"));
//         assertEquals("1199AAFF", functional.normalizeColor("1199AA"));
//     }
// }
