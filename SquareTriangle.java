class SquareTriangle{
	public static void main(String []args){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		int k=n*2-1;
		for(int i=1;i<=k;i++){
			for(int j=1;j<=k;j++){
				if(j==i || j==k-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}