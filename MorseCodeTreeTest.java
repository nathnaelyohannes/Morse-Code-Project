import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class MorseCodeTreeTest {
	
	private MorseCodeTree morseCodeTree;
	
	@Before
	public void setUp() {
		morseCodeTree = new MorseCodeTree();
	}
	
	@Test
	public void testBuildTree() {
		TreeNode<String> root = morseCodeTree.getRoot();
		assertNotNull("Tree root should not be null", root);
	}
	
	@Test
	public void testTreeTraversal() {
		ArrayList<String> list = morseCodeTree.toArrayList();
		assertNotNull("Traversal list should not be null", list);
		assertFalse("Traversal list should not be empty", list.isEmpty());
	}
	
	public void testDeleteUnsupported() {
		morseCodeTree.delete("e");
	}
	
	public void testUpdateUnsupported() {
		morseCodeTree.update();
	}

}
