interface I1{
    public void show();
}
interface I2{
    public void display();
}
class xyz implements I1,I2{
    public void show(){
        System.out.println("Interface");
    }
    public void display(){
        System.out.println("Hello");
    }
    public static void main (String[] args) {
        xyz t=new xyz();
        t.show();
        xyz t1=new xyz();
        t1.display();
    }
}
