public class Challenge {
    public static void main(String[] args) {


        byte myByte = 116;
        int myInt = 600;
        short myShort = 200;
        long myLong = 80000 - 5 * (myByte + myInt + myShort);

        System.out.println(myLong);

    }
}
