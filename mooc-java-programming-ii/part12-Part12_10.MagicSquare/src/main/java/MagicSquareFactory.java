
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int total = square.getHeight() * square.getWidth();
        int row = 0, column = square.getWidth() / 2;
        for(int i = 1; i <= total; i++){
            if(square.readValue(column, row) != 0){
                row++;
                column--;
                if(row >= square.getWidth()){
                    row = 0;
                }
                if(column < 0){
                    column = square.getHeight() - 1;
                }
                row++;
                if(row >= square.getWidth()){
                    row = 0;
                }
            }
            square.placeValue(column, row, i);
            row--;
            column++;
            if(row < 0){
                row = square.getHeight() - 1;
            }
            if(column >= square.getWidth()){
                column = 0;
            }
        }
//        System.out.println(square.sumsOfRows());
//        System.out.println(square.sumsOfColumns());
//        System.out.println(square.sumsOfDiagonals());
        return square;
    }

}
