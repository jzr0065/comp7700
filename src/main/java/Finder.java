public class Finder {

    public static Integer findMax(int[] intArray){


        if (intArray == null){
            return null;
        }

        if (intArray.length == 0){
            return null;
        }

        int i, max_index = 0 ;
        for( i = 0 ;i < intArray.length ; i ++){
            if(intArray[i] > intArray[max_index]) {
                max_index = i;
            }
        }
        return intArray[max_index];
    }

    public static Integer findMin(int[] intArray){

        if (intArray == null){
            return null;
        }

        if (intArray.length == 0){
            return null;
        }

        int i, min_index = 0 ;
        for( i = 0 ;i < intArray.length ; i ++){
            if(intArray[i] < intArray[min_index]) {
                min_index = i;
            }
        }
        return intArray[min_index];
    }


}

