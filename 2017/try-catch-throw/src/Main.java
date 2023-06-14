public class Main {
    public static void main(String[] args)
    {
        try{
            int result = divide(10,0);
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Error : Division by zero");
        }catch(Exception e){
            System.out.println("Error: An exception occured");
        }finally{
            System.out.println("Finally block executed");
        }
    }

    private static int divide(int num1, int num2) {
        if(num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1/num2;
    }
}