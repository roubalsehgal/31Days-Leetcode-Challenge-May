class TrieNode {
	private HashMap < Character,
	TrieNode > children = new HashMap < >();
	public boolean isEnd = false; // "public" for simplicity

	public void putChildIfAbsent(char ch) {
		children.putIfAbsent(ch, new TrieNode());
	}

	public TrieNode getChild(char ch) {
		return children.get(ch);
	}
}

class Trie {
	TrieNode root = new TrieNode();

	public void insert(String word) {
		TrieNode curr = root;
		for (char ch: word.toCharArray()) {
			curr.putChildIfAbsent(ch);
			curr = curr.getChild(ch);
		}
		curr.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode curr = root;
		for (char ch: word.toCharArray()) {
			curr = curr.getChild(ch);
			if (curr == null) {
				return false;
			}
		}
		return curr.isEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode curr = root;
		for (char ch: prefix.toCharArray()) {
			curr = curr.getChild(ch);
			if (curr == null) {
				return false;
			}
		}
		return true;
	}
}