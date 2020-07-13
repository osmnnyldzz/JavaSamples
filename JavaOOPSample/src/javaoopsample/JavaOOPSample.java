package javaoopsample;

class Account{
   String name;
   String surName;
   int age;
   public String country;
   
    //Constructor
   public Account(){
       this.name="Değer Girilmedi";
       this.surName="Değer Girilmedi";
   }
   
   //Function
   void sayYourName(String yourName,String yourSurname){
       this.name = yourName;
       this.surName = yourSurname;
   }
   
   //Getter age
   public int getAge(){
       return age;
   }
   
   //Setter Age
   public void setAge(int age){
       this.age = age; 
   }
}

//Inheritance 
class OsmanAccount extends Account{
    
}


public class JavaOOPSample {

    public static void main(String[] args) {
        
        Account account = new Account();
        OsmanAccount osmanAccount = new OsmanAccount();
        
        account.country = "Turkey";
        account.name = "Osman";
        account.surName = "YILDIZ";
        
        osmanAccount.name = "This is osmanAccount's name : Osman";
        osmanAccount.surName = "This is osmanAccount's surname : Yıldız";
        osmanAccount.age = 22;
        
    System.out.println(account.name + " " + account.surName + " \nCountry: " + account.country);
    
    account.sayYourName(" New name: Otto\n","New surname: Yildiz\n");
    
    account.setAge(21);
    
    System.out.println(account.name + " " + account.surName +" Age:"+ account.age);

    int getterAge = account.getAge();
    System.out.println(getterAge + " --> Getter ile çağırılmış age değeri ");
    
    System.out.println(osmanAccount.name +"\n"+ osmanAccount.surName +"\n"+ "This is osmanAccount's age : " +osmanAccount.age);
    
    }
}

