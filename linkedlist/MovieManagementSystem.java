package BridgeLabz_Java.linkedlist;

class Movie {

    String title;
    String director;
    int year;
    double rating;

    Movie next;
    Movie prev;

    Movie(String title,String director,int year,double rating){

        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {

    Movie head;
    Movie tail;

    public void insertAtBeginning(String title,String director,int year,double rating){

        Movie newMovie = new Movie(title,director,year,rating);

        if(head == null){
            head = tail = newMovie;
            return;
        }

        newMovie.next = head;
        head.prev = newMovie;
        head = newMovie;
    }

    public void insertAtEnd(String title,String director,int year,double rating){

        Movie newMovie = new Movie(title,director,year,rating);

        if(head == null){
            head = tail = newMovie;
            return;
        }

        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }

    public void deleteByTitle(String title){

        Movie temp = head;

        while(temp != null){

            if(temp.title.equalsIgnoreCase(title)){

                if(temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if(temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                return;
            }

            temp = temp.next;
        }
    }

    public void displayForward(){

        Movie temp = head;

        while(temp != null){

            System.out.println(
                    temp.title + " | " +
                            temp.director + " | " +
                            temp.year + " | " +
                            temp.rating
            );

            temp = temp.next;
        }
    }

    public void displayReverse(){

        Movie temp = tail;

        while(temp != null){

            System.out.println(
                    temp.title + " | " +
                            temp.director + " | " +
                            temp.year + " | " +
                            temp.rating
            );

            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieList list = new MovieList();

        list.insertAtBeginning("Jana Nayagan","H Vinoth",2026,10.0);
        list.insertAtEnd("Leo","Lokesh Kanagaraj",2025,8.5);
        list.insertAtEnd("Love Today","Pradeep Ranganathan",2025,9.2);

        System.out.println("Movies Forward");
        list.displayForward();

        System.out.println("\nMovies Reverse");
        list.displayReverse();

        System.out.println("\nDeleting Movie");
        list.deleteByTitle("Avatar");

        System.out.println("\nUpdated Movie List");
        list.displayForward();
    }
}
