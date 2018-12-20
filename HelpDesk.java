package node;

import java.util.ArrayList;
import java.util.Collections;

public class HelpDesk implements Comparable {

    private Integer taskPriority;
    private String taskName;

    public HelpDesk(Integer taskPriority, String name){
        this.taskPriority = taskPriority;
        this.taskName = name;
    }

    @Override
    public int compareTo(Object o) {
        return this.getTaskPriority().compareTo(((HelpDesk) o).getTaskPriority());
    }


    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public static void main(String[] args) {
        HelpDesk desk1 = new HelpDesk(1,"work 1");
        HelpDesk desk2 = new HelpDesk(2,"work 2");
        HelpDesk desk3 = new HelpDesk(3,"work 3");
        HelpDesk desk4 = new HelpDesk(4,"work 4");
        HelpDesk desk5 = new HelpDesk(5,"work 5");
        

        ArrayList<HelpDesk> array = new ArrayList<>();
        array.add(desk2);
        array.add(desk5);
        array.add(desk1);
        array.add(desk3);
        array.add(desk4);

        System.out.println(array);

        Collections.sort(array);

        System.out.println(array);

    }
    @Override
    public String toString() {

       return "HelpDesk :"+this.taskName + "priority " + this.taskPriority;
    }
}
