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
Here ```java class A``` is the **super class** and ```java class B``` is the **sub class** which extends the super class. When we create object of ```java class B``` inside ```java class SuperMethod``` there can be 2 different object based on parameter passed or not and the output will\ ```inside parameterized A\inside parameterized B``` \or ```inside A\inside B``` respectively. But if we do not use method ```java super(i)``` inside ```java class B``` we will get output\ ```inside A\inside parameterized B```\ or\ ```inside A\inside B``` .\ It clears that if we want to execute specific constructor from **super class** we have to initialize **_super_** method inside that constructor that will be execute in ```java class B```. 
