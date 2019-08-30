# p4nd3m1c
 
 Several years ago C# superstar Eric Lippert argued in his "Wizards and Warriors" series that in certain problem domains, rules should be first-class objects containing code to resolve attempted actions.  (He doesn't mention the command pattern, but it is clearly applicable.)

This repo aims to implement this design through a simplified version of the board game Pandemic.

In the subset of the rules we care about:

1.  The board contains many cities, some of which are adjacent to each other.  Some cities have Research Stations; some do not.

2.  The player is, at all times, located at exactly one city.

3.  The player has a hand of cards.  Each card is associated with a specific city.

3.  The player can move around the board in four different ways:
 * The player can Drive to any adjacent city.
 * The player can Direct Flight to any city associated with a card in the player's hand.
 * The player can Shuttle Flight between cities that have Research Stations.
 * The player can Charter Flight to any city, if and only if the city the player is in is associated with a card in the player's hand.
 
 The goal of this repository is to create a program where the player can issue arbitrary commands, which are resolved according to rules objects.  
 
