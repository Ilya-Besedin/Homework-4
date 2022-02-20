public class TypesAndOperators {

    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1, можно записывать с разделителем 1_000
    long aLong = 10000L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 1.2F; // 32 bit
    double aDouble = 1.2; // 64 bit   самый используемый (если просто хранить, но не использовать арифметику)

    char aChar = 'V';
    boolean aBoolean = true;

    boolean oscar = true;
    boolean test = oscar;

    // Ссылочный тип данных
    String aString = "hello, world!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=

        // && (&)
        // || (|)
        // !

        byte aByte = 10;
        short bShort = 100;
        int cInt = 1000;
        long dLong = 10000L;
        //short z = aByte ^ cInt; сравнение с short z приведет к ошибке тк 10 в степени 100 больше максимального значения short
        System.out.println(aByte - bShort);
        System.out.println(aByte + aByte);
        System.out.println(bShort * bShort);
        System.out.println(bShort / aByte);
        System.out.println(bShort + cInt - bShort % aByte);
        //System.out.println(z == bShort);
        System.out.println(cInt <= aByte * aByte); //true
        System.out.println(aByte < cInt); //true
        System.out.println(aByte >= cInt); //false
        System.out.println(++aByte - aByte++); //0
        System.out.println(aByte - --aByte); //1
        System.out.println(cInt += dLong); //11000

        float e = 5.5F;
        double f = 11.00;

        System.out.println(((e - f) > 0) && ((f - e) > 0)); //false
        System.out.println(((e - f) > 0) || ((f - e) > 0)); //true
        System.out.println(f / e); //2.0
        System.out.println(f % e); //0.0
        System.out.println(e * 2); // 11.0

        char g = 'H', h = '1';
        System.out.println(g + h); //ASCII CHAR+DEC -> H=72 + 1=49 = 121


        System.out.println(aByte + bShort); //10 + 100 = 110. Результат выполнения = 111. Почему?

        boolean cat = true;
        boolean dog = cat;
        System.out.println(dog); //true
    }
}