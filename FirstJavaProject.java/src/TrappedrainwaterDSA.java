import java.util.*;
public class TrappedrainwaterDSA {
public static int Traprainwater(int height[]){
    //calculate max left boundry
    int left_max[]= new int[height.length];
    left_max[0]=height[0];
    for(int i=1;i< height.length;i++){
        left_max[i]= Math.max(height[i],left_max[i-1]);
    }
    //calculate max right boundry
    int right_max[]=new int [height.length];
    right_max[height.length-1]= height[height.length-1];
    for(int i= height.length-2;i>=0;i--){
        right_max[i]=Math.max(height[i],right_max[i+1]);
    }
    //loop
    int trappedwater =0;

for(int i=0;i< height.length;i++){
    //waterlevel = min(max left, max right)
    int waterlevel = Math.min(left_max[i],right_max[i]);
    //traped water = waterlevel - height[i]}
    trappedwater= trappedwater + waterlevel - height[i];
}
return trappedwater;
}

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        System.out.println(Traprainwater(height));
    }

}
