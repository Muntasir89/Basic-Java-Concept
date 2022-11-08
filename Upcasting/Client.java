package Upcasting;

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
