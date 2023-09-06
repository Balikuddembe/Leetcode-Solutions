class Centered15 {
    public static int isCentered15(int []array) {
        for(int i=0;i<=array.length;i++) {
            int sum = 0;
            for(int j=i;j<array.length;j++) {
                sum+=array[j];
                if(sum==15) {
                    int left = i;
                    int right = array.length-(j+1);
                    if(left==right) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}