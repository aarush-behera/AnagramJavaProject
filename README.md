Project Directions:

For this assignment you will write code for a class named AnagramList which is used to find possible anagrams of a word. Anagrams are formed by rearranging the letters of a word: for example brainy is an anagram of binary. For the purpose of this assignment anagrams do not have to be words themselves: for example raibyn would also be an anagram of binary.

The AnagramList class has a single member variable which is an ArrayList of strings called anagrams and an accessor method to get this variable. The constructor takes a single parameter word, and should use this to create an ordered list containing every possible rearrangement of the characters from word exactly once. See the sample runs for some examples of this.

To assist with this, the constructor should call two private void helper methods which you will implement. You will also write one public method for the class.

Sample Run 1

Enter a word:
java

Anagrams list:
[aajv, aavj, ajav, ajva, avaj, avja, jaav, java, jvaa, vaaj, vaja, vjaa]

There are 12 possible anagrams of "java"

Enter a String to search for in these anagrams, or "QUIT" to end:
avja
Index of avja is 5

Enter a String to search for in these anagrams, or "QUIT" to end:
jvva
Index of jvva is -1

Enter a String to search for in these anagrams, or "QUIT" to end:
QUIT

Sample Run 2

Enter a word:
googol

Anagrams list:
[gglooo, ggoloo, ggoolo, ggoool, glgooo, glogoo, gloogo, glooog, gogloo, gogolo, gogool, golgoo, gologo, goloog, googlo, googol, goolgo, goolog, gooogl, gooolg, lggooo, lgogoo, lgoogo, lgooog, loggoo, logogo, logoog, looggo, loogog, looogg, oggloo, oggolo, oggool, oglgoo, oglogo, ogloog, ogoglo, ogogol, ogolgo, ogolog, ogoogl, ogoolg, olggoo, olgogo, olgoog, ologgo, ologog, oloogg, oogglo, ooggol, ooglgo, ooglog, oogogl, oogolg, oolggo, oolgog, oologg, oooggl, oooglg, ooolgg]

There are 60 possible anagrams of "googol"

Enter a String to search for in these anagrams, or "QUIT" to end:
ooolgg
Index of ooolgg is 59

Enter a String to search for in these anagrams, or "QUIT" to end:
goggle
Index of goggle is -1

Enter a String to search for in these anagrams, or "QUIT" to end:
QUIT
