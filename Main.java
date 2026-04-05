import java.lang.reflect.Array;


class Tasks {
    //first group
    void greet(String name, int age) {
        StringBuilder message = new StringBuilder()
                .append("Hello, my name is ")
                .append(name)
                .append(" and my age is ")
                .append(age);
        System.out.println(message.toString());

    }

    double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    void areaCalculator(int length, int width){
        int area = length * width;
        String message = new StringBuilder()
                .append("The area of the rectangle is ")
                .append(area)
                .toString();
        System.out.println(message);
    }

    //second group
    boolean isEven(int number){
        return number % 2 == 0;
    }

    //i did one so it could be applied to every number
    void multiplier(int num){
        for(int i = 1; i <= 10; i++){
            String message = new StringBuilder()
                    .append(num)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(num * i)
                    .toString();

            System.out.println(message);
        }
    }

    void countDown(){
        int counter = 10;
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff");
    }

    int arraySum(int[] array) {
        int sum = 0;
        for (int i: array){
            sum += i;
        }
        return sum;
    }

   //third group
   static int mySum(int a, int b) {
        return a + b;
   }

   void checkAge(int age) {
       System.out.println((age < 18) ? "Access denied" : "Access granted");
   }

   int plusMethod(int a, int b){
        return a + b;
   }

   double plusMethod(double a, double b){
        return a + b;
   }

   int maxInteger(int a, int b, int c){
        if((a > b) && (a > c)){
            return a;
        }
        else if((b > a) && (b > c)){
            return b;
        }
        else{
            return c;
        }
   }

   int maxIntegerAlternative(int a, int b, int c){
       return ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
   }


}




    
  
   
