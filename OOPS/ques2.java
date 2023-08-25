package OOPS;

class Animal
{
    String name;
    String breed;
    String color;
    int age;
    Animal(String name,String breed,String color,int age)
    {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    void display()
    {
        System.out.println("Dog name : "+name);
        System.out.println("Breed :"+breed);
        System.out.println("color "+color);
        System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        System.out.println("****************  OOOPS PROGRAMMING ************************");
        Animal Dog=new Animal("Buzo", "Pitbull", "black", 5);
        Dog.display();
    }
}