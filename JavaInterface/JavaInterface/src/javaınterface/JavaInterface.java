package javaınterface;

public class JavaInterface {

    public interface Person{
        public String getMeslek();
        public String getAge();

    }
    
     public static class Girl implements Person{
        public String getMeslek(){
            return "Girl -> She's Dentist";
        }
        public String getAge(){
            return "Girl -> She's 22";
        }
    }
    
    public static class Boy implements Person{
        public String getMeslek(){
            return "Boy -> He's Engineer";
        }
         public String getAge(){
            return "Boy -> He's 20";
        }
    }
    
      
    public static void main(String args[]){
        Person person1 = new Girl();
        Person person2 = new Boy();
 
        System.out.println(person1.getMeslek());
        System.out.println(person1.getAge());

        System.out.println(person2.getMeslek());
        System.out.println(person2.getAge());

    }
}
