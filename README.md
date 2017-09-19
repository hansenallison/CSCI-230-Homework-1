# CSCI-230-Homework-1
All in the main method the step-by-step procedure for this assignment is:
1. Prompt the user to enter a upper DNA strand
2. Read-in the string value entered by the user
3. Prompt the user to enter a lower DNA strand
4. Read-in the string value entered by the user
5. If the entered lower stand or upper strand is empty (i.e. contain no chemical bases)
GOTO step 13, else GOTO step 6.
6. If the entered lower and upper strands have the same number of chemical bases
GOTO step 7, else GOTO step 12
7. If the entered lower and upper strands only contain combinations of adenine (A),
guanine (G), cytosine (C), and thymine (T) chemical bases then GOTO step 8, else
GOTO step 11
8. If the upper and lower strands only define valid base-pairs (i.e. A paired with T, and
C paired with G) then GOTO step 9, else GOTO step 10
9. Display to the user:
• “The entered double-strand DNA pattern is correct ... Exiting program”.
10. Fix the base-pair errors (your choice to fix error in upper or lower strand) and
display to the user:
• “The entered double-strand DNA pattern had base-pair errors that have
been corrected: ”,
• The fixed upper strand in upper case with chemical base correction(s) in
lower case,
• The fixed lower strand in upper case with chemical base correction(s) in
lower case, and
• “... Exiting program”
11. Display to the user “The entered upper and lower stands must only contain combinations of A, G, C, or T ... Exiting program”.
12. Display to the user “The entered upper and lower strands do not have the same number of chemical bases ... Exiting program”.
13. Display to the user “The entered upper strand or lower strand is not defined ... Exiting program”.

