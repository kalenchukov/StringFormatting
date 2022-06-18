/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
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
	public void testFormatObject()
	{
		Object object = "Matrix";

		String string = StringFormat.format("Hello %NAME%!", "NAME", object);

		assertEquals("Hello Matrix!", string);
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