import java.util.ArrayList;

//constraints: need to use String longest2CharacterSubstring(String input)
//The above example is a little confusing because it is returning a substring of size 10 in which bbbbcc are the only substring 
//that are repeating. 
//I will write the program such that if you enter the value ("abcbbbbcccbdddadacb") then the output will be bbbbcc.
public class FindString {
    int start, end; 
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public static void main(String args[]){
        FindString obj = new FindString(); 
        obj.longest2CharacterSubstring("abcbbbbcccbdddadacb");
    }
    
    String longest2CharacterSubstring(String input){
     A: for(int i=0; i< input.length(); i++){
          B:  for(int j = 0; j<input.length(); j++){
                if(input.charAt(i) == input.charAt(j) && i != j){
                    if(end <= 0){
                    start = input.charAt(i);
                    }
                    
                    //int storeJ = j;
                    while(input.charAt(i) == input.charAt(j) && j != i){
                        end = j;
                        j++;
                        if(((start - end) %2) == 0 ){
                            break B;
                        }
                    }
                    if(input.charAt(i) != input.charAt(j) && (input.size() -1) <= (j+1)){ 
                        if(input.charAt(j) == input.charAt(j+1)){
                            end = j+1;
                            if((input.size() -1) <= (j+1)){
                        
                              i = j = j+1;
                            }
                        }
                        }
                    
                    }
                }
            }
            
        }
        return subString(); 
    }
    
    String subString(){
        /***FUNCTIONALITY THAT WAS SUPPOSED TO GO IN THIS METHOD IS LISTED BELOW***/
        //use the arraylist to store pairs of values which are start and end, both start and end represent the start and 
        //end of a pattern where there are two consecutive repeting characters, start and end are indeces where the repetition 
        //occurs. Since the arraylist is dynamic it can store n number of combinitions of start and end. 
        //the end goal is to take start and end and subtract them to find which pair has the largest number of indices between them 
        // this will give us the largest sub string. 
        return "string";
    }
}
        /***because of time constraint I was not able to complete this program.***/
		
		
		
		//////git test