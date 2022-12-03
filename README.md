# 4InARowGame
## Table of contents
* [General info](#general-info)
* [Aim](#aim)
* [Technologies](#technologies)
* [Authors](#authors)

## General info

This 4 In a Row project is a pass-and-play, multiplayer game that requires 2 players to take turns filling in a grid. A winner is chosen when one player makes an uninterrupted, 4 button-long line in the grid. This line can be diagonal, vertical, or horizontal. 

## Aim
 Inspired by the popular game [Connect 4](https://en.wikipedia.org/wiki/Connect_Four), this project's aim is to utilize the tools we have learned and discussed in Professor Jason Porter's Mobile Application Development class and display them in a functioning minigame.

## Technologies
Project was created with 
 * [Android Studios 2021.2.1.16](https://developer.android.com/studio/intro/?gclid=Cj0KCQiAvqGcBhCJARIsAFQ5ke7CNIMVlN7X_eg5wEjcIqnr2tpEK002SY30YgViC9FXCC4mmx42X28aAghIEALw_wcB&gclsrc=aw.ds)
 * [GitHub](https://github.com/)

## Creative Process and Notes


Each button or token contains a loop with a Boolean value that checks that there is no other token, or the button is not already clicked, when selected. The game turn then increases by one, making the even or odd number significant because it helps the players keep track of game-player order (as well as the color coded aspect). For example, Player One may be even while Player Two is odd. 

It was important to consider that in a digital version of this game type, the buttons, or tokens, are to be positioned in a certain way and distance from each other, as this can affect the readability/usage of the game. This factor is why the developers took time to create an ending statement that double-checks the loops placement of each button/token. 

 The authors considered the possibility of condensing the code so that there will not be 40+ event listeners to write; however, this action caused an increased number of greater errors with the overall game experience. 

## Authors
  - **Adam Warren** 
  - **Sylvan Schuette** 
  - **Greta Stalemark** 



