
public class FizzBuzz {

    private static final String MOD_5_MESSAGE = "Buzz";
    private static final String MOD_3_MESSAGE = "Fizz";

    public String sendAndReturn(int number) {
        StringBuilder result = new StringBuilder();
        if( mod3(number) ) {
            result.append(MOD_3_MESSAGE);
        }
        
        if( mod5(number) ) {
            result.append(MOD_5_MESSAGE);
        }
        
        if( emptyOrNot(result) ) {
            result.append(number);
        }
        
        return result.toString();
    }

    private boolean emptyOrNot(StringBuilder result) {
        return "".equals(result.toString());
    }

    private boolean mod5(int number) {
        return Math.floorMod(number, 5) == 0;
    }

    private boolean mod3(int number) {
        return Math.floorMod(number, 3) == 0;
    }

}
