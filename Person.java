// this Keyword
class Person {
    private int age;
    // Constructor Overloading
    private int cmHeight;
    private String name;
    public Person() {
        // this(20, "John Doe", 171);
    }
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
        // It's the same as:
        // age = ageParam;
        // name = nameParam;
    }
    // public Person(int age, String name, int cmHeight) {
    //     this.age = age;
    //     this.name = name;
    //     this.cmHeight = cmHeight;
        
    //     // this will not set the attribute value. 'age' is a local variable in the constructor method and its value is the very first argument.
    //     age = age 
    // }
    // Object Superclass
    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
        System.out.println(anotherObject.age);
    }
}