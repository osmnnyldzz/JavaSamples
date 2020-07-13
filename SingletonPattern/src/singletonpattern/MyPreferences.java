
package singletonpattern;

public class MyPreferences extends SingletonPattern{
    
   
       public static void main(String [] args){
       SingletonPattern.getInstance().helloSingleton();
       MyPreferences.getInstance().helloSingleton();

    }


}