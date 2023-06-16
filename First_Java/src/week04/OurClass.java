package week04;

public class OurClass {

    private final boolean just = true;

    // throws : 던지다! ( = 예외를 던지다 / 발생시키다 )
    public void thisMethodIsDangerous() throws OurBadException{
                                            /*일종의 flag*/
        // custom logic~!
        if (just) {
            throw new OurBadException();
        }
    }
}
