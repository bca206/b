class lab02{
    public static void main(String args[]){
            boolean prime=true;
            int i,n=args.length;
            for(i=0;i<n;i++){
                prime=true;
                int num=Integer.parseInt(args[i]);
                    for(int j=2;j<num;j++){
                        if(num%j==0){
                            prime=false;
                            break;
                        }
                    }
                    if(prime)
                            System.out.println(num+"=is prime");
                    else
                            System.out.println(num+"=not prime");
            }
    }
}