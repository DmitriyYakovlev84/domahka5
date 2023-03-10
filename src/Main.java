public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("задача 1 ");
            /* Продолжите работать с кодом, который вы написали в предыдущем уроке
             — в задачах с накоплениями.
С помощью цикла while посчитайте, сколько месяцев потребуется,
 чтобы накопить 2 459 000 рублей при условии, что первоначально
 мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
Результат программы должен быть выведен в консоль с тем количеством месяцев,
 которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …,
  сумма накоплений равна … рублей» .*/
        int money1 = 0;
        int money2 = 15000;
        int month = 1;
        while (money1 < 2459000) {
            money1 = money1 + money1 / 100;
            money1 = money1 + money2;
            System.out.println("месяц" + month + "сумма накоплений равна" + money1 + "рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("задача 2 ");
       /* Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
                Не забудьте выполнить переход на новую строку между двумя циклами.
                В результате программы вывод должен получиться следующий:
                                              1 2 3 4 5 6 7 8 9 10
                                               10 9 8 7 6 5 4 3 2 1       */
        int i = 0;
        while (i <= 10) {
            System.out.println(++i + " ");

        }
        int x = 10;
        while (x > 0) {
            System.out.println(x);
            x--;
        }
    }

    public static void task3() {
        System.out.println("задача 3 ");
/*В стране Y население равно 12 миллионов человек.
Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
 Рассчитайте, какая численность населения будет через 10 лет,
  если показатели рождаемости и смертности постоянны.
В консоль выведите результат операции на каждый год в формате:
 «Год …, численность населения составляет …».
 */
        var population = 12_000_000; //население всего
        var birthRate = 17 * 1000; //рождаемость
        var mortality = 8 * 1000; //смертность

        int timeCounter = 0; //годы
        while (timeCounter < 10) {
            population = population - mortality + birthRate;
            timeCounter++;
            System.out.println("Год" + timeCounter + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("задача 4 ");
/* Василий решил положить деньги на накопительный счет,
 где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
 чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
 а всегда равен 7%.
Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.*/
        double depositAmount = 15000; // Первоначальная сумма
        int months = 1;
        while (depositAmount < 12000000) {
            depositAmount = depositAmount + depositAmount * 0.07;
            System.out.println("месяц " + months + "сума=" + depositAmount);
            months++;
        }
    }

    public static void task5() {
        System.out.println("задача 5 ");
/*Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
 а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
 */
        double depositAmount = 15000;
        int months = 1;
        while (depositAmount < 12000000) {
            depositAmount = depositAmount + depositAmount * 0.07;
            if (months % 6 == 0) {
                System.out.println("месяц " + months + "сума=" + depositAmount);
            }
            months++;
        }
    }

    public static void task6() {
        System.out.println("задача 6 ");
/*Василий решил, что будет копить деньги ближайшие 9 лет.
 Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.*/
        double depositAmount = 15000;
        int months = 1;
        while (months <= 9 * 12) {
            depositAmount = depositAmount + depositAmount * 0.07;
            if (months % 6 == 0) {
                System.out.println("месяц " + months + "сума=" + depositAmount);
            }
            months++;
        }
    }

    public static void task7() {
        System.out.println("задача 7 ");
/*В компании пятница — отчетный день.
Нужно написать программу, которая считает дни месяца по датам, определяет,
какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница,
 ...-е число. Необходимо подготовить отчет».
В нашем месяце 31 день. В результате у вас должно получиться
 от 4 до 5 сообщений с напоминаниями по разным датам.*/
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница," + friday + "число.Необходимо подготовить отчет");
            friday += 7;
        }
    }
    public static void task8() {
        System.out.println("задача 8 ");
/*Нам нужно написать астрономическое приложение, которое считает,
 когда над Землей пролетает комета.
Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
 а также следующий год ее появления (ближайшие 100 лет).
Для вычисления периода можно создать две дополнительные переменные,
 которые содержат год за 200 лет до текущего (из созданной ранее переменной)
  в качестве старта и 100 лет после в качестве завершения периода расчета.
В результате решения задачи в консоли должен получиться следующий результат :
1896
1975
2054  */
        int start = 2023 - 200;
        int end = 2023 + 100;
        for (int year = start; year <= end; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        }
    }