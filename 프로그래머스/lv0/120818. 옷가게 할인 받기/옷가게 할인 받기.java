class Solution {
    public int solution(int price) {
        int result = 0;
        if(price>=500000) {
            result = (int)(price*0.8);//int형에 소수를 곱해서 자동 double형변환, (int)로 다시 형변환. 그럼 소수점 뒷자리는 버리고 int로 변환된다.
        } else if(price>=300000) {
            result = (int)(price*0.9);
        } else if(price>=100000) {
            result = (int)(price*0.95);
        } else return price;

        return result;
    }
}