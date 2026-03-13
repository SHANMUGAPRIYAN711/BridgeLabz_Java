package BridgeLabz_Java.linkedlist;

class Item{
    int id,qty;
    String name;
    double price;
    Item next;

    Item(int i,String n,int q,double p){
        id=i;name=n;qty=q;price=p;
    }
}

class Inventory{

    Item head;

    void add(int id,String name,int q,double p){

        Item it=new Item(id,name,q,p);

        it.next=head;
        head=it;
    }

    double totalValue(){

        double sum=0;
        Item t=head;

        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }

        return sum;
    }

    void display(){
        Item t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.name+" "+t.qty+" "+t.price);
            t=t.next;
        }
    }
}

public class InventorySystem{
    public static void main(String[] args){

        Inventory inv=new Inventory();

        inv.add(101,"Laptop",5,55000);
        inv.add(102,"Mouse",20,500);

        inv.display();

        System.out.println("Total Value "+inv.totalValue());
    }
}
