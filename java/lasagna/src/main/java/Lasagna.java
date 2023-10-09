public class Lasagna{
    
    // TODO: define the 'expectedMinutesInOven()' method
       public static int expectedMinutesInOven(){
           return 40;
           }

    // TODO: define the 'remainingMinutesInOven()' method
      public static int remainingMinutesInOven(int min){
            return Lasagna.expectedMinutesInOven()-min;
            
        }
    
    // TODO: define the 'preparationTimeInMinutes()' method
        public static int preparationTimeInMinutes(int min){
            return min*2;
        }
    
    // TODO: define the 'totalTimeInMinutes()' method
        public static int totalTimeInMinutes(int layers, int min ){
            return Lasagna.preparationTimeInMinutes(layers)+min;
        }
}
