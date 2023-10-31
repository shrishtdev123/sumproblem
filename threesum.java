class threesum
{
     public int[] threesum(int[] a)
     {
          int first=-1;
          int second=-1;
          int third=-1;
          int[] b={-1,-1,-1};
          int[] d=new int[3];
         for(int i=0;i<a.length;i++)
         {
             for(int j=i+1;j<a.length;j++)
             {
                 for(int k=i+2;k<a.length;k++)
                 {
                     if(a[i]+a[j]+a[k]==0 && i!j && i!k &&j!k)
                     {
                         first=i;
                         second=j;
                         third=k;
                     }
                 }
             }
         }
          b[0]=first;
         b[1]=second;
         b[2]=third;
         d[0]=b[0];
         d[1]=b[1];
         d[2]=d[2];

         return d;
     }
    public static void main(String[] args) {
        threesum t= new threesum();
      int[] a  = {-1,0,1,2,-1,-4};
      int[] c=t.threesum(a);
       for(int l=0;l<c.length;l++)
       {
           System.out.println(c[l]);
       }

    }
}