package Garbage;

/**
 * Created by balint on 22.10.16.
 */
public class PaperGarbage extends Garbage {

    private Boolean isSqueezed;

    public Boolean getIsSqueezed () {
        return this.isSqueezed;
    }

    public void setIsSqueezed () {
        this.isSqueezed = true;
        System.out.println("Paper trash is squeezed!");
    }

    PaperGarbage () {
        this.isSqueezed = false;
    }

    PaperGarbage (Boolean isSqueezed) {
        this.isSqueezed = isSqueezed;
    }
}
