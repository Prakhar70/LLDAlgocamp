package Solid.Example5.ProblematicCode;

public class ChessPiece {
    Color color;
    Position pos;

    ChessPiece(Color color, Position pos) {
        this.color = color;
        this.pos = pos;
    }

    void move(Position destination) {
        if (isValidMove(destination)) {
            pos = destination;
        }
    }

    private boolean isValidMove(Position destination) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValidMove'");
    }

}
