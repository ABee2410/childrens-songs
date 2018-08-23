/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    public static void eieio() 
    { /**
        *This function prints the line that says eieio
        */
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String animal) 
    { /**
        *This function prints the line that tells what animal is on the farm
        */
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    public static void withA(String sound) 
    { /**
        *This function prints the lines with the animal's sound
        */
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    public static void singIt(String animal, String sound) 
    { /**
        *This function calls the order of the verses
        *First, it calls the eieio function for the first line.
        *Next, it calls the hadA function that introduces the animal and the withA function
        *that tells the sound.
        *Finally, it prints the eieio line again.
        */
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
    public static void main(String[] args) 
    { /**
        *This function prints the song title and then calls to sing the verse
        *with each animal and it's corresponding sound.
        */
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "\"quack\"");
        singIt("cow", "\"moo\"");
        singIt("horse", "\"neigh\"");
        singIt("platypus","\"gdggdggddgdg\"");
        
        // now see how easy it is to add some more animals  
        singIt("moose", "\"auhhgghhh\"");
        singIt("whale", "\"huAAAuuuUUHhh\"");
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
