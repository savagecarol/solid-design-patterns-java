package behaviourial.chainOfRespnosibility.good;

/**
 * Simple abstract class
 *
 * 2 things:
 *  1. who will do task right now
 *  2. who will do if I am not able to do it
 *
 */
public abstract class Handler {

    public Handler nextHandler;

    public void setNextHandler(Handler nextHandler) { // who will do next task
        this.nextHandler = nextHandler;
    }

    public abstract void handleOrder(String order); // right now

}

