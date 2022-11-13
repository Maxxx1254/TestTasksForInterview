public class Task2 {
    public static void main(java.lang.String[] args) {
        float cX = Float.parseFloat(args[0]);
        float cY = Float.parseFloat(args[1]);
        float r = Float.parseFloat(args[2]);
        float pX = Float.parseFloat(args[3]);
        float pY = Float.parseFloat(args[4]);
        float sqrPoint = (float) ((Math.pow(pX, 2) - Math.pow(cX, 2)) + (Math.pow(pY, 2) - Math.pow(cY, 2)));
        float sqrRadius = (float) (Math.pow(r, 2));
        if (sqrRadius == sqrPoint) {
            System.out.println("0");
        } else if (sqrRadius > sqrPoint) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
