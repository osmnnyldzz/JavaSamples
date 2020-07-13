package singletonpattern;

public class SingletonPattern {
  
    private static SingletonPattern instance = null; 
   
    private synchronized static void createInstance() {
                if (instance == null){
                instance = new SingletonPattern();
                }
    }
    public static SingletonPattern getInstance() {
    if (instance == null){
        createInstance();
    }
    return instance;
}
    
   public void helloSingleton() {
            System.out.println("Hello i’m a singleton");
        }
    
}
