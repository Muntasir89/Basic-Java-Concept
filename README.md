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
or</br> 
```inside A```</br>
```inside B``` </br>
respectively. But if we do not use method ```super(i)``` inside ```class B```
 we will get output</br>
  ```inside A``` </br>
  ```inside parameterized B```
  or 
  ```inside A```</br>
  ```inside B``` .</br> 
  It clears that if we want to execute specific constructor from **super class** we have to initialize **_super_** method inside that constructor that will be 
  execute in **class B**. 
