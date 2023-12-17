interface I1{
    public void show();
}
class xyz implements I1{
    public void show(){
        System.out.println("Interface");
    }
    public static void main (String[] args) {
        xyz t=new xyz();
        t.show();
    }
}
