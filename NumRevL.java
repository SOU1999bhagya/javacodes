class NumRevL{
	public static void main(String args[]){
		String num=args[0];
		int n=Integer.parseInt(num);
		
		for(int i=1;i<=n;i++){
			if(i==3)
			for(int j=1;j<=i;j++){
				if(j<=i){
					System.out.print(i+""+j+" ");
				}
				else{
					System.out.print("   ");
				}
				//System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}
}