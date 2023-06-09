/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.string.formatting;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link StringFormat}.
 *
 * @author Алексей Каленчуков
 */
public class StringFormatTest
{
	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Integer}.
	 */
	@Test
	public void formatInteger()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 100);

		assertEquals("Hello 100!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Long}.
	 */
	@Test
	public void formatLong()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 1000L);

		assertEquals("Hello 1000!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Short}.
	 */
	@Test
	public void formatShort()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 100.6);

		assertEquals("Hello 100.6!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Float}.
	 */
	@Test
	public void formatFloat()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 10.4F);

		assertEquals("Hello 10.4!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Double}.
	 */
	@Test
	public void formatDouble()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 1000.78D);

		assertEquals("Hello 1000.78!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Byte}.
	 */
	@Test
	public void formatByte()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 120);

		assertEquals("Hello 120!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code Character}.
	 */
	@Test
	public void formatCharacter()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", 'A');

		assertEquals("Hello A!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, String, Object)} с передачей значения типа {@code String}.
	 */
	@Test
	public void formatString()
	{
		String actual = StringFormat.format("Hello %NAME%!", "NAME", "World");

		assertEquals("Hello World!", actual);
	}

	/**
	 * Проверка метода {@link StringFormat#format(String, Map)} с передачей значения типа {@code Map<String, String>}.
	 */
	@Test
	public void formatMap()
	{
		Map<String, String> params = new HashMap<>();
		params.put("NAME", "World");
		params.put("LANGUAGE", "Java");

		String actual = StringFormat.format("Hello %NAME%! It`s %LANGUAGE%!", params);

		assertEquals("Hello World! It`s Java!", actual);
	}
}