class runtime{
void show(){
System.out.println("1");
}
}
class time extends runtime{
void show(){
System.out.println("2");
}
public static void main (String[] args){
runtime t=new runtime();
t.show();
time nt=new time();
nt.show();
}
}
