package cote;

public class Codechuri {
	public static String solution(String code) {
        String ret = "";
        int length = code.length();
        char[] chars = code.toCharArray();
        int mode = 0;
        for ( int idx = 0 ; idx < length ; idx++ ){    
            if (mode == 0 ){
                if(chars[idx] != '1'&& idx%2 ==0){
                    ret += chars[idx];
                }
                if (chars[idx] == '1'){
                    mode = 1;
                }
            }
            else if (mode == 1){
                if(chars[idx]!='1'&& idx%2==1){
                    ret += chars[idx];
                }
                if(chars[idx] == '1'){
                    mode = 0;
                }
            }
        }
        return ret;
    }
	
	public static void main(String[] args) {
		String result = Codechuri.solution("abc1abc1abc");
		System.out.println(result);
	}
	
}
