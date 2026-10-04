class Animal{
    void eat(){
        System.out.println("the cat eats food");
    }
}
class cat extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}
public class SingleInheritance{
public static void main(String[] args){
    cat A= new cat();
    A.eat();
    A.bark();
}
}