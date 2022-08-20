package RunescapeNewGoal;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

import RunescapeNewGoal.Agility.*;
import RunescapeNewGoal.RunnerMethod.*;

public class Runner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_YELLOW_TEXT = "\u001B[33m";
        final String ANSI_RED_TEXT = "\u001B[31m";

        System.out.println(ANSI_BLACK_BACKGROUND+"Welcome to Charlie's Runescape Levelling Guide.");
        System.out.println("Please use lowercase when entering commands.");
        System.out.println("");
        System.out.println(ANSI_YELLOW_TEXT + "Please select the skill you would like to train: " + ANSI_RESET + ANSI_BLACK_BACKGROUND);

        RunnerMethod runnerMethod = new RunnerMethod();

        runnerMethod.runner();

    }
}


