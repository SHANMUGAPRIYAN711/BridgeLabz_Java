package BridgeLabz_Java.linkedlist;

class State{

    String text;
    State prev,next;

    State(String t){
        this.text=t;
    }
}

class TextEditor{

    State current;

    void type(String text){

        State s=new State(text);

        if(current!=null){
            current.next=s;
            s.prev=current;
        }

        current=s;
    }

    void undo(){
        if(current.prev!=null)
            current=current.prev;
    }

    void redo(){
        if(current.next!=null)
            current=current.next;
    }

    void show(){
        System.out.println(current.text);
    }
}

public class EditorSystem{

    public static void main(String[] args){

        TextEditor ed=new TextEditor();

        ed.type("Hello");
        ed.type("Hello World");

        ed.show();

        ed.undo();

        ed.show();
    }
}
