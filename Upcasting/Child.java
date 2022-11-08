package Upcasting;

class Child extends Parent{
    int height = 3;
    @Override
    public void Explains() {
        System.out.println("Explains() inside child class");
    }
    public void Tells(){
        System.out.println("Tells() inside child class");
    }
}
