package se.lexicon;


import se.lexicon.inheritanceExample.Animal;
import se.lexicon.inheritanceExample.Dog;

public class App
{
    public static void main( String[] args )
    {
        Dog fido = new Dog("Fido",60,4,1,20);
        fido.eat();

        Dog koko = new Dog();
        koko.setName("Koko");
        koko.setWeight(10);
        koko.setLeg(4);
        koko.setTail(1);
        koko.setTeeth(20);
        koko.eat();

        System.out.println(koko);



    }
}
