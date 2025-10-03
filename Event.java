public class Event {
    public String name;
    public int priority;

    public Event(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
    
    public String getName(){
        return this.name;
    }

    public int getPriority(){
        return this.priority;
    }

    @Override
    public String toString(){
        return "Event{name='" + getName() + "', priority=" + getPriority() + '}';
    }
}