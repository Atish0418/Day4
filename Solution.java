package Day4;

class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        int length = title.length();
        int i = 0;

        while(i < length){
            while(i < length && title.charAt(i) == ' '){
                sb.append(' ');
                i++;
            }
            int start = i;
            while(i < length && title.charAt(i) != ' '){
                i++;
            }
            int end = i;

            if(end - start > 2){
                sb.append(Character.toUpperCase(title.charAt(start)));
                for(int j=start+1; j<end; j++){
                    sb.append(Character.toLowerCase(title.charAt(j)));
                }
            }
                else{
                    for(int j=start; j<end; j++){
                        sb.append(Character.toLowerCase(title.charAt(j)));
                    }
                }
            }
           return sb.toString();
        } 
    }

