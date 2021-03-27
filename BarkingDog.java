public class BarkingDog {

   public static boolean shouldWakeUp(boolean barking, int hourOfDay){

       //Invalid options
       if (!barking || (hourOfDay < 0 || hourOfDay > 23)){
           return false;
       }
       //Wake the owner if the dog is barking 10 pm - 8 am
       if (hourOfDay < 8 || hourOfDay > 22 && barking){
           return true;
       }
       else{
           return false; // not within times
       }
   }
}