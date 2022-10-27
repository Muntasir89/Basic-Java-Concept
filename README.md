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
