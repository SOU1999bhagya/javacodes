class HollowTriangle{
	public static void main(String args[]){
		
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j==1 || j==i || i==n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}