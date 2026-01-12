public class TypeConversion {
    
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // double a = sc.nextDouble();
        // int b = (int)a;     //downcasting
        // System.out.println(b);

        Animal c = new Dog();  //explicit upcasting example
        c.talk();
        //c.bark();  cause error cause animal has no bark function 

        Dog d = (Dog)c; //explicit downcasting example
        d.bark(); 
    }
}

class Animal{
    void talk(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    void talk(){
        System.out.println("I am from dog talking");
    }
    void bark(){
        System.out.println("I am barking");
    }
}