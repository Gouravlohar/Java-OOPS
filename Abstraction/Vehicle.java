abstract class vehicle
{
abstract void show();
}
class car
{
void show(){
	System.out.println("Key Needed");
	}
}
class bike
{
void show(){
	System.out.println("kick Needed");
	}
public static void main(String[] args)
{
car obj1=new car();
obj1.show();

bike obj2=new bike();
obj2.show();
}

}
