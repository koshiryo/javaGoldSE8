package exam90;

public class Daze extends Baz {

    private Bar bb = new Bar();

    @Override
    public void methoodB(String s) {
        bb.methoodB(s);
        super.methoodB(s);
    }

}
