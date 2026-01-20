public class bai2 {
    public static void main(String[] args) {
        String strin = "helo";
        StringBuilder stringbuider = new StringBuilder("helo");
        StringBuffer stringbuffer = new StringBuffer("helo");
        int n = 10000;
        long start = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            strin=strin+"work";
        }
        long end = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            stringbuffer.append("work");
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            stringbuider.append("work");
        }
        long end2 = System.currentTimeMillis();

        System.out.printf("String = %d ms\n", end - start);
        System.out.printf("StringBuffer = %d ms\n", end1 - start1);
        System.out.printf("StringBuilder = %d ms\n", end2 - start2);
        //string luôn luôn lâu hn stringbuffer và stringbuilder

    }
}
