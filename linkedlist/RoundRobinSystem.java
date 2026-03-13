package BridgeLabz_Java.linkedlist;

class Process{
    int id;
    int burst;
    Process next;

    Process(int i,int b){
        this.id=i;
        this.burst=b;
    }
}

class RoundRobin{

    Process head;

    void add(int id,int b){

        Process p=new Process(id,b);

        if(head==null){
            head=p;
            p.next=head;
            return;
        }

        Process t=head;

        while(t.next!=head)
            t=t.next;

        t.next=p;
        p.next=head;
    }

    void display(){

        Process t=head;

        if(head==null) return;

        do{
            System.out.println("P"+t.id+" "+t.burst);
            t=t.next;
        }
        while(t!=head);
    }
}

public class RoundRobinSystem{
    public static void main(String[] args){

        RoundRobin rr=new RoundRobin();

        rr.add(1,5);
        rr.add(2,3);
        rr.add(3,7);

        rr.display();
    }
}