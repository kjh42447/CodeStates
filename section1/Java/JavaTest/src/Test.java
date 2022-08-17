import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> result = new ArrayList<>();
        treeBFS(node, result, new ArrayList<tree>());
        return result;
    }

    //dfs
    public static void treeBFS(tree node, ArrayList<String> result, ArrayList<tree> q) {
        tree nownode;
        q.add(node);
        result.add(node.getValue());
        while (q.size() != 0) {
            nownode = q.remove(0);
            if (nownode.getChildrenNode() != null) {
                for (int i = 0; i < nownode.getChildrenNode().size(); i++) {
                    q.add(nownode.getChildrenNode().get(i));
                    result.add(nownode.getChildrenNode().get(i).getValue());
                }
            }
        }
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }

    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new tree("6"));
        rootChild2.addChildNode(new tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
  }
}