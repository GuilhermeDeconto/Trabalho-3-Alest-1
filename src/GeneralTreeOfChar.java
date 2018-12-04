
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class GeneralTreeOfChar {

	private class TrieNode {
		TrieNode[] arr;
		boolean isEnd;
		String words;

		// Initialize your data structure here.
		public TrieNode() {
			this.arr = new TrieNode[26];
			words = "";
		}

	}

	private TrieNode root;
	public int count;

	public GeneralTreeOfChar() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word, String words) {
		TrieNode p = root;
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (p.arr[index] == null) {
				TrieNode temp = new TrieNode();
				p.arr[index] = temp;
				p = temp;
				count++;
			} else {
				p = p.arr[index];
			}
		}
		p.isEnd = true;
		p.words = words;
	}

	// Returns if the word is in the trie.
	public boolean search(String word) {
		TrieNode p = searchNode(word);
		if (p == null) {
			return false;
		} else {
			if (p.isEnd) return true;
		}

		return false;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode p = searchNode(prefix);
		if (p != null) {
			return true;
		}
		return false;
	}

	public LinkedListOfInteger childrenNode(String s) {
		TrieNode p = searchNode(s);
	}
	public String searchWords(String s) {
		TrieNode p = searchNode(s);
		if (p != null) {
			if (p.words != null) {
				return p.words;
			}
		}
		return "Não encontrei significado desta palavra " + s;
	}

	private TrieNode searchNode(String s) {
		TrieNode p = root;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';
			if (p.arr[index] != null) {
				p = p.arr[index];
			} else {
				return null;
			}
		}

		if (p == root) return null;

		return p;
	}

	public LinkedListOfInteger searchAux(String s) {
		if (this.startsWith(s)) {
			return childrenNode(s);
		}
		return null;
	}
}

