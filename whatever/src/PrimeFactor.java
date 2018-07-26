
public class PrimeFactor {

    public String of(int input) {
        String result = "";
        int i = 2;
        while(input > 1) {
            if(input % i == 0) {
                result = result + i + ",";
                input = input / i;
            } else {
                i++;
            }
        }
        
        if(!"".equals(result)) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
        return result;
    }

}
