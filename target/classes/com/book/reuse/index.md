# Reuse  

1. You can create objects of your existing classes inside new the class. This is called **composition**, because the new class is **composed** of objects of existing classes.
2. You can create a new class as a **type** of an existing class. You literally take the form of the existing class and add code to it without modifying the existing class. This technic is called **inheritance**, and the compiler does most of the work.

## composition  

Simple place object references inside new classes.

## Initializing the Base Class

When you create an object of derived class, it contains within it a *subobject* of the base class. This subobject is the same as if you had created an object of the base class by itself. It's just that from the outside, the subobject of the base class is wrapped within the derived-class object.  

It's essential that the base-class subobject be initialized correctly, and there's only one way to guarantee this: Perform the initialization in the constructor by calling the base-class constructor, which has all the apropriate knowledge and privileges to perform the base-class initialization.  

## Chosing Composition vs. Inheritance
Use composition when you want the functionality of an existing class inside your new class, but not its interface. That is, embed (usually private) object to implement features in your new class. The users of your new class sees the interface you've defined for the new class rather than the interface from the embedded object.  
Sometimes it makes sense to allow the class user to directly access the composition of your new class. For this, make the member objects public (like a kind of "semi-delegation"). The members objects use implementation hiding themselves, so this is safe. When the user knows you're assembling a bunch of parts, it makes the interface easier to unserstand.
