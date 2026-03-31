import java.lang.reflect.Array;

class Tasks {
    //first group
    void greet(String name, int age) {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    void areaCalculator(int length, int width){
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }

    //second group
    boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //i did one so it could be applied to every number
    void multiplier(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
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
        if(age < 18) {
            System.out.println("Access denied");
        }
        else{
            System.out.println("Access granted");
        }
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


}
