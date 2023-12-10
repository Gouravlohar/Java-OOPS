class Employee{
private int empid;
public void SetEmpid(int eid){
empid=eid;
}
public int GetEmpid(){
return empid;
}
}
class company{
public static void main(String[] args){
Employee e=new Employee();
e.SetEmpid(101);
System.out.println(e.GetEmpid());
}

}
