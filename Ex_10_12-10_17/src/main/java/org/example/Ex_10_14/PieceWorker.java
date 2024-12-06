package org.example.Ex_10_14;

public class PieceWorker extends Employee
{
    private double wage;
    private double pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings()
    {
        return wage * pieces;
    }

    @Override
    public String toString()
    {
        return String.format("%s\nWage: %.2f\tPieces:%.2f", super.toString(), wage,pieces);
    }
}
