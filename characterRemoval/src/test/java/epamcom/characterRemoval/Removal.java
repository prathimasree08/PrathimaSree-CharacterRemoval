package epamcom.characterRemoval;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Removal {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
	
	RemoveFirstTwoCharcaters remove;;
	@BeforeEach
	public void setUp() {
		remove = new RemoveFirstTwoCharcaters();
	}
	@Test
	public void test0Char() {
		remove = new RemoveFirstTwoCharcaters();
	}
	@Test
	public void test1RemoveA() {
		assertEquals("", remove.RemoveA("A"));
	}
	
	@Test
	public void test1CharAAtFirst() {
		assertEquals("B", remove.RemoveA("B"));
	}
	@Test
	public void test2Remove2AChars() {
		assertEquals("", remove.RemoveA("AA"));
	}
	@Test
	public void test2CharsAFirst() {
		assertEquals("B", remove.RemoveA("AB"));
	}
	@Test
	public void test2CharsASecond() {
		assertEquals("B", remove.RemoveA("BA"));
	}
	@Test
	public void test4Chars2A() {
		assertEquals("CD", remove.RemoveA("AACD"));
	}
	
	@Test
	public void test4Chars1A() {
		assertEquals("BCD", remove.RemoveA("ABCD"));
	}
	
	@Test
	public void test4CharsASecond() {
		assertEquals("BCD", remove.RemoveA("BACD"));
	}
	
	@Test
	public void test4CharsNoAFirst() {
		assertEquals("BBAA", remove.RemoveA("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", remove.RemoveA("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", remove.RemoveA("AABAA"));
	}
	
	@Test
	public void testNCharsAatPosition() {
		assertEquals("BCDAB", remove.RemoveA("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", remove.RemoveA("AAAAAAA"));
	}
}
