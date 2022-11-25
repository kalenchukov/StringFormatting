# StringFormatting

Форматирование строк.

## Использование

#### Передача одного параметра

```java
String str = "Hello %NAME%!";

StringFormat.format(str, "NAME", "World");
// Результат выполнения: Hello World!
```

#### Передача нескольких параметров

```java
String str = "Hello %NAME%! It's %LANGUAGE%!";

Map<String, String> params = new HashMap<>();
params.put("NAME", "World");
params.put("LANGUAGE", "Java");

StringFormat.format(str, params);
// Результат выполнения: Hello World! It's Java!
```

## Версии

Доступные [версии](https://github.com/kalenchukov/StringFormatting/releases).

## Лицензия

[MIT](https://opensource.org/licenses/MIT)
