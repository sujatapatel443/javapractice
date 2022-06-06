class Lab03{
public static void main(String ar[]){
Student s=new Student(101,"RAJ", 123456L);
s.show();

Student s1=new Student(202,"SUJATA", 675344L);
s1.show();
Student s2=new Student(302,"SEEMA", 7637909);
s2.show();
}
}

class Student{
int sid;
String sname;
long phone;

Student(int sid, String sname, long phone){
this.sid=sid;
this.sname=sname;
this.phone=phone;
}
void show(){
System.out.println(sid);
System.out.println(sname);
System.out.println(phone);

}

}