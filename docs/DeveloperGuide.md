# Developer Guide

![Supported Java versions](https://img.shields.io/badge/Java-11-blue.svg)
![Supported OS](https://img.shields.io/badge/Supported%20OS-Windows|MacOS|Linux-yellow.svg)
![Java CI](https://github.com/AY2021S1-CS2113T-T09-4/tp/workflows/Java%20CI/badge.svg)

## Table of Contents

- [Introduction](#introduction)
    * [To be added](#to-be-added)
        + [To be added](#to-be-added)

## 1. Introduction

### 1.1 Software Overview

easyLog is a Command Line Interface (CLI) application for warehouse employees to manage items and orders in the
warehouse. easyLog allows users to add new items and orders, view existing items and orders, remove specific items and
orders and clear all existing items and orders in the warehouse at ease. If the user types fast, easyLog can get
logistic management tasks done faster than traditional Graphical User Interface (GUI) applications.

easyLog, comprises a Parser component, Ui component, Storage component, Item component, Order component and Command
component. Each component consists of various classes that work in tandem, to ensure it meets the purpose of our
program.

The purpose of this developer guide is to allow any interested contributors, who wish to develop this application
further or just curious about the workings of this application. This would allow potential contributors to be able to
dive right in to improving the code, performance, features or even adding new features much more easily due to the
understanding of the structure of the codebase and implementation of existing features.

### 1.2 Prerequisites

- Java 11 (can be downloaded from [here](https://www.oracle.com/sg/java/technologies/javase-jdk11-downloads.html))
- IntelliJ Idea (can be downloaded from [here](https://www.jetbrains.com/idea/download/#section=mac))

### 1.3 Setting up

1. Fork the easyLog repository [here](https://github.com/AY2021S2-CS2113T-T09-4/tp) and git clone it to any location on
   your computer.

2. Open any IDE (IntelliJ Idea preferred as mentioned in the prerequisites) and click `Configure` -> `Project Defaults`
   -> `Project Structure` -> `New`

3. Next, go to `Import Project` and select the build.gradle file.

4. After opening the project, go to `src` -> `main` -> `java` -> `seedu.easylog` -> EasyLog and right click on the
   EasyLog class.

5. Upon successful run, the following opening message will be shown:

```
Hello! I'm easyLog!
What can I do for you? Enter help to view commands.
Looking for save data.
Save data not found.
```

## 2. Design

### 2.1 Architecture

![image](https://user-images.githubusercontent.com/57165946/112262176-2f3f3d00-8ca8-11eb-81a6-c6053c111188.png)

The Architecture Diagram shown above illustrates the high-level design of easyLog. We will now proceed to explain each
component and their respective functionalities below.

### 2.2 EasyLog Component

The EasyLog component initializes the app and looks for any available save file to load. It then proceeds to
continuously take in input from the user until the user types in a exit command.

### 2.3 Storage Component

![image](https://user-images.githubusercontent.com/57165946/112269495-66ffb200-8cb3-11eb-9f0b-4d33db48d492.png)

The storage component deals with
- loading, saving and creating save data.
- generation of receipts when order is done. (NOT YET IMPLEMENTED)

### 2.4 Ui Component

The ui component deals with interactions with the user by displaying the appropriate messages according to the users
input.

### 2.5 Parser Component

![image](https://user-images.githubusercontent.com/57165946/112273156-fdce6d80-8cb7-11eb-9693-f46855141e7d.png)

The parser components deals with the input of the user. It makes sense of the users input and executes commands
according to the input of the user

### 2.6 Command Component
Different Commands execute by the program.

### 2.7 Model Component

### 2.8 Exceptions Component
Possible exceptions existing in the program.

### 2.9 Common Component
Common components contains the constants and messages used in the program.
- Constants: Fixed values used in the program
- Messages: Output response from the program.

## Implementation



## Product scope
### Target user profile

- IT savvy online businessman
- has a need to manage numerous sales data
- the list gets constantly updated (add & delete items/orders)
- prefers typing over mouse/handwritten
- can type fast
- enjoys using CLI software

### Value proposition

A simple database application that helps target user to store and accesse a collection of data electronically from a computer
system.

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|user|add new items|track the items added to the warehouse|
|v1.0|user|view the items in the warehouse|track the items that are added or not added to the warehouse|
|v1.0|user|remove items|remove the items that are no longer required to be tracked|
|v1.0|user|add new orders|track the orders added to the system|
|v1.0|user|view the orders in the system|track the orders that are added or not added to the system|
|v1.0|user|remove orders|remove the orders that are no longer required to be tracked|
|v1.0|user|clear all items|re-track all the items if there are any problems|
|v1.0|user|clear all orders|re-track all the orders if there are any problems|
|v1.0|user|view all available commands|refer to them when I forget how to use the application|
|v1.0|user|view all items-related commands|refer to them when I forget how to use the items feature|
|v1.0|user|view all orders-related commands|refer to them when I forget how to use the orders feature|
|v2.0|user|create, save data and load existing data|work on another device with the saved data|
|v2.0|expert user|create, save data and load existing data|edit the data file directly|
|v2.0|user|delete multiple items|save time by not deleting items one by one|
|v2.0|user|delete multiple orders|save time by not deleting orders one by one|
|v2.0|user|find relevant items|save time by looking through relevant items|
|v2.0|user|find relevant orders|save time by looking through relevant orders|
|v2.0|user|add a new item with a specified unit price|calculate order price more easily|
|v2.0|user|update the unit price of an item|revise unit price or correct mistaken unit price entered earlier|
|v2.0|user|add a new item with its stock|keep track of total number of stock and calculate order price more easily|
|v2.0|user|update the stock of an item|Correct mistaken stock number entered earlier|
|v2.0|user|specify the quantity of a item to add to the order|calculate the total price of the order and update the item inventory correctly.|
|v2.0|user|check the total price of a specific order|feedback to customer when they ask for it and do not have to look through the order list.|
|v2.0|user|update the shipping status of an order|differentiate the orders by their shipping status.|

## Non-Functional Requirements

- Be able to work on any mainstream OS as long as it has Java 11 or above installed.
- Be able to respond to any command in less than 2 seconds.
- A user should be able to complete majority of tasks faster using CLI than GUI.

## Glossary

Abbreviation | Full title | Definition
-------- | ---------- | ----------
**CI**   | Continuous Integration | Combining parts of a software product to form a whole
**IntelliJ** | IntelliJ | An Integrated Development Environment written in Java
**CLI** | Command Line Interface | A program that accepts text inputs to execute operating system functions
**GUI** | Graphical User Interface | An interface that allows users to interact through graphical icons
**Mainstream OS** | Windows, Linux, Unix, OS-X | Operating systems


## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing} <br> <br>

[Return to Top](#introduction)