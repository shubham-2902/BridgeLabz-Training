package stringbufferandbuilderpluslinearsearchandbinarysearch.stringbuffer.concatecomparison;
public class SBvsSBuffer {
    public static void main(String[] args) {

        int n = 1_000_000;// _ for readability ignored by compiler
        long start, end;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
    }
}
