public class Coin{
  //Attributes (instance variables)
  private final int HEADS = 0;
  private final int TAILS = 1;

  private int face;

  //Coin constructor that defines what happens when a Coin object is made
  //When a new one is made it gets flipped
  public Coin(){
    flip();
  }

  //START OF METHODS(FUNCTIONS)
  //Flipping the coin
  public void flip(){
    face = (int) (Math.random() * 2);
  }

  //returns true if heads
  public boolean isHeads(){
    return (face == HEADS);
  }

  //returns the current face of the coin as a string
  public String toString(){
    String faceName = "";
    if(face == HEADS)
      faceName = "Heads";
    else
      faceName = "Tails";
    return faceName;
  }
}
