package common.tree;

public enum TreeTraversal {
    NLR("前序遍历", "Preorder Traversal"),
    LNR("中序遍历", "Inorder Traversal"),
    LRN("后续遍历","Postorder Traversal");

    private String chinese;
    private String english;

    TreeTraversal(String chinese, String english) {
        this.chinese = chinese;
        this.english = english;
    }

    @Override
    public String toString() {
        return "TreeTraversal{" +
                "chinese='" + chinese + '\'' +
                ", english='" + english + '\'' +
                '}';
    }
}
