import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTest {
    private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private static List<Node> nodeList = null;
    /**
     * 内部类：节点
     */
    private static class Node {
        private int data =0;
        private Node leftChild;
        private Node rightChild;

        Node(int newData) {
            data = newData;
            leftChild = null;
            rightChild = null;
        }
    }
        public  void createBinTree() {
            nodeList = new LinkedList<Node>();
            // 将一个数组的值依次转换为Node节点
            for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
                nodeList.add(new Node(array[nodeIndex]));
            }
            // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
            for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
                // 左孩子
                nodeList.get(parentIndex).leftChild = nodeList.get(parentIndex * 2 + 1);
                // 右孩子
                nodeList.get(parentIndex).rightChild = nodeList.get(parentIndex * 2 + 2);
            }
            // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
            int lastParentIndex = array.length / 2 - 1;
            // 左孩子
            nodeList.get(lastParentIndex).leftChild = nodeList.get(lastParentIndex * 2 + 1);
            // 右孩子,如果数组的长度为奇数才建立右孩子
            if (array.length % 2 == 1) {
                nodeList.get(lastParentIndex).rightChild = nodeList.get(lastParentIndex * 2 + 2);
            }
        }
    }
