/*
 * Copyright © 2022 Алексей Каленчуков
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

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringFormatTest
{
	@Test
	public void testFormatInteger()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 100);

		assertEquals("Hello 100!", string);
	}

	@Test
	public void testFormatLong()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 1000L);

		assertEquals("Hello 1000!", string);
	}

	@Test
	public void testFormatShort()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 100.6);

		assertEquals("Hello 100.6!", string);
	}

	@Test
	public void testFormatFloat()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 10.4F);

		assertEquals("Hello 10.4!", string);
	}

	@Test
	public void testFormatDouble()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 1000.78D);

		assertEquals("Hello 1000.78!", string);
	}

	@Test
	public void testFormatByte()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 120);

		assertEquals("Hello 120!", string);
	}

	@Test
	public void testFormatCharacter()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", 'A');

		assertEquals("Hello A!", string);
	}

	@Test
	public void testFormatString()
	{
		String string = StringFormat.format("Hello %NAME%!", "NAME", "World");

		assertEquals("Hello World!", string);
	}

	@Test
	public void testFormatMap()
	{
		Map<String, String> params = new HashMap<>();
		params.put("NAME", "World");
		params.put("LANGUAGE", "Java");

		String string = StringFormat.format("Hello %NAME%! It`s %LANGUAGE%!", params);

		assertEquals("Hello World! It`s Java!", string);
	}
}