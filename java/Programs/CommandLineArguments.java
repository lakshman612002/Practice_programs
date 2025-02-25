public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args.length);
        // args[0] = "123";
        // args[1] = "1000";
        // args[3] = null;
        // args[2] = "";
        args = new String[3];
        args[1] = "lakshman";
        args[2] = "12345667788990-imm uckf yct jg;[p]p1t8qya h";

        System.out.println(args.length);
        for (String ele : args) {
            System.out.println(ele);
        }
    }
}
