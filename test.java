class test{

        public int[] twosum(int a[],int target) {

            int[] b={-1,-1};
            int first=-1;
            int last=-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    first=i;
                    last=j;
                }
            }
        }
          b[0]=first;
        b[1]=last;
        return b;
    }

    public static void main(String[] args)
    {
       int[] a={2,7,11,15};
       int target=9;
        test t=new  test();
       int[] c=t.twosum(a,target);
        System.out.println(c[0]);
        System.out.println(c[1]);
    }
}