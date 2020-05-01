class University{
String name;
int cid;

University(String a, int b){
this("USA");
name = a;
cid = b;
System.out.println("Name: "+name);
System.out.println("College ID: "+cid);
}

University(String country){
System.out.println("Country: "+country);
}
}


class Constructor{
public static void main(String args[]){
University msu = new University("MSU",1001);
University unt = new University("UNT",1002);

}
}
