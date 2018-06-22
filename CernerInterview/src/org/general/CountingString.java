package org.general;

public class CountingString {

    public static String countCharInString(String inputString) {


        char[] charArray = inputString.toCharArray();
        String visitedNodes = "";
        char rover;
        int counter = 0;
        String result = "";
        String totalResult = "";
        
        for(int i = 0 ; i < charArray.length; i++){
            counter = 0;//initializing
            rover = charArray[i];//rover to first element
            if( !visitedNodes.contains(Character.toString(rover))){
                //checking for counter
                for(int j=0 ; j < charArray.length; j++){

                    if(rover == charArray[j]){
                        counter ++;
                    }

                    result = Character.toString(rover)+Integer.toString(counter);
                }
                totalResult = totalResult + result;
            }
            visitedNodes = visitedNodes + rover; // adding rover to visited nodes
        }

        return totalResult;
    }

    public static void main(String args[]){

        String Test1 = "aaa";
        String Test2 = "aaabbbcc";
        String Test3 = "cabca";

        String result = countCharInString(Test3);

        System.out.println(result);
    }

}
