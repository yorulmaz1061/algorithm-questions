package codewarsQuestions;


public class Q8 {

    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','f'};
        System.out.println(findMissingLetter(ch));

    }

    public static char findMissingLetter(char[] array) {
        /*java.util.List<Integer> listArr = new java.util.ArrayList<>();
        int asciiValue = 0;
        for (int i = 0; i < array.length; i++) {
            asciiValue = (int) array[i];
            listArr.add(asciiValue);
        }
        int arraySum=0;
        for (int num:listArr){
            arraySum+=num;
        }
        double expectedSumA = (listArr.get(listArr.size()-1)+listArr.get(0))/2.0;
        int expectedSum= (int) (expectedSumA*(listArr.size()+1));
        int missingNumber = expectedSum - arraySum;
        char ch=(char) missingNumber;
        return ch;

    }
*/
       /* char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;*/
        for (int i=0;i<array.length-1;i++)
        {
            if ((int)array[i] < ((int)array[i+1])-1)
            {
                return (char)((int)array[i]+1);
            }
        }
        return ' ';
    }


    }





