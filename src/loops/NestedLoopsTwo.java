package loops;

public class NestedLoopsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter1 = 0;
		int counter2 = 0;
		for(counter1=1;counter1<=5;counter1++)
			{
				if (counter1!= 3) {
					System.out.println(counter1);
				} else {
					for (counter2 = 1; counter2 <= 4; counter2++) {
						System.out.println(counter2);
					}
				}
				System.out.println();
			}
		}
	}

