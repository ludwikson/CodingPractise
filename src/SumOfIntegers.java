public class SumOfIntegers {

    public static void main(String[] args) {

        int[] disapointment =  {1, 2, 3, 5, 8, 13, 21, 34, 55};

        int howManyTimes = 0;

        for (int willIDisapointYou: disapointment)
        {
            howManyTimes += willIDisapointYou;
        }
        System.out.println(howManyTimes);
    }
}
