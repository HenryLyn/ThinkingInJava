package top.linhuarui.thinking_in_java.chapter3.section3_2.s3_2_7;

/**
* @author LHR
* @date 2018/8/15
* @desc Does Math.random() produce 0.0 and 1.0?
* @version 1.0
* @modify
*   @date
*/
public class RandomBounds {
    private static void usage() {
        System.err.println("Usage: \n\t"
                + "RandomBounds lower\n\t"
                + "RandomBounds upper");
        System.exit(1);
    }
    public static void main (String[] args) {
        if (args.length != 1) usage();
        switch (args[0]) {
            case "lower":
                while (Math.random() != 0.0) {
                    // keep trying.
                    System.out.println("Produced 0.0!");
                }
                break;
            case "upper":
                while (Math.random() != 1.0) {
                    //keep trying
                    System.out.println("Produced 1.0");
                }
                break;
            default:
                usage();
                break;
        }
    }
}
