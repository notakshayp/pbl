class LCMNums{
    public static void main(String[] args) {
        long lcm=1;
        int div=2;
       
        int []num=new int[args.length];
        int ptr=0;
        for(String x : args){
            num[ptr]=Integer.parseInt(x);
            ptr++;
        }
        while(true){
            int c=0;
            boolean f=false;
            for(int i=0;i<num.length;i++){
               
                //System.out.println(num[i]);
                if(num[i]==0){
                    lcm=0;
                   
                   c=args.length;
                }
                else if(num[i]<0){
                    num[i]*=-1;
                }

                if(num[i]==1){
                    c++;
                }
                else if(num[i] % div==0){
                    f=true;
                    num[i]=num[i]/div;
                }
            }
            if(f){
                System.out.println(" "+div);
                lcm*=div;
            }
            else{
                div++;
            }
            if(c==args.length){
                break;
            }
        }
        System.out.println(lcm);
    }
}