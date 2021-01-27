# How it works?

1 - `instance` holds the one and only instance for the class Singleton\
2 - `instance` is `static` because it needs to be available on a global basis

    private static Singleton instance = null;

3 - Constructor is `private` because we have to guarantee there is only one instance for the class Singleton
  
    private Singleton() {}  

4 - The only way to create a new `Singleton` object is if ONE doesn't exist already. 
If the instance isn't needed it is never going to be created (Lazy instantiation)

    public static Singleton getInstance() {
        if (instance == null) { // checks whether the instance exists or not
            instance = new Singleton();
        }
        return instance; // if it already exists is going to return the one that already exists
    }
    
5 - The result from the output shows the in both cases instance is the same

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
    
    
 6 - Thread safety implementation - `synchronized` guarantees that only on thread can execute this method at a time
     
     public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
         }
        return instance;
     }