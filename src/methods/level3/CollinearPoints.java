package methods.level3;

class CollinearPoints {

    static boolean isCollinear(int x1,int y1,int x2,int y2,int x3,int y3) {
        return x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isCollinear(1,2,2,4,3,6));
    }
}
