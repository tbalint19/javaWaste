package Garbage;

/**
 * Created by balint on 22.10.16.
 */
public class World {

    public static void main (String [] args) {

        Dustbin bin = new Dustbin();

        PaperGarbage unknownCup = new PaperGarbage();
        PlasticGarbage unknownSack = new PlasticGarbage();
        Garbage leftoverFood = new Garbage();
        PaperGarbage unsqueezedCup = new PaperGarbage(false);
        PlasticGarbage dirtySack = new PlasticGarbage(false);
        PaperGarbage squeezedCup = new PaperGarbage(true);
        PlasticGarbage cleanSack = new PlasticGarbage(true);

        System.out.println(bin.getPlasticContent());
        System.out.println(bin.getPaperContent());
        System.out.println(bin.getHouseWasteContent());

        bin.thrownOutGarbage(unknownCup);
        bin.thrownOutGarbage(unknownSack);
        bin.thrownOutGarbage(leftoverFood);
        bin.thrownOutGarbage(unsqueezedCup);
        bin.thrownOutGarbage(dirtySack);
        bin.thrownOutGarbage(squeezedCup);
        bin.thrownOutGarbage(cleanSack);

        System.out.println(bin.getPlasticContent());
        System.out.println(bin.getPaperContent());
        System.out.println(bin.getHouseWasteContent());

        bin.emptyContents();

        System.out.println(bin.getPlasticContent());
        System.out.println(bin.getPaperContent());
        System.out.println(bin.getHouseWasteContent());

    }

}
