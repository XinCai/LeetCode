package datastructers;

import java.util.ArrayList;
import java.util.List;

public class MyTreeNode {
    String value;
    List<MyTreeNode> neightbours;

    public MyTreeNode(String value) {
        this.value = value;
        this.neightbours = new ArrayList<MyTreeNode>();
    }
}
