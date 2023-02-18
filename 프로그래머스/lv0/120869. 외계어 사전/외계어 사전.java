class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(int i=0; i<dic.length; i++) {
            int check = 1;
            for(int j=0; j<spell.length; j++) {
                if(!dic[i].contains(spell[j])) check = -1;
            }
            if(check == 1) return 1;
        }
        return 2;
    }
}