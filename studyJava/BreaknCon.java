public class BreaknCon {
    public static void main(String[] args) {
        // break; to jump out of case in swtich and jump out of loop
        for (int i=0; i<5; i++) {
            System.out.println(i);
            if (i==2) break;
        }

        // continue; continue to the next iteration in the loop immediately
        for (int i=1; i<6; i=i+1) {
            System.out.println(i);
            if (i==3) continue;
            System.out.println("Yeha");
        }
    }
}