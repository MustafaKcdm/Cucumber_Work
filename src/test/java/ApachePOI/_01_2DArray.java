package ApachePOI;

public class _01_2DArray {
    public static void main(String[] args) {
        String[][] zoo = {
                {"aslan", "1"},
                {"kaplan", "2"},
                {"maymun", "3", "4"},
                {"zebra", "5"}
        };

        System.out.println(zoo[2][0]);
        System.out.println(zoo[2][1]);
        System.out.println("---------------");

        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < zoo[i].length; j++) {
                System.out.print(zoo[i][j] + "\t");
            }
            System.out.println();
        }

        }
    }

