public class LimitingRectangle {

    private int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    //работает ок для задачи
    public int getWidth() {
        int width;
        int min = points[0][0];
        int max = points[0][0];
        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i][0]);
        }
        for (int i = 0; i < points.length; i++) {
            min = Math.min(min, points[i][0]);
        }
        width = max - min;
        return width;
    }

    //работает ок для задачи
    public int getHeight() {
        int height;
        int min = points[0][1];
        int max = points[0][1];
        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i][1]);
        }
        for (int i = 0; i < points.length; i++) {
            min = Math.min(min, points[i][1]);
        }
        height = max - min;
        return height;
    }

    //вспомогательный
    public String getMaxMinY() {
        int y1, y2;
        int min = points[0][1];
        int max = points[0][1];
        String strMaxMinY;
        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i][1]);
        }
        for (int i = 0; i < points.length; i++) {
            min = Math.min(min, points[i][1]);
        }
        y1 = min;
        y2 = max;
        //System.out.print(y1 + ", " + y2 + " ");
        strMaxMinY = y1 + ", " + y2 + ", ";
        return strMaxMinY;
    }

    //вспомогательный
    public String getMaxMinX() {
        int x1, x2;
        int min = points[0][0];
        int max = points[0][0];
        String strMaxMinX;
        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i][0]);
        }
        for (int i = 0; i < points.length; i++) {
            min = Math.min(min, points[i][0]);
        }
        x1 = min;
        x2 = max;
        //System.out.println(x1 + ", " + x2);
        strMaxMinX = x1 + ", " + x2;
        return strMaxMinX;
    }


    public String getBorders() {
        return getMaxMinY() + getMaxMinX();
    }

    public static void main(String[] args) {
        LimitingRectangle rectangle = new LimitingRectangle(new int[][]{{-16, -5}, {-9, 7}, {0, 3}, {5, 1}, {10, 0}});
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());
        System.out.println(rectangle.getBorders());
    }

}
