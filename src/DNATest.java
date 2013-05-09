
public class DNATest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DNA 종류 [ 아데닌 : A, 시토닌 : C, 구아닌 : G,  티민 : T ]");
		char DNA[][]=new char[][]{
			{'A','G','G','T','A','T','C','T','G','A'},
			{'C','T','A','C','C','G','G','G','A','T'},
			{'A','A','C','T','G','G','G','G','C','T'},
			{'C','A','G','C','T','A','T','G','T','G'},
			{'C','G','A','T','A','C','A','T','G','C'}
		};
		char a[]=new char[10];
		System.out.print("입력된 유전자 : ");
		for(int j=0;j<10;j++){
			a[j] = args[0].charAt(j);
			System.out.println(a[j] + " ");
		} System.out.println();
		
		int same[]=new int[5];
		for(int i=0;i<5;i++){
			System.out.print((i+1) + "번째 사람 유전자 : ");
			for(int j=0;j<10;j++){
				if(DNA[i][j]==a[j])same[i] += 10;
				System.out.print(DNA[i][j] + " ");
			}
			System.out.println();
			System.out.println("-> 입력된 유전자와 " + same[i] + "% 일치");
		}

	}

}