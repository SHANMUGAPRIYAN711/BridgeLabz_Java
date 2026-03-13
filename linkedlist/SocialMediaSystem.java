package BridgeLabz_Java.linkedlist;
class User{

    int id;
    String name;

    int[] friends=new int[10];
    int count=0;

    User next;

    User(int i,String n){
        this.id=i;
        this.name=n;
    }
}

class SocialNetwork{

    User head;

    void addUser(int id,String name){

        User u=new User(id,name);

        u.next=head;
        head=u;
    }

    void display(){

        User t=head;

        while(t!=null){

            System.out.print(t.name+" friends:");

            for(int i=0;i<t.count;i++)
                System.out.print(t.friends[i]+" ");

            System.out.println();

            t=t.next;
        }
    }
}

public class SocialMediaSystem{

    public static void main(String[] args){

        SocialNetwork sn=new SocialNetwork();

        sn.addUser(1,"Arun");
        sn.addUser(2,"Priya");

        sn.display();
    }
}
