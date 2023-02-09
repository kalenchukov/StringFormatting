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

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;

/**
 * Класс содержит статические методы для форматирования строк.
 */
public class StringFormat
{
	/**
	 * Конструктор для {@code StringFormat}.
	 */
	private StringFormat() {}

	/**
	 * Форматирует строку с заданным ключом и параметром.
	 *
	 * @param value строка в которой необходимо выполнить форматирование.
	 * @param key ключ который необходимо найти в строке.
	 * @param param параметр которым необходимо заменить значение ключа.
	 * @return строку, в которой все значения ключа, обрамлённые символом "%", заменены значением переданного параметра.
	 */
	@NotNull
	public static String format(@NotNull String value, @NotNull final String key, @NotNull final Object param)
	{
		Objects.requireNonNull(value);
		Objects.requireNonNull(key);
		Objects.requireNonNull(param);

		return value.replaceAll("%" + key + "%", param.toString());
	}

	/**
	 * Форматирует строку с несколькими ключами и параметрами.
	 *
	 * @param value строка в которой необходимо выполнить форматирование.
	 * @param params коллекция с ключами и параметрами которые необходимо заменить в строке.
	 * @return строку, в которой все значения ключей коллекции, обрамлённые символом "%", заменены соответствующими значениями коллекции.
	 */
	@NotNull
	public static String format(@NotNull String value, @NotNull final Map<@NotNull String, @NotNull String> params)
	{
		Objects.requireNonNull(value);
		Objects.requireNonNull(params);

		for (Map.Entry<String, String> param : params.entrySet())
		{
			Objects.requireNonNull(param.getKey());
			Objects.requireNonNull(param.getValue());

			value = StringFormat.format(value, param.getKey(), param.getValue());
		}

		return value;
	}

}
