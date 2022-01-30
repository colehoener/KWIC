# KWIC
KWIC (*Keyword In Context*) Index System for SE-311 at Drexel University

## Author
Cole Hoener
colehoener@gmail.com or cth59@drexel.edu

## UML CLass Diagram
<div align="center">
    <img src="UMLClassDiagram.png" alt="Class Diagram" width="900" height="auto">
 </div>

## Instructions

1. Open the project in IntelliJ IDE and run KWICSystem as '*Main*'
2. Enter in the text file (full file name) you wish to use as input
3. Results are printed to the file '**output.txt**'

## Important Files
1. **stopWords.txt** : A file that contains all the stop words. This file is always read. Update the list to add or remove stop words. To have no stop words, leave the file empty.
2. **input.txt** : This is a sample file that can be used to test the system
3. **output.txt** : This file is cleared and the results of the last system process are written to this file.

### Known Bugs
Currently, there are no known bugs for the system.

### Notes
1. The output formatting is slightly different than the example given in the assignment details document. I change the output due to changing word/sentence sizing and for easier reader.
2. The output that is alphabatized is alphbatized based on the first word of the '*value*'