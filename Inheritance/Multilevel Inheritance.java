class A{
    void showA(){
        System.out.println("a class mehtod");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class method");
    }
    
}
class C extends B{
    void showC(){
        System.out.println("c class method");
    }
    public static void main (String[] args) {
        A t=new A();
        t.showA();
        B y=new B();
        y.showB();
        y.showA();
        C z=new C();
        z.showA();
        z.showB();
        z.showC();
    }
}
