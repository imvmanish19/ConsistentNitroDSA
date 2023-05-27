package game;

public class Bomb {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        int[][] bombIndices = {{0,0}, {0,1}, {0,2}, {0,3}};
        for(int i=0;i<bombIndices.length;i++) {
            for(int j=0;j<square.length;j++) {
                square[bombIndices[i][0]][j] = 1;
            }
            for(int k=0;k<square[0].length;k++) {
                square[k][bombIndices[i][1]] = 1;
            }
        }
        int numberOfPlacesDestroyed = 0;
        for(int i=0;i<square.length;i++) {
            for(int j=0;j<square[0].length;j++) {
                if(square[i][j] == 1) {
                    numberOfPlacesDestroyed++;
                }
            }
        }
        System.out.println(numberOfPlacesDestroyed);
    }
}
