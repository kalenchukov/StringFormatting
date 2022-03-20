# StringFormat
Форматирование строк.

### Передача одного параметра:
```java
String strTest1 = "Hello %NAME%!";

StringFormat.format(strTest1, "NAME", "World");

/*
Результат выполнения: Hello World!
*/
```

### Передача нескольких параметров:
```java
String strTest2 = "Hello %NAME%! It's %LANGUAGE%!";

Map<String, String> params = new HashMap<>();
params.put("NAME", "World");
params.put("LANGUAGE", "Java");

StringFormat.format(strTest2, params);

/*
Результат выполнения: Hello World! It's Java!
*/
```