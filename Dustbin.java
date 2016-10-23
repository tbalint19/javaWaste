package Garbage;
import java.util.*;


/**
 * Created by balint on 22.10.16.
 */
public class Dustbin {

    private String color;

    private ArrayList<PaperGarbage> PaperContent = new ArrayList<PaperGarbage>();

    private ArrayList<PlasticGarbage> PlasticContent = new ArrayList<PlasticGarbage>();

    private ArrayList<Garbage> HouseWasteContent = new ArrayList<Garbage>();

    public ArrayList<PaperGarbage> getPaperContent () {
        return this.PaperContent;
    }

    public ArrayList<PlasticGarbage> getPlasticContent () {
        return this.PlasticContent;
    }

    public ArrayList<Garbage> getHouseWasteContent () {
        return this.HouseWasteContent;
    }

    public void thrownOutGarbage (Garbage thrash) {

        if (thrash instanceof PaperGarbage) {
            PaperGarbage paperThrash = (PaperGarbage) thrash;
            if (paperThrash.getIsSqueezed()) {
                this.PaperContent.add((PaperGarbage) thrash);
            }
            else {
                paperThrash.setIsSqueezed();
                this.PaperContent.add((PaperGarbage) thrash);
            }
        }
        else if (thrash instanceof PlasticGarbage) {
            PlasticGarbage plasticTrash = (PlasticGarbage) thrash;
            if (plasticTrash.getIsClean()) {
                this.PlasticContent.add((PlasticGarbage) thrash);
            }
            else {
                plasticTrash.setIsClean();
                this.PlasticContent.add((PlasticGarbage) thrash);
            }
        }
        else {
            this.HouseWasteContent.add(thrash);
        }

    }

    public void emptyContents () {
        this.PaperContent.clear();
        this.PlasticContent.clear();
        this.HouseWasteContent.clear();
    }

}
