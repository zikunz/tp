# Zhu Zikun - Project Portfolio Page

## Overview

easyLog helps home-based business owners better manage their item inventory and orders through a carefully designed
Command Line Interface (CLI). The features of easyLog fit together to form a cohesive whole, solve the needs and wants
of a clearly specified and narrowed down target user (i.e., home-based business owners) and are optimized for fast
typists.

## Summary of Contributions

### **Code contributed**:

My overall code contribution can be
found [here](https://nus-cs2113-ay2021s2.github.io/tp-dashboard/?search=zikunz&sort=groupTitle&sortWithin=title&since=2021-03-05&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=false&tabOpen=true&tabType=authorship&tabAuthor=zikunz&tabRepo=AY2021S2-CS2113T-T09-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code)
.

In terms of implementation, my code is of high quality. For error handling, I wrote exhaustive exceptions to deal with
all possible "unusual" but not entirely unexpected situations for `items add`, `items update`, `items clear`,
`items stats` and `orders clear` features. Each error message is made specific to notify the user on what is wrong
before retrying. I also included a fair amount of logging and assertions code for the same features mentioned earlier. I
have followed the code quality guidelines [here](https://nus-cs2113-ay2021s2.github.io/website/book/codeQuality/)
and there are no (basic) coding standard violations
shown [here](https://se-education.org/guides/conventions/java/basic.html). Also, I applied Single Level of Abstraction
Principle (SLAP) and avoid noticeable code duplications, including my test code for the features mentioned earlier. The
functional code contributed by me is at least as much as a typical CS2113T individual project. I have implemented large
parts of the final working version of `items add`, `items stats` and
`items update` (in descending order). I have also implemented the full final version of `items clear` and `orders clear`
.

In the aspect of quality assurance, I have employed different types of testing and decided a reasonable amount of each
type of testing required. I have automated extensive tests for `items add`, `items update`, `items clear`, `items stats`
and `orders clear` features.

### **Major Enhancements Implemented**:

Most major enhancements made are for `items add` and `orders clear`
+ **items add**
    + I checked whether the item description consists of purely empty spaces. If so, a relevant error message will be 
      shown to notify that item descriptions cannot be empty.
    + If an item already exists in the item inventory, I implemented the feature to allow it to be added to the same item
      index in the item inventory. However, this feature is not used in easyLog v2.1.  
    + I designed `items add` command to keep asking the users for a valid pair of item unit price 
      and item stock. If an invalid input is given, a specific error message will be shown to the users before they 
      retry. This is to be consistent with `orders add` feature which keeps asking for a pair of valid of item index 
      and item stock. 
    + I used BigDecimal rather than float or double as float or double are less suitable for 
      monetary calculations due to loss of significance.
    + I rounded all item prices and store them in exactly 2 decimal places (e.g., 10.555 -> 10.56 and 10.554 -> 10.55).

 
+ **orders clear**
    + Feature: This feature allows the users to clear all orders by their customers.
    + Features: I implemented the whole logic for `items clear` fully.
    + Enhancements: After clearing all orders, items belonging to these orders are added back to the item inventory.
    
## **Contributions to team-based tasks**:
Check other teammates' code in terms of code quality refcator their code

## **Review/mentoring contributions**:

## **Contributions beyond the project team**:
    + Project management:


    + Community:
        + Reported Developer Guide bugs for another team (Pull Request: [#36](https://github.com/nus-cs2113-AY2021S1/tp/pulls?q=is%3Aopen+is%3Apr+CS2113-T13-3+) )
        + Reported bugs by testing another group's jar file and propose changes to their User Guide
        + Perform manual testing, reported bugs and gave suggestions to teammates.
        +

## Contributions to documentation

#### Contributions to the User Guide

+ Cosmetics


+ Introduction


+ `items add`


+ `items update`


+ `items clear`


+ `items stats`


+ `orders clear`


+ FAQ

## Contributions to the Developer Guide

```
      Given below are sections I contributed to the Developer Guide.
      They showcase my ability to write technical documentation and the technical depth of my contributions
      to the project.
```

+ [Architecture](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#architecture)

+ [Start recordings workout data](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#creating-a-new-workout-session)

+ [List all past workout sessions](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#442-listing-past-workout-sessions)

+ [Edit a past workout session](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#443-editing-workout-session)

+ [Delete a past workout session](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#444-deleting-a-workout-session)

+ [Search on past workout sessions](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#445-searching-based-on-conditions)

+ [Appendix F: Supported Formats of Date Input](https://ay2021s1-cs2113t-f11-1.github.io/tp/DeveloperGuide.html#appendix-f-supported-formats-of-date-input)