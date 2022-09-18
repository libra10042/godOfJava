package ch15.compare;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String addresses[] = new String[]{
                "서울시",
                "경기도",
                "강원도",
        };
        sample.checkAddress(addresses);
    }
    public void checkAddress(String[] addresses){
        int startCount =0, endCount =0;
        String startText="서울시";
        String endText="도";
        for(String address : addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount) ;
    }

}
