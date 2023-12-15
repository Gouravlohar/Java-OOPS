class a{
    void showa(){
        System.out.println("xyz class method");
    }
}
class b extends a{
    void showb(){
        System.out.println("a class method");
    }
}
    
class c extends a{
    void showc(){
        System.out.println("a class method");
    }
    public static void main (String[] args) {
        a t=new a();
        t.showa();
        b y=new b();
        y.showa();
        y.showb();
        c x=new c();
        x.showa();
        x.showc();
    }
}
