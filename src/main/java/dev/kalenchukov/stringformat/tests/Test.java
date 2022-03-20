/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.stringformat.tests;

import dev.kalenchukov.stringformat.StringFormat;

import java.util.HashMap;
import java.util.Map;

public final class Test
{
	public static void main(String[] args)
	{
		String strTest1 = "Hello %NAME%!";

		System.out.println(StringFormat.format(strTest1, "NAME", "World"));

		String strTest2 = "Hello %NAME%! It's %LANGUAGE%!";

		Map<String, String> params = new HashMap<>();
		params.put("NAME", "World");
		params.put("LANGUAGE", "Java");

		System.out.println(StringFormat.format(strTest2, params));
	}
}
