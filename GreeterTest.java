// Objects and Classes
public class GreeterTest {
    public static void main(String[] args){
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Josiah");

        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Josiah")){
            System.out.println("Test successful");
        } else{
            System.out.println("Test Fail");
        }
    }
}