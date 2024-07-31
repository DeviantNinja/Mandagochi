public class Task {

    DateTime issueDate;     //populate on creation
    DateTime startDate;     //populate when task started by user
    DateTime dueDate;       //used for high priority tasks
    int taskDuration;
    int taskDifficulty;     //difficulty rating between 1-5
    int taskClarity;        //
    int taskTitle;          //
    int priorityLevel;      //
    boolean taskCompleted;  //

    public Task() {
        
    }
}