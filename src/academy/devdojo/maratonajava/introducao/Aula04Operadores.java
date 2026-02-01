package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(result);

        // %
        int res = 20 % 2;
        System.out.println(res);

        // < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenEqualThanTen = 10 == 10;
        boolean isTenDifferentThanTen = 10 != 10;
        System.out.println("isTenBiggerThanTwenty " + isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty " + isTenSmallerThanTwenty);
        System.out.println("isTenEqualThanTwenty " + isTenEqualThanTwenty);
        System.out.println("isTenEqualThanTen " + isTenEqualThanTen);
        System.out.println("isTenDifferentThanTen " + isTenDifferentThanTen);

        // && (AND) && (OR) ! (NO)
        int age = 29;
        float salary = 3500F;
        boolean withinTheLawBiggerThanThirty = age >= 30 && salary >= 4612;
        boolean withinTheLawSmallerThanThirty = age < 30 && salary >= 3381;

        System.out.println("withinTheLawBiggerThanThirty " + withinTheLawBiggerThanThirty);
        System.out.println("withinTheLawSmallerThanThirty " + withinTheLawSmallerThanThirty);

        double currentAccount = 200;
        double valueTotalSavings = 10000;
        float pricePlaystation = 5000F;
        boolean isPlaystationComparable = currentAccount > pricePlaystation || valueTotalSavings > pricePlaystation;
        System.out.println("isPlaystationComparable " + isPlaystationComparable);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contactor = 0;
        contactor += 1; // contactor = contactor + 1;
        contactor++;
        contactor--;
        System.out.println(contactor);

    }
}
