package com.princetonreview;

import org.openqa.selenium.By;
import util.RDriver;
import util.Wait;

public class GMAT_Prep_Free_Page extends RDriver{

    public static void clickNavOption(String option){

        if (option.equalsIgnoreCase("Practice Tests")){
            Wait.waitUntilElementIsDisplay("linktext",option);
            driver.findElement(By.linkText("Practice Tests")).click();

        }
        else if(option.equalsIgnoreCase("Coursework")){
            driver.findElement(By.linkText("Coursework")).click();
        }
    }

    public static void clickOnGMATSeven(){
        driver.findElement(By.cssSelector("#content-object-5713 > li > a")).click();
    }
    public static void selectALessonInPiecesOfThePuzzle(String lessonChoice){

        if (lessonChoice.equalsIgnoreCase("Pieces of the Puzzle Quick Review")){
            driver.findElement(By.linkText("Pieces of the Puzzle Quick Review")).click();
        }
        else if (lessonChoice.equalsIgnoreCase("Pieces of the Puzzle Adaptive Lesson")){
            Wait.waitUntilElementIsDisplay("linktext",lessonChoice);
            driver.findElement(By.linkText("Pieces of the Puzzle Adaptive Lesson")).click();
        }
        else if(lessonChoice.equalsIgnoreCase("Pieces of the Puzzle and Formulas Adaptive Lesson")){

            driver.findElement(By.linkText("Pieces of the Puzzle and Formulas Adaptive Lesson")).click();
        }
        else if(lessonChoice.equalsIgnoreCase("Pieces of the Puzzle: Adaptive Drill")){
            driver.findElement(By.linkText("Pieces of the Puzzle: Adaptive Drill")).click();
        }
    }
}
