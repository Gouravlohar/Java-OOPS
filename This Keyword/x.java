class x{
	int a=10;
}
class y extends x{
	int a=20;
	void show(int a){
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
}
public static void main(String[] args){
	y t=new y();
	t.show(30);
}
}
