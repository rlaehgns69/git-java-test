package section06;

public class Practice06_04 {
    public static void main(String[] args) {
        // 마방진
        // 다차원 배열 연습
        int nextRow = 0;
        int nextCol = 2;
        int[][] mabang = new int[5][5];
        int count = 1;

        mabang[nextRow][nextCol] = count++;

        while (count <= 25) {
            nextRow--;
            nextCol++;

            // row를 벗어난 경우
            if (nextRow < 0 && nextCol < 5) {
                nextRow = 4;
            }

            // col을 벗어난 경우
            if (nextRow >= 0 && nextCol == 5) {
                nextCol = 0;
            }

            // 둘다 벗어난 경우
            if (nextCol > 4 && nextRow < 0) {
                nextCol--;
                nextRow += 2;
            }

            // 값이 이미 존재하는 경우
            if (mabang[nextRow][nextCol] != 0) {
                nextCol--;
                nextRow += 2;
            }

            mabang[nextRow][nextCol] = count++;
        }

        for (int i = 0; i < mabang.length; i++) {
            for (int j = 0; j < mabang[i].length; j++) {
                System.out.print(mabang[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
