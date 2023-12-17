class test{
    public void finalize(){
        System.out.println("1");
    }
    public static void main (String[] args) {
        test t=new test();
        test t1=new test();
        t1=null;
        t=null;
        System.gc();
    }
}
