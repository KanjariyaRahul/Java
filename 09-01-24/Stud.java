
class Stud{  
  
 String name;  
 int age;

 public Stud(String name, int age){
   this.name = name;
   this.age = age;

 }
 
 void displayStud(){
   System.out.println("Name: "+this.name + "\n\n");

   System.out.println("Age: "+this.age);
 }
 
 public static void main(String args[]){  

  Stud s1=new Stud("Rahul",20); 
  Stud s2=new Stud("krushal",21);

  s1.displayStud();
  s2.displayStud();
 }  
}  