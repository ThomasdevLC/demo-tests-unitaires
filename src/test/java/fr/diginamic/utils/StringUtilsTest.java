package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testLevenshteinDistance() {
		assertEquals(1, StringUtils.levenshteinDistance("abc", "axc"));
		assertEquals(1, StringUtils.levenshteinDistance("abc", "ab"));
		assertEquals(1, StringUtils.levenshteinDistance("abc", "abcd"));
		assertEquals(4, StringUtils.levenshteinDistance("", "abcd"));
		assertEquals(4, StringUtils.levenshteinDistance("abcd", ""));
	}

}
