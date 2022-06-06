
class Lab02{
public static void main(String[] arg){
customer c1=new customer();
c1.cid=1234;
c1.cname="Sujata";
c1.phone=2345567890L;
c1.show();


}

}
class customer{
int cid;
String cname;
long phone;
void show(){
System.out.println(cid);
System.out.println(cname);
System.out.println(phone);

}

}