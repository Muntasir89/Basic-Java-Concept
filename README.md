# Basic-Java-Concept

## Super Method
```java
  class A{
    public A(){
        System.out.println("inside A");
    }
    public A(int i){
        System.out.println("inside parameterized A");
    }
}
class B extends A
{
    public B(){
        System.out.println("inside B");
    }
    public B(int i){
        super(i);
        System.out.println("inside parameterized B");
    }
}
public class SuperMethod{
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
```
Here **class A** is the **super class** and **class B** is the **sub class**
which extends the super class. When we create object of **class B** 
inside **class SuperMethod** there can be 2 different object based on 
parameter passed or not and the output will </br>```inside parameterized A```</br>
```inside parameterized B``` 
or</br> </br>
```inside A```</br>
```inside B```
respectively. But if we do not use method ```super(i)``` inside ```class B```
 we will get output</br>
  ```inside A``` </br>
  ```inside parameterized B```
  or </br></br>
  ```inside A``` </br>
  ```inside B``` 
  It clears that if we want to execute specific constructor from **super class** we have to initialize **_super_** method inside that constructor that will be 
  execute in **class B**. 
  
  ## Upcasting
  
  What is **_Upcasting?_**</br>
  **Upcasting is the typecasting of a child object to a parent object.**</br>
  ```java
    Parent par = new Child();
  ```
   This type of initialization is used to access only the members present in the parent class and the methods which are overridden in the child class.In other words,
Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature. Instead of all the members, we can access some specified members of the child class. For instance, we can access the overridden methods.
</br>
Let, A super class called **Parent**
</br>
```java 
  class Parent {
    int age = 29;
    public void Explains(){
        System.out.println("Explains() inside Parent");
    }
}
```
A child class which inherits Parent called Child.
</br>
```java
  class Child extends Parent{
    int height;
    @Override
    public void Explains(){
        System.out.println("Explain() inside child class");
    }
    public void Tells(){
        System.out.println("Tells() inside child class");
    }
}
```
Another class called **Client**.
</br>
```java
  class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.AnotherMethod();
    }
    public void AnotherMethod(){
        Parent par = new Child();
        par.age = 30;
        //par.height = 5;
        par.Explains();
        System.out.println(par.age);
    }
}
```
The object **par** has access to only the parent's properties. So the **age** property will change. But if we want to run next instruction, this will cause **_compilation error_**. This object can access to child class overridden method. A simple object of **Child** class can access to all property of parent class as well as Child class. So, output,
```java 
Explains() inside child class
30
```

