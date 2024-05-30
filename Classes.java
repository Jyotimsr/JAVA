class Students{
   // String name;
   // String roll;
   // int age;

   String name;
   String roll;
   String email;
   
   public void display(){
    System.out.println(name + " " + roll + " " + email);
   }
 
  
}
   public class Classes {
    public static void main(String args[]) {
        Students a1 = new Students();
        Students a2 = new Students();
        Students a3 = new Students();
        Students a4 = new Students();

        a1.name= "jyoti";
        a1.roll= "1";
        a1.email= "prchi@gmail.com";

        a2.name= "jeeya";
        a2.roll= "2";
        a2.email= "jeeya@gmail.com";

        a3.name= "anjali";
        a3.roll= "3";
        a3.email= "ajali@gmail.com";

        a4.name= "vaishnavi";
        a4.roll= "4";
        a4.email= "vaishu@gmail.com";


        a1.display();
        a2.display();
        a3.display();
        a4.display();



        
        
    
   }

    

    }

    

