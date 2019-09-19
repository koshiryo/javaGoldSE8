package exam101to150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam142 {

	static class Block {
		String color;
		int size;

		Block(int size, String color) {
			super();
			this.size = size;
			this.color = color;
		}

		@Override
		public String toString() {
			return "Block [color=" + color + ", size=" + size + "]";
		}

	}

	static class ColorSorter implements Comparator<Block> {

		@Override
		public int compare(Block o1, Block o2) {
			return o1.color.compareTo(o2.color);
		}

	}

	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
		blocks.stream().forEach(s -> System.out.print(s));
	}

}