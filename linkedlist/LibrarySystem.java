package BridgeLabz_Java.linkedlist;

class Book{

    int id;
    String title,author;
    boolean available;

    Book next;
    Book prev;

    Book(int i,String t,String a,boolean av){
        this.id=i;
        this.title=t;
        this.author=a;
        this.available=av;
    }
}

class Library{

    Book head;

    void add(int id,String t,String a,boolean av){

        Book b=new Book(id,t,a,av);

        b.next=head;

        if(head!=null)
            head.prev=b;

        head=b;
    }

    void display(){

        Book t=head;

        while(t!=null){
            System.out.println(t.id+" "+t.title+" "+t.author+" "+t.available);
            t=t.next;
        }
    }
}

public class LibrarySystem{
    public static void main(String[] args){

        Library lib=new Library();

        lib.add(1,"DSA","CLRS",true);
        lib.add(2,"Java","James",true);

        lib.display();
    }
}
