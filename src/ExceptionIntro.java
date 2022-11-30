public class ExceptionIntro {

    public static void main(String[] args) {
        System.out.println("Hello Exceptions");
        int numbers[] = new int[5]; //array of 5 numbers
        numbers[0] = 12;
        numbers[1] = 34;

        //try catch statement, for Exception handling
        try{
            //code that might throw exception
            System.out.println(numbers[89]);

        }catch(Exception e) {

            //error handling
            System.out.println("Check the index is between 0 and 4");
        }
//
//        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
        Calculator calculator3 = new Calculator("casio calculator v34");
        Calculator calculator4 = new Calculator("siemens supercalculator");

        System.out.println(calculator3.getName());
        System.out.println(calculator4.getName());
        calculator4.year = 1934;
        System.out.println(calculator4.year);

        Tutor tutor = new Tutor("stef");
        System.out.println(tutor.getFullName());
        System.out.println(tutor.toString()); //ride the hierarchy (upwards) until you find the method
    }
}
