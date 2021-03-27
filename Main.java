public class Main {

    public static void main(String[] args) {

        /* This program will set the alarm off.
        if your dog is barking and if its during the
          quiet time the neighborhood  10pm - 8am*/

        // by having public static methods (accessed from anywhere)
        // public methods of a class have to called through the constructor first
        // & then it can only be called from the class like private

       // BarkingDog dog = new BarkingDog();
        boolean wakeup = true;
        wakeup = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wakeup);
        /*wakeup = dog.shouldWakeUp(false, 2);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, 8);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, -1);
        System.out.println(wakeup);
*/

    }

}
