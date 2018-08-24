package top.linhuarui.thinking_in_java.chapter7.section6.s9;

/**
* @author LHR
* @date 2018/8/24
* @desc The common methods for any control event
* @version 1.0
* @modify
*   @date
*/
abstract public class Event {
    private long evtTime;

    public Event (long eventTime) {
        evtTime = eventTime;
    }

    public boolean reaady () {
        return System.currentTimeMillis() >= evtTime;
    }

    abstract public void action ();

    abstract public String description ();
}
