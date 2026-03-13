package BridgeLabz_Java.linkedlist;

class Ticket{

    int id;
    String customer,movie;

    Ticket next;

    Ticket(int i,String c,String m){
        id=i;
        customer=c;
        movie=m;
    }
}

class TicketSystem{

    Ticket head;

    void book(int id,String c,String m){

        Ticket t=new Ticket(id,c,m);

        if(head==null){
            head=t;
            t.next=head;
            return;
        }

        Ticket temp=head;

        while(temp.next!=head)
            temp=temp.next;

        temp.next=t;
        t.next=head;
    }

    void display(){

        if(head==null) return;

        Ticket t=head;

        do{
            System.out.println(t.id+" "+t.customer+" "+t.movie);
            t=t.next;
        }
        while(t!=head);
    }
}

public class TicketReservation{

    public static void main(String[] args){

        TicketSystem ts=new TicketSystem();

        ts.book(1,"Arun","Avengers");
        ts.book(2,"Priya","Avatar");

        ts.display();
    }
}
