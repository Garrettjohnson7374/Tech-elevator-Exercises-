package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public String getTypeOfFruit(){
            return typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
            return piecesOfFruitLeft;
    }
    public FruitTree (String typeOfFruit,int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }
    public boolean pickFruit(int numberOfPiecesToRemove)
    {
        while (numberOfPiecesToRemove > 0 && piecesOfFruitLeft > 0)
        {
            piecesOfFruitLeft -= 1;
            numberOfPiecesToRemove -= 1;}

        if (numberOfPiecesToRemove == 0)
        {
            return true;}
        else
        {
            return false;}
    }
}
