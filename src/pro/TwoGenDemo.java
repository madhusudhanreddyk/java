  class TwoGen<T1,T2>{
T1 ob1;
T2 ob2;
TwoGen(T1 ob1,T2 ob2){
this.ob1=ob1;
this.ob2=ob2;
}
T1 getOb1(){
return ob1;
}
T2 getOb2(){
return ob2;
}
String showType1(){
String type=ob1.getClass().getName();
return type;
}
String showType2(){
String type=ob2.getClass().getName();
return type;
}
}
class TwoGenDemo{
public static void main(String[] args){
TwoGen<Integer,String> ob=new TwoGen<Integer,String>(7,"AITS");
System.out.println("Two object generic..");
System.out.println("college code:"+ob.getOb1());
System.out.println("college code type:"+ob.showType1());
System.out.println("college name:"+ob.getOb2());
System.out.println("college name type:"+ob.showType2());
}}