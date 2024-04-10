public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80 && grade <= 89) {
            return 'B';
        } else if (grade >= 70 && grade <= 79) {
            return 'C';
        } else if (grade >= 60 && grade <= 69) {
            return 'D';
        } else if (grade >= 50 && grade <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        if(num%3==0 && num%5==0){
            return "fizzbuzz";
        }
        else if(num%3 == 0){
            return "fizz";
        }
        else if(num%5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if(str.length()>=2){
            String twoLetters = str.substring(0,2);
            return twoLetters+str+twoLetters;
        }
        else{
            return str;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if(a+b==c || b+c==a || a+c==b){
            return true;
        }
        else{
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String arg){
        if(arg.length()>=3){
            String end = arg.substring(arg.length()-3);
            String front = arg.substring(0,arg.length()-3);
            String capitalEnd = end.toUpperCase();
            return front + capitalEnd;
            }
        else{
            return arg.toUpperCase();
        }
    }

}
