/* when we try to downcast a referece of specific subclass type but the object does not have the attributes and behaviour of subclass 
 * type then we get a class cast exception
 * 
 * It is runtime exception
 */

package Exception;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void  barking(){
        System.out.println("Dog is barking");
    }
}

class Driver {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = (Dog) animal;        //Class cast Exeption
        dog.barking();
    }
}
