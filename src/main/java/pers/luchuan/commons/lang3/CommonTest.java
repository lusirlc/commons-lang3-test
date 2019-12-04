package pers.luchuan.commons.lang3;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/**
 * Created By Lu Chuan On 2019/11/29
 */
public class CommonTest {
	@Test
	public void testRandomUtils() {
		for (int i = 0; i < 10; i++) {
			long value = RandomUtils.nextLong(100000000000000000L, 999999999999999999L);
			System.out.println(value);
		}
	}
}
