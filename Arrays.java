public class Arrays {
	public static void main(String[] args) {
		
		
		int[] ints = {1,2,3,4,5,6,7,8,12,13,14,15};
		int i = 0;
		while (i < ints.length) {
			System.out.print(ints[i] + " ");
			i++;

		}
		i=0;
		System.out.println();
		while (i < ints.length) {
			if (ints[i] % 2 == 0) {
				System.out.print(ints[i] + " ");
			}
			i++;

		}
		System.out.println();

		i=0;
		String[] strings = {"Joe","Emily","Bob","Joanne"};
		String targetName = "Bob";
		boolean found = false;
		while (i < strings.length || found == false) {
			if (strings[i].equals(targetName) == true) {
				found = true;
				System.out.println(targetName + " is found at index " + i);
				i++;
			}
			else {
				i++;
			}
		}
		
		String[] addresses = {"6767 Man O War Ln", "1234 Ashfield Place", "2704 Beyerbach Dr", "1111 Heavenly Rd"};
		for (int j = 0; j<addresses.length; j++) {
			System.out.print(addresses[j] + ", ");
		}
	}

}
