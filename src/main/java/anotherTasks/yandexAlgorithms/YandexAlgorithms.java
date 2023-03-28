package anotherTasks.yandexAlgorithms;

public class YandexAlgorithms {

    /*Андрей работает в секретной химической лаборатории, в которой производят опасную кислоту с удивительными свойствами. У Андрея есть
n
 бесконечно больших резервуаров, расположенных в один ряд. Изначально в каждом резервуаре находится некоторое количество кислоты. Начальство Андрея требует, чтобы во всех резервуарах содержался одинаковый объем кислоты. К сожалению, разливающий аппарат несовершенен. За одну операцию он способен разлить по одному литру кислоты в каждый из первых
k
 резервуаров. Обратите внимание, что для разных операций k
 могут быть разными. Поскольку кислота очень дорогая, Андрею не разрешается выливать кислоту из резервуаров. Андрей просит вас узнать, можно ли уравнять объемы кислоты в резервуарах, и, если это возможно, то посчитать минимальное количество операций, которое потребуется, чтобы этого достичь.
Формат ввода
Первая строка содержит число
n — количество резервуаров.
Во второй строке содержатся n целых чисел
a
i
 , где
a
i
 означает исходный объём кислоты в
i
-м резервуаре в литрах.

Формат вывода
Если объемы кислоты в резервуарах можно уравнять, выведите минимальное количество операций, необходимых для этого.
Если это невозможно, выведите «-1».*/

    public static int tankLeveling2(int n, int... a) {
        int count = 0;
        int max = a[a.length - 1];
        boolean flag = false;
        while (flag != true) {
            flag = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1] || a[i] > max) return -1;
                if (a[i] < max) {
                    a[i]++;
                    flag = false;
                }

            }
            count++;
        }

        return count - 1;
    }


    public static int tankLeveling1(int n, int... a) {

        int max = a[a.length - 1];
        int count = max - a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > count + a[i]) return -1;
        }
        return count;
    }
}