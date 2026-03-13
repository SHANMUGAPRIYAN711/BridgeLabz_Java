package BridgeLabz_Java.linkedlist;

class Task {

    int id;
    String name;
    int priority;
    String dueDate;

    Task next;

    Task(int id,String name,int priority,String dueDate){

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {

    Task head;

    public void addTask(int id,String name,int priority,String dueDate){

        Task newTask = new Task(id,name,priority,dueDate);

        if(head == null){
            head = newTask;
            newTask.next = head;
            return;
        }

        Task temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = head;
    }

    public void deleteTask(int id){

        if(head == null) return;

        Task temp = head;
        Task prev = null;

        do{

            if(temp.id == id){

                if(prev != null)
                    prev.next = temp.next;
                else
                    head = temp.next;

                return;
            }

            prev = temp;
            temp = temp.next;

        }while(temp != head);
    }

    public void displayTasks(){

        if(head == null) return;

        Task temp = head;

        do{

            System.out.println(
                    temp.id + " | " +
                            temp.name + " | " +
                            temp.priority + " | " +
                            temp.dueDate
            );

            temp = temp.next;

        }while(temp != head);
    }
}

public class TaskSchedulerSystem {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(1,"Submit Report",1,"20 May");
        scheduler.addTask(2,"Prepare PPT",2,"22 May");
        scheduler.addTask(3,"Team Meeting",3,"25 May");

        System.out.println("Task List");
        scheduler.displayTasks();

        System.out.println("\nDeleting Task");
        scheduler.deleteTask(2);

        System.out.println("\nUpdated Task List");
        scheduler.displayTasks();
    }
}