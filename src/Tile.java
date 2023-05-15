/**
 * This class models a Tile object that stores pieces.
 * This class is based entirely on this YouTube video:
 * <a href = "https://www.youtube.com/watch?v=h8fSdSUKttk">Java Chess Programming Video #1 </a>
 */
public abstract class Tile {
  int coordinate;

  /**
   * Constructor for a Tile object which initializes its coordinate
   * @param coordinate - number between 1 and 64 representing its coordinate on the board
   */
  Tile(int coordinate) {this.coordinate = coordinate;}

  public abstract boolean isEmpty();
  public abstract Piece getPiece();

  /**
   * Tile object that is does not contain a Piece object
   */
  public static final class EmptyTile extends Tile {

    /**
     * Constructor for EmptyTile which just calls the constructor for a regular Tile
     * @param coordinate -
     */
    EmptyTile(int coordinate) {super(coordinate);}

    /**
     * Implementation of abstract method from Tile
     * @return always true for EmptyTile object
     */
    @Override
    public boolean isEmpty() {return true;}

    /**
     * Method for accessing the piece in this Tile
     * @return always null for EmptyTile objects
     */
    @Override
    public Piece getPiece() {return null;}
  }

  public static final class NonemptyTile extends Tile {
    Piece pieceOnTile;

    /**
     * Constructor for a NonemptyTile object which contains both a Piece and coordinate
     * @param coordinate - number between 1 and 64 representing its coordinate on the board
     * @param pieceOnTile - the Piece object to be stored in this Tile
     */
    NonemptyTile(int coordinate, Piece pieceOnTile) {
      super(coordinate);
      this.pieceOnTile= pieceOnTile;
    }

    /**
     * Method for accessing the piece in this Tile
     * @return the piece in this Tile
     */
    @Override
    public Piece getPiece() {return pieceOnTile;}

    /**
     * Implementation of abstract method from Tile
     * @return always false for NonemptyTile objects
     */
    @Override
    public boolean isEmpty() {return false;}

  }
}
