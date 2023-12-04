public class TreeNode<T> {
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(T dataNode) {
		this.data = dataNode;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(TreeNode<T> node) {
		this.data = node.data;
		this.left = node.left != null ? new TreeNode<>(node.left) : null;
		this.right = node.right != null ? new TreeNode<>(node.right) : null;
		
	}
	
	public T getData() {
		return data;
	}
	
	public TreeNode<T> getLeft(){
		return left;
	}
	
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}
	
	public TreeNode<T> getRight(){
		return right;
	}
	
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
}