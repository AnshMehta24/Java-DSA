package Array.Easy;
public class Linear_Search {

    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static  String linearString(String names[], String key){

        for(int i =0;i<names.length;i++){
            if(names[i].equals(key)){
                return Integer.toString(i);
            }
        }
        return Integer.toString(-1);
    }

    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10,12,14,16};
//        int key=10;
//
//        int index = linearSearch(numbers, key);
//        if(index == -1){
//            System.out.println("There is no index like key");
//        }
//
//        System.out.println("the index is i = " + index);

        String names[] = {"Pizza", "Dabeli", "VadaPav", "Pulav", "Dosa", "Idli"};

        String key = "Dosa";

        String index  = linearString(names, key);
        if(index.equals(Integer.toString(-1))){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index is i = "+ index);
        }
    }
}
