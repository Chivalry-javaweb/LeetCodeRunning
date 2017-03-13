package BFSTest;

/**
 * Created by dell on 2017/3/13/0013.
 */
public class Test {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.initGraph();
        new BFSearch().searchTraversing(myGraph.getGraphNodes().get(0));
    }

}
