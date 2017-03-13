package BFSTest;

import java.util.*;

/**
 * Created by dell on 2017/3/13/0013.
 */
public class BFSearch {
    /**
     * 广度优先搜索
     * BFSearch
     * @param node
     * 	搜索的入口节点
     */
    public void searchTraversing(GraphNode node) {
        List<GraphNode> visited = new ArrayList<GraphNode>(); // 已经被访问过的元素
        Queue<GraphNode> q = new LinkedList<GraphNode>(); // 用队列存放依次要遍历的元素
        q.offer(node);//将指定元素加入此队列的尾部

        while (!q.isEmpty()) {
            GraphNode currNode = q.poll();//获取队列头部的元素，并删除该元素
            if (!visited.contains(currNode)) {//返回集合里是否包含指定元素
                visited.add(currNode);
                System.out.println("节点：" + currNode.getLabel());
                for (int i = 0; i < currNode.edgeList.size(); i++) {
                    q.offer(currNode.edgeList.get(i).getNodeRight());
                }
            }
        }
    }
}
