// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

public class SomeObject {
 
  // Locks on the object's monitor
  public synchronized void changeValue() {
    // ...
  }
  
  public static SomeObject lookup(String name) {
    // ...
  }
}
 
// Untrusted code
String name = // ...
SomeObject someObject = SomeObject.lookup(name);
if (someObject == null) {
  // ... handle error
}
synchronized (someObject) {
  while (true) {
    // Indefinitely lock someObject
    Thread.sleep(Integer.MAX_VALUE);
  }
}