# Домашнее задание к занятию "Сортировки"

## Цель задания

1. Попрактиковаться в слиянии отсортированных массивов

------

## Инструкция к заданию

1. Для каждой задачи создайте отдельный реплит, если об обратном не сказано в условии
1. Саму программу пишите в IDEA, реплит используется только для сдачи кода
1. В окне редактора IDEA наберите программный код, решающий поставленную задачу, на основе данной в условии заготовки кода
1. Загружайте файлы из папки src проекта в реплит
1. Отправьте выполненную работу на проверку в личном кабинете Нетологии

------

## Материалы, которые пригодятся для выполнения задания

1. Сортировка слиянием в [Алгоритмы сортировки на Java с примерами](https://tproger.ru/articles/algoritmy-sortirovki-na-java-s-primerami)
3. [Как поделиться реплитом для проверки?](https://github.com/netology-code/java-homeworks/blob/java-43/QA_ReplitShare.md)
4. [Как автоотформатировать код?](https://github.com/netology-code/java-homeworks/blob/java-43/QA_Format.md)
5. [Как залить проект из IDEA в реплит?](https://github.com/netology-code/java-homeworks/blob/java-43/QA_ReplitUpload.md)

------

## Задание 1 (обязательное)

В стране есть n региональных команд, каждая состоит из 10 игроков, у каждого игрока есть рейтинг. Вам надо написать программу, которая из всех региональных команд соберёт команду национальную - топ-10 игроков по рейтингу. Каждая команда задаётся в виде массива с рейтингами игроков в порядке убывания. Ваша программа должна вывести такой же массив для национальной команды. Целевая асимптотика: O(n) времени, константная память.


### Заготовка кода
Используйте этот код в качестве заготовки кода вашего проекта. Менять код в `main` нельзя.

```java
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] teams = {
                { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 },
                { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 },
                { 51, 30, 10, 9, 8, 7, 6, 5, 2, 1 }
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /** Метод для слияния всех команд в одну национальную */
    public static int[] mergeAll(int[][] teams) {
        // Ваш код
    }

    /** Метод для слияния двух команд в одну */
    public static int[] merge(int[] teamA, int[] teamB) {
        // Ваш код
    }
}
```

### Алгоритм
Давайте воспользуемся алгоритмом слияния. Если мы сольём два массива команд, то получим массив команды из 20 человек, упорядоченный по убыванию. Нам нужно только 10 человек, так что модифицируем алгоритм слияния таким образом, что будем прерывать его как только в итоговом массиве набралось 10 человек (это всегда будут топ-10 человек из двух массивов).

Возьмём первую региональную команду и сольём её так со второй. Так мы получим топ-10 человек из обеих команд. Давайте полученную команду сольём с третьей - так мы получим топ-10 человек из трёх команд. Проделаем так со всеми региональными командами, в итоге получив топ-10 человек из всех региональных команд.

Метод `mergeAll` должен работать с любым количеством команд. Поэтому сливать следует циклом: возьмите за промежуточный ответ первую команду, а затем в цикле сливайте промежуточный ответ с очередной командой. После цикла в промежуточном ответе у вас будет результат слияния всех команд.

Оценим асимптотику: каждый раз мы сливаем команды длинною 10, т.е. время работы слияния двух команд не зависит от количества регионов, а стало быть это константная для n операция как для времени, так и для памяти. Таких операций мы сделаем n-1 раз, пройдясь по всем регионам. Итого: асимптотика O(n).

------


## Правила приема работы

Прикреплён реплит с решением задачи

------

## Критерии оценки

1. Программа оформлена на основе заготовки кода, предоставленной в условии
1. Программа запускается и отрабатывает без ошибок
2. Программа соответствует всем требованиям из условия задачи
3. Программа работает правильно на всех примерах из условия
4. Программный код соответствует пройденным требованиям к качеству кода
5. Программа спроектирована достаточно логично и правильно, не противоречит общепринятым в производстве практикам и традициям
6. Программа реализует достаточный для зачёта по эффективности алгоритм
7. При наличии недочётов, в зависимости от их серьёзности и количества, работа может быть отправлена на доработку или принята; решение принимается на основе экспертной оценки работы.
