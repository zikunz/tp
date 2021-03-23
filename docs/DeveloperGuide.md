# Developer Guide

![Supported Java versions](https://img.shields.io/badge/Java-11-blue.svg)
![Supported OS](https://img.shields.io/badge/Supported%20OS-Windows|MacOS|Linux-yellow.svg)
![Java CI](https://github.com/AY2021S1-CS2113T-T09-4/tp/workflows/Java%20CI/badge.svg)

## Table of Contents

- [Introduction](#introduction)
    * [To be added](#to-be-added)
        + [To be added](#to-be-added)

## 1.Introduction

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
```

## Design & implementation

{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}


## Product scope
### Target user profile

{Describe the target user profile}

### Value proposition

{Describe the value proposition: what problem does it solve?}

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|user|add new items|track the items added to the warehouse|
|v1.0|user|view the items in the warehouse|track the items that are added or not added to the warehouse|
|v1.0|user|remove items|remove the items that are no longer required to be tracked|
|v1.0|user|add new orders|track the orders added to the warehouse|
|v1.0|user|view the orders in the warehouse|track the orders that are added or not added to the warehouse|
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

## Non-Functional Requirements

{Give non-functional requirements}

## Glossary

* *glossary item* - Definition

## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing} <br> <br>

[Return to Top](#introduction)