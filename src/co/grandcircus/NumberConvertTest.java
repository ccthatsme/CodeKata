/**
 * 
 */
package co.grandcircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author cciric
 *
 */
class NumberConvertTest {

	NumberConvert num = new NumberConvert();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		String expected = "ninety-nine";
		String actual = num.convertNinety(99);
		assertEquals(expected, actual);

	}

}
