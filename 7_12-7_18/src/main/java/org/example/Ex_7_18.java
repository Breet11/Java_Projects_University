package org.example;

import java.util.Random;

public class Ex_7_18
{
    public static void main(String[] args)
    {
        //a little test
        int games = 1_000_000;
        int[] wins = new int[21];
        int[] losses = new int[21];
        int totalRolls = 0;
        int totalWins = 0;
        int totalLosses = 0;

        for(int i = 0; i < games; i++)
        {
            int[] results = playGame();

            int rolls = results[0];
            boolean gameStatus = false;
            if(results[1] == 1)
            {
                gameStatus = true;
            }

            totalRolls += rolls;

            if(gameStatus)
            {
                if(rolls <= 20)
                {
                    wins[rolls]++;
                } else
                {
                    wins[20]++;
                }
                totalWins++;
            }else
            {
                if(rolls <= 20)
                {
                    losses[rolls]++;
                } else
                {
                    losses[20]++;
                }
                totalLosses++;
            }
        }

        System.out.println("Wins:");
        System.out.printf("Total wins: %d%n", totalWins);
        for (int i = 1; i <= 20; i++) {
            System.out.printf("On roll %d: %d%n", i, wins[i]);
        }
        System.out.printf("After 20th roll: %d%n", wins[20]);

        System.out.println("\nLosses:");
        System.out.printf("Total losses: %d%n", totalLosses);
        for (int i = 1; i <= 20; i++) {
            System.out.printf("On roll %d: %d%n", i, losses[i]);
        }
        System.out.printf("After 20th roll: %d%n", losses[20]);

        double winPercentage = (double) totalWins / games * 100;
        System.out.printf("\nChances to win in craps: %.2f%%%n", winPercentage);

        double averageLength = (double) totalRolls / games;
        System.out.printf("Average length: %.2f rolls%n", averageLength);

    }
    public static int[] playGame()
    {
        Random random = new Random();

        int point = 0;
        int rolls = 0;
        int roll = rollDice(random);

        rolls++;
        if(roll == 7 || roll == 11)
        {
            int[] tempArr = {rolls, 1};
            return tempArr;
        } else if(roll == 2 || roll == 3 || roll == 12)
        {
            int[] tempArr = {rolls, 0};
            return tempArr;
        } else
        {
            point = roll;
        }

        while(true)
        {
            roll = rollDice(random);
            rolls++;

            if(roll == point)
            {
                int[] tempArr = {rolls, 1};
                return tempArr;
            } else if(roll == 7)
            {
                int[] tempArr = {rolls, 0};
                return tempArr;
            }
        }
    }
    public static int rollDice(Random random)
    {
        int roll1 = 1 + random.nextInt(6);
        int roll2 = 1 + random.nextInt(6);

        return roll1 + roll2;
    }
}
