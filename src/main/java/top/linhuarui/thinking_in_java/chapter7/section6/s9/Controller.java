package top.linhuarui.thinking_in_java.chapter7.section6.s9;

/**
* @author LHR
* @date 2018/8/24
* @desc Along with Event, the generic framework for all control systems:
* @version 1.0
* @modify
*   @date
*/
public class Controller {
    private EventSet es = new EventSet();

    public void addEvent (Event c) {
        es.add(c);
    }

    public void run () {
        Event e;
        while ((e = es.getNext()) != null) {
            if (e.reaady()) {
                e.action();
                System.out.println(e.description());
                es.removeCurrent();
            }
        }
    }

}
// This is just a way to hold Event objects.
class EventSet {
    private Event[] events = new Event[100];
    private int index = 0;
    private int next = 0;

    public void add (Event e) {
        if (index >= events.length) {
            return; // (In real life, throw exception)
        }

        events[index++] = e;
    }

    public Event getNext () {
        boolean looped = false;
        int start = next;

        do {
            next = (next + 1) % events.length;
            // See if it has looped to the beginning:
            if (start == next) {
                looped = true;
            }

            // If it loops past start, the list is empty:
            if ((next == (start + 1) % events.length) && looped) {
                return null;
            }
        }while (events[next] == null);

        return events[next];
    }

    public void removeCurrent () {
        events[next] = null;
    }

}