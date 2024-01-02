package algorithm01.sec05;

public class BinTreeEx01 {

	public static void main(String[] args) {
		
		// BinTree --> Java狼 TreeMap俊 秦寸
		BinTree<Integer, String> tree = new BinTree<>();
		
		tree.add(5, "全辨悼5");
		tree.add(3, "全辨悼3");
		tree.add(2, "全辨悼2");
		tree.add(4, "全辨悼4");
		tree.add(8, "全辨悼8");
		
		tree.print();
		
		String data = tree.search(4);
		System.out.println(data);
		data = tree.search(10);
		System.out.println(data);
	}

}