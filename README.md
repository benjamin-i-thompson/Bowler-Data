# Bowler-Data
Program that takes a .txt file as input, reads through the data, creates a Bowler object from the Bowler class, and outputs a clean interpretation of the data
-----------------------------------------------------
File input is configured on line 24 of BowlerDemo.java. Default is set to scores.txt, which is the text file containing the scores, however you may need to change the path location to make this work. The solution to try is to go into the scores.txt properties and copy the location and paste it into the File object on line 24.

The scores.txt is comma-space delimited so other files will not work unless they are in the same format.

Scores are organized by Bowler ID followed by score from first round, second round, and third round (ID, Score1, Score2, Score3, ...).
-----------------------------------------------------
User input is done using numbers. The prompt asks the user what they would like to see and are given three options,
1. Basic file info
2. File info plus individual averages
3. File info plus team info
4. Exit loop

