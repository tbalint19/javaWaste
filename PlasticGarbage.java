package Garbage;

/**
 * Created by balint on 22.10.16.
 */
public class PlasticGarbage extends Garbage {

    private Boolean isClean;

    public Boolean getIsClean () {
        return this.isClean;
    }

    public void setIsClean () {
        this.isClean = true;
        System.out.println("Plastic trash is cleansed!");
    }

    PlasticGarbage () {
        this.isClean = false;
    }

    PlasticGarbage (Boolean isClean) {
        this.isClean = isClean;
    }
}
