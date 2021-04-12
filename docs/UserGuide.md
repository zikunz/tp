# easyLog User Guide

By: `Ong Wei Sheng`, `Zhu Zikun`, `Qiu Yi Wen`, `Li Kexuan`, `Jiang Qixiong`

Last Updated: `10 April 2021` <br>

<p align="center">
<img src="https://user-images.githubusercontent.com/75139323/114268337-233ad580-9a33-11eb-9834-952e9a86fbaa.png" width="500">
</p>

Are you a home-based business owner tired of using a pen and paper to keep track of your inventory? Do you have limited
budget to invest in a new system to manage your business? Fret not, easyLog, our cross-platform<sup>[1](#1-super-script)
</sup> logistics management application will get you covered! It is the application to boost your productivity when it
comes to managing your items and orders and best of all, it is free! Primarily, the current version of easyLog allows
you to add new items and orders, update existing items and orders, view existing items and orders, remove specific items
and orders and clear all existing items and orders in the inventory at ease. You can also generate a receipt for your
customer and find out your best-selling product(s)<sup>[3](#3-super-script)</sup>.

easyLog is highly optimized for home-based business owners like you via a carefully designed Command Line Interface
(CLI); this means that you will run the application by typing commands into a command terminal<sup>[2](#2-super-script)
</sup>. If you type fast, easyLog can get logistics management tasks done more efficiently than traditional Graphical
User Interface (GUI) applications; GUI applications allow users to interact with the applications through visuals such
as buttons, at the expense of lower precision and slower speed as compared to CLI.

If this sounds great to you, we encourage you to visit [1. Quick start](#1-quick-start) to start learning how to manage
your inventory using easyLog. This guide also gives you a step-by-step instructions to use various features easyLog has
to offer and we have prepared Frequently Asked Questions (FAQ) and a concise table of Command Summary for you. We invite
you to click a hyperlink to explore easyLog.

***

- [1. Quick start](#1-quick-start)
- [2. Features](#2-features)
  * [2.1. Viewing help: `help`](#21-viewing-help-help)
  * [2.2. Items](#22-items)
    - [2.2.1. Show items-related commands: `items`](#221-show-items-related-commands-items)
    - [2.2.2. Add an item: `items add`](#222-add-an-item-items-add)
    - [2.2.3. Show the item list : `items list`](#223-show-the-item-list-items-list)
    - [2.2.4. Delete an item: `delete`](#224-delete-an-item-items-delete)
    - [2.2.5. Empty the item list: `items clear`](#225-empty-the-item-list-items-clear)
    - [2.2.6. Update an item: `items update`](#226-update-an-item-items-update)
    - [2.2.7. Find items: `items find`](#227-find-items-items-find)
    - [2.2.8. Discover the most popular item(s): `items stats`](#228-discover-the-most-popular-items-items-stats)
  * [2.3. Orders](#23-orders)
    - [2.3.1. Show orders-related commands: `orders`](#231-show-orders-related-commands--orders)
    - [2.3.2. Add an order: `orders add`](#232-add-an-order-orders-add)
    - [2.3.3. Show the order list: `orders list`](#233-show-the-order-list-orders-list)
    - [2.3.4. Remove an order: `orders delete`](#234-remove-an-order-orders-delete)
    - [2.3.5. Empty the order list: `orders clear`](#235-empty-the-order-list-orders-clear)
    - [2.3.6. Find orders: `orders find`](#236-find-orders-orders-find)
    - [2.3.7. Get the total price of an order:: `orders price`](#237-get-the-total-price-of-an-order-orders-price)
    - [2.3.8. Update the status of an order: `orders done`](#238-update-the-status-of-an-order-orders-done)
  * [2.4. Storage](#24-storage)  
    - [2.4.1 Load, create and save data](#241-load-create-and-save-data)
    - [2.4.2 Generate receipts](#242-generate-receipts)
  * [2.5. Exit the program: `exit`](#25-exit-the-program-exit)
- [3. FAQ](#3-faq)
- [4. Command Summary](#4-command-summary)

***

## 1. Quick start
Setting up easyLog is made really easy. It does not even require an installation and a few simple 
steps listed below will be good to go.

1. Ensure your device has Java 11 installed.

> To check if you have Java 11 installed, simply type `java --version` in the command terminal of your operating system.
> <br>
> For Windows users, you can type `cmd` in the Windows search box before pressing Enter to open the Command Prompt. <br>
> For macOS users, you can press Command and Space to launch Spotlight and type `Terminal` before pressing Enter. <br>
> For Ubuntu users, you can press Ctrl + Alt + T to open a terminal window.

2. Download the latest easyLog.jar from [here](https://github.com/AY2021S2-CS2113T-T09-4/tp/releases/v2.1).
3. Put the downloaded jar file in an empty folder in which easyLog is allowed to create files
   (i.e., do not use a write-protected folder).
4. In the same command terminal, run the command `java -jar easyLog.jar`.
5. The app should load and the welcome page is as shown below:

![Initiation](https://user-images.githubusercontent.com/60378963/114325708-1669cf00-9b64-11eb-86b8-2a8ef6b22bee.jpg)

6. Type a command and press enter to continue using the app.
7. Refer to the [Features](#features) below for details of each command.

***

## 2. Features

Section 2 will explain the features available in easyLog.

###### Notes about the command format:

* Any word surrounded by `<>` is a parameter to be entered by the user (e.g., in `items add <item_name>`, `item_name` is
  a parameter and a valid command can be `items add mp3`).

* Any extraneous parameters for commands not taking in any single parameter (such as `help` and `exit`) will not be
  ignored. However, any leading and trailing whitespaces will be neglected. This means, for instance, `  help  ` will
  trigger [2.1 viewing help: `help`](#21-viewing-help-help) command whereas `help me` will not be understood by easyLog
  (i.e., easyLog will show it does not understand your command).

* In the user guide, you will come across 📄 which can refer to a tip or warning.

### 2.1 Viewing help: `help`

As a first-time user or whenever you forget some commands or just need to check a particular command format, the `help`
feature will show all available commands of easyLog for you. At the same time, you can see the brief description of
those commands.

Steps to check all available commands:

1. Input `help` command.
2. Press Enter.
3. All available commands will then be shown.

Note:

> 📄 Anything typed after `help` will be ignored and the `help` command will execute as per normal. e.g., `help asdas`

Expected Output:
![Help](https://user-images.githubusercontent.com/60378963/114325820-942dda80-9b64-11eb-9ce2-01403d0f0869.jpg)

### 2.2 Items

Section 2.2 will explain the features related to items.

#### 2.2.1. Show items-related commands: `items`

As a first-time user, or whenever you forget some of items-related commands or just need to check a particular command
format, the `items` feature will show all available commands related to items. At the same time, you can see the brief
description of those commands. Also typing any invalid items-related commands would also show you all the avaialble
orders-related commands.

Steps to check all items-related commands:

1. Input `items` command.
2. Press Enter.
3. All available commands related to items will then be shown.
   
Expected Output:
![items related](https://user-images.githubusercontent.com/60378963/114325962-2d5cf100-9b65-11eb-99c3-5c50a4604911.png)

#### 2.2.2. Add an item: `items add`

When you are sometimes overwhelmed by handling a large variety of items, the `items add` feature allows you to record 
the details of those items one by one into the easyLog application.

Steps to add an item in easyLog:

1. Input `items add <item_name>` command.
2. You will be prompted to key in the item (unit) price and the item stock.
3. Input in this format `<item_price> <item_stock>` for the price and stock to be added to the items details.
4. Press enter.
5. You can see the confirmation message when the item is recorded successfully.

Note:
> 📄 There should be exactly 1 empty space between <item_price> and <item_stock>.
> 📄 Valid item names cannot be empty or consist of purely white spaces. <br>
> 📄 Valid item names cannot exceed 30 characters, including spaces. The name of an item starts after the first empty space 
> after `add`. <br>
> 📄 If an item name is already found in the item list, adding new items with the same name will
> still be successfully but take note that they will be tracked differently. <br>
> 📄 A valid item price must be a number ranging from 0 (free item) to 1,000,000,000 (inclusive). <br>
> 📄 Item price recorded has exactly 2 decimal places and will be rounded if applicable (i.e., if the third decimal 
> place is 4 or less, all the digits after the third digit will be removed. If the third decimal is 5 or greater, 1 will
> be added to the second decimal place). 
> 📄 If an invalid item price is entered, easyLog will not check the validity of item stock and will only notify the user
> that item price entered is wrong.
> 📄 Item stock has to be a positive integer ranging from 1 to 1,000,000,000 (inclusive). <br>
> 📄 When in doubt, do follow the prompts shown on the command terminal. <br>
 
Expected Output:
![items add](https://user-images.githubusercontent.com/60378963/114326072-9b091d00-9b65-11eb-8899-f123cfd64352.png)

#### 2.2.3. Show the item list: `items list`

Whenever you would like to check all items and their prices and stocks in your inventory, the `items list` feature allows 
you to achieve it by quickly and accurately displaying the complete item list.

Steps to check the complete item list:

1. Input `items list` command.
2. Press enter.
3. Complete item list then will be shown, including the item index, name, price as well as stock.

Note:
> 📄 If there are no items in the system, a message will be shown to notify you to add at least one item first. <br>
> 📄 Anything typed after `items list` will be ignored, and the command will execute as per normal e.g.,
> <items list asdsdad>.

Expected Output:
![items list](https://user-images.githubusercontent.com/60378963/114326125-cf7cd900-9b65-11eb-98c4-1849703c4a0f.png)

#### 2.2.4. Delete an item: `items delete`

When you want to delete an item in the system, the `items delete` feature allows you to
achieve this easily.

Steps to delete an item in easyLog

1. (Optional) Input `items list` command to check the item index to be deleted.
2. Input `items delete <space> <item_index>` for the order to be removed from the item list.
3. Press enter.
4. You can see the confirmation message when the item is removed successfully.
   
Note:
> 📄 If there is no item in the system, a message will be shown to notify you to add orders first. <br>
> 📄 If you remember the item's index, you can skip step 1. <br>
> 📄 The item_index should only be in Arabic numerals. <br>
> 📄 The item_index should not be more than the total number of items in the item list.

Expected Output:
![items delete](https://user-images.githubusercontent.com/60378963/114326249-84af9100-9b66-11eb-8b46-448fbf0acf41.png)

#### 2.2.5. Empty the item list: `items clear`

If your naughty children have added too many items which do not exist in your inventory, instead of deleting them one by
one, you can easily clear all recorded items in the inventory and add back existing items.

Expected Output:
![items clear](https://user-images.githubusercontent.com/60378963/114326195-2c788f00-9b66-11eb-999e-0444b9797a4e.png)


#### 2.2.6. Update an item: `items update`

When you want to update either the price or stock of an item in the system, the `items update` feature allows you to 
achieve this easily.

Steps to update an item:

1. Input `items update` command.
2. If the item list is not empty, easyLog will show the complete item list to you and you will be prompted to key in the
   item index to indicate which item you would like to update; if the item list is empty, easyLog will show a message to
   remind you to add at least one item to the inventory first.
3. After inputting a valid item index, you will be prompted to key in either `p` or `s` to let the system know you would
   like to update the item price or stock respectively.
4. If `p` is entered in step 3, you need to enter the revised item price; if `s` is entered in step 3, you need to enter
   the revised item stock.
5. Press enter.
6. You can see a confirmation message when the item price/stock has been updated successfully.

Note:
> 📄 Item fields (i.e., `p` and `s`) must be lower-case. <br>
> 📄 Item price must be a number ranging from 0 (free item) to 1,000,000,000 (inclusive). <br>
> 📄 Item stock has to be a positive integer ranging from 0 to 1,000,000,000 (inclusive). <br>
> 📄 You are allowed to update an item with its current price or current stock. It is interpreted as you no longer want
> to update any fields of the item. <br>
> 📄 When in doubt, do follow the prompts shown on the command terminal. <br>

Expected Output:
![items update](https://user-images.githubusercontent.com/60378963/114326352-fee01580-9b66-11eb-8a37-7cd9c5f3ab94.png)

#### 2.2.7. Find items: `items find`

Whenever you would like to find relevant items and their prices and stocks in your inventory, 
the `items find` feature allows you to achieve it by quickly and accurately 
displaying the relevant item from the item list.

Steps to find an item:

1. Input `items find <space> <item_name>` to obtain items related to the item name.
2. Press enter.
3. All items related to the item name will be shown.

Note:
> 📄 The input is case-sensitive, please be mindful of the exact wording. <br>

Expected Output:
![items find](https://user-images.githubusercontent.com/60378963/114326420-46ff3800-9b67-11eb-9dc7-4bb37827ecec.png)

#### 2.2.8. Discover the most popular item(s): `items stats`

If you would like to gain some useful insights from the sales history since you start using easyLog, the `items stats` 
feature will let you know the most popular item(s) and you are reminded you stock up 
find the item(s) with the highest demand 
and try to stock up item accordingly.

Note:
> 📄 Item fields (i.e., `p` and `s`) must be lower-case. <br>

Expected Output:
![items stats](https://user-images.githubusercontent.com/60378963/114327246-d35f2a00-9b6a-11eb-922b-bd2155641b99.png)

### 2.3. Orders

Section 2.3 will explain the features related to orders.

#### 2.3.1. Show orders-related commands : `orders`

As a first-time user, or whenever you forget some of orders-related commands or just need to check a particular command
format, `orders` feature will show all available commands related to orders. At the same time, you can see the brief
description of those commands. Also typing any invalid orders-related commands would also show you all the available
orders-related commands.

Steps to check all orders-related commands:

1. Input `orders` command.
2. Press Enter.
3. All available commands related to orders will then be shown.

Expected Output:
![orders related](https://user-images.githubusercontent.com/60378963/114326479-95acd200-9b67-11eb-8621-40eebbea04a0.png)

#### 2.3.2. Add an order: `orders add`

When receiving an order from your customer, `orders add` feature allows you to input the details of the order from your
customer into the easyLog app and allows you to manage your orders. (Further features to manage orders will be explained
in future sections.)

Steps to add an order in easyLog:
1. Input `orders add <customer_name>` command
2. You will be prompted to key in the item number and quantity to be added to the order.
3. Input in this format`<item_number> <space> <item_quantity>` for items to be added to the order.
4. Repeat step 3 if there are more items to be added into the order.
5. Input `stop` to stop adding items to the order.
6. Order details will then be added into the system.

Note:
> 📄 Order has to contain at least 1 item to be added into the system. <br>
> 📄 The customer name cannot exceed 30 characters including spaces. <br>
> 📄 Item quantity to be inputted into the order cannot be less than 1 or more than the current stock in the inventory. 
> <br>
> 📄 Item quantity for each item inputted into the order would be removed from the inventory stock of that item 
   and tracked separately. The quantity would only be returned and added back to the inventory count for that item
   if the order is not done and deleted. <br>
> 📄 When adding the same item twice into the order, it will not combine the total stock of that item added but instead
   show as 2 separate additions of the same item. <br>
> 📄 While adding items into the order, if the app encounters any format error in the input, it may cause order details to
   be added wrongly. Do use [`orders delete`](#234-remove-an-order-orders-delete) feature to delete the order and
   re-input the order details in the correct format. <br>
> 📄 When in doubt, do follow the prompts shown on the command terminal. <br>
   

Format:

```
orders add <customer_name>
Input the items to be added to this order.
<item_index> <item_quantity>
```

Expected Output:
![orders add](https://user-images.githubusercontent.com/60378963/114326565-fd631d00-9b67-11eb-8277-9fc6dc864496.png)


#### 2.3.3. Show the order list: `orders list`

You can use this command to track all the orders recorded in the system.

Format: `orders list`

Note:
> 📄 Anything typed after `orders list` will be ignored and the command will execute as per normal e.g.,
> `order list asdasdadasd`.

Expected Output:
![orders list](https://user-images.githubusercontent.com/60378963/114326633-49ae5d00-9b68-11eb-954c-ed56c8980335.png)

#### 2.3.4. Remove an order: `orders delete`

When your customer would like to cancel his or her order, the `orders delete` feature allows you to achieve it.

Steps to remove an order from the order list:
1. (Optional) Input `orders list` command to check the customer's order index to be deleted.
2. Input `orders delete <space> <order_index>` for the order to be removed from the order list.
3. Press enter.
4. You can see the confirmation message when the order is removed successfully.

Note:
> 📄 If there is no order in the system, a message will be shown to notify you to add at least one order first. <br>
> 📄 If you remember the customer's order index, you can skip step 1. <br>
> 📄 Unless the item has been deleted from the item list, every item under the deleted order 
> will be added back to the inventory. <br>
> 📄 If an out-of-range order index is entered, easyLog will not check if the order index is an integer. For
> instance, if there are only 2 orders placed by customers, inputting `orders delete 2.6` will cause easyLog show
> that it is an out-of-range error. <br>

Expected Output:
![orders delete](https://user-images.githubusercontent.com/60378963/114326779-fb4d8e00-9b68-11eb-8b6b-3c979179c3f9.png)

#### 2.3.5. Empty the order list: `orders clear`

In the very unlikely event that all orders are cancelled, instead of deleting them one by one, you can use the
`orders clear` feature to do it efficiently.

Note:
> 📄 If there is no order in the system, a message will be shown to notify you that you should not use `orders clear`
> feature.<br>
> 📄 Items which belong to the orders cleared will be added back to the inventory. It is the same as executing
> `orders delete` feature for N times, where N represents number of existing orders.

Expected Output:
![orders clear](https://user-images.githubusercontent.com/60378963/114326813-20da9780-9b69-11eb-9f54-c24eae7940b2.png)

#### 2.3.6. Find orders: `orders find`

You can use this command to search for any order in the system quickly without looking through the order list one bye one.

Steps to find an order:

1. Input `orders find <space> <order_name>` to obtain orders related to the order name.
2. Press enter.
3. All orders related to the order name will be shown.
   
Format: `orders find <order_name>`

Example: `orders find Coco`

Note:
> 📄 The input is case-sensitive, please be mindful of the exact wording. <br>

Expected Output:
![orders find](https://user-images.githubusercontent.com/60378963/114326910-7dd64d80-9b69-11eb-9dda-d9c0e6fb1032.png)

#### 2.3.7. Get the total price of an order: `orders price`

You can use this command to check the total price of a specific order.

Steps to obtain the price of an order:

1. Input `orders price <space> <order_index>` to obtain the price for a specific order.
2. Press enter.
3. Total price of an order will be shown.

Format: `orders price <order_index>`

Example: `orders price 2`

Note:
> 📄 If the order index keyed in is not an integer or an integer that does not exist in the order list,
> an error message will be shown to the user.

Expected Output:
![orders price](https://user-images.githubusercontent.com/60378963/114327050-0c4acf00-9b6a-11eb-931a-8589483154e7.png)

#### 2.3.8. Update the status of an order: `orders done`

You can use this command to change the status of an order once it is completed.

Steps to change the status of an order:

1. (Optional) Input `orders list` command to check the order index.
2. Input `orders done <space> <order_index>` to change the status of a specific order.
3. Press enter.
4. You can see the confirmation message when the order status is changed correctly.

Format: `orders done <order_index>`

Example: `orders done 2`

Note:
> 📄 If the order index keyed in is not an integer or an integer that is not exist in the order list,
> an error message will be shown to the user.<br>
> 📄 Once an order is completed, it will be deleted automatically from the system 
> and a receipt will be generated.<br>
> 📄 More details on receipt generation can be seen [here](#242-generate-receipts).

Expected Output:
![Orders done](https://user-images.githubusercontent.com/60378963/114327144-6d72a280-9b6a-11eb-9b98-ee3637b01910.png)

### 2.4. Storage

Section 2.4 will explain storage related features.

#### 2.4.1. Load, create and save data

While initializing easyLog, it automatically looks for an available save file to load so that you can continue your
progress from the previous exit. If there are no save file available to load, easyLog will automatically create a save
file for you and save your data and information when exiting the app. The save file will be named as `easyLog.txt` and 
will be located in the same folder/directory as the easyLog app.

The save file can be copied to another device and placed in the same folder/directory that contains the easyLog app. Do 
take note that only one `easyLog.txt` should be in the directory or there would be an error. This transfer of save file 
allows you to work on multiple devices if you choose to do so.

It is not recommended that you manipulate/edit the data in `easyLog.txt`. However, if you are an expert user and confident,
do feel free to manipulate the data in `easyLog.txt` manually if it enhances your workflow.

Note:
> 📄 Item details save format are as followed below. <br>
> `items <item_price> <item_stock> <item_sales> <item_name>` <br>
> 📄 Order details save format are as followed below. <br>
> `orders <customer_name> <item_index> itemQuantity <item_quantity>` <br>
> 📄 Receipt counter save format are as followed below. <br>
> `ReceiptCounter <receipt_count>`

#### 2.4.2. Generate receipts

When [`orders done`](#238-update-the-status-of-an-order-orders-done) feature is executed, a receipt will be 
automatically generated that contains the order details that was deleted. The generated receipts can be found in the 
same directory as the location of the easyLog app inside a `Receipts` folder. The receipts generated will be in a `.txt` 
format. This allows the list of orders while using the app to be kept clean with only the orders that are not done for
easier viewing. Also, the generated receipts allows you to keep track of your revenue or to handle your taxes.
Furthermore, receipts are numbered to show you how many orders you have fulfilled.

Note:

> 📄 The receipts generated can only be seen when you [exit](#25-exit-the-program-exit) the app.

![Receipt](https://user-images.githubusercontent.com/60378963/113499419-7b13a100-9548-11eb-80eb-35e9cb2aeb5f.jpg)

### 2.5. Exit the program: `exit`

Exit the app.

Note:

> 📄 Anything type after `exit` will be ignored, and the command will execute as per normal e.g., 
> `exit adasadadas`.

Format: `exit`

Expected Output:
![exit](https://user-images.githubusercontent.com/60378963/114327349-3b157500-9b6b-11eb-99ae-07b62bf80de0.png)


## 3. FAQ

**Q1**: I do not seem to be able to add an item. Why is this so?

> There could be many possibilities which can result in you not being able to add an item. We advise you to follow
> the below steps when intending to add an item. <br/>
>
> Please note that you need to specify the description of the item. For instance, you can do this
> by typing `orders add n/Competitive Programming 4: The Lower Bound of Programming Contests in the 2020s`. <br/>
>
> After that, input the **price per item** *(unit price)*. Please note that the unit price is either zero (free item) or
> a positive number smaller or equal to 1000000000 (the system currently accepts a unit price not more than
> SG$1,000,000,000). For example, you can enter `p/100` for the item price field. <br/>
>
> Lastly, please provide number of items to be added, also known as stock. (TO BE REVISED)

**Q2**: I do not seem to be able to add an order. Why is this so?

> There could be many possibilities which can result in you not being able to add an order. We advise you to follow
> the below steps when intending to add an order. <br/>
>
> Please note that you need to specify a customer's name as he or she is the one whom the order of interest will be
> sent to. For instance, you can do this by typing `orders add n/Alice`. <br/>
>
> After that, input the item number found in the item list (if unsure, simply type `items list` to check). Please
> separate each item number by exactly one empty space (i.e., ` `). Do not attempt to enter an item number
> which does not exist in the item list or belongs to another order. For example, you could type `1 2`, provided
> the first and second items exist in the item list and are not added to other orders.

**Q3**: I am scared that I input any command which I do not intend to execute. Is there a way to revert changes in the
system?

> If you input any invalid command (e.g., an unrecognized command or a clearing command for the item list when the list
> is already empty), it will not be executed. <br/>
>
> In the event that you accidentally add an item or order, you can always undo it by deleting it. Likewise, you can
> add an item or order back if you delete it mistakenly. For now, easyLog does not have a command to revert any
> changes. We may consider adding it in the upcoming version. <br/>
>
> You should not worry too much as easyLog is highly optimized for fast typists working in a warehouse like you.

**Q4**: Why does easyLog only allow me to enter additional stock number when I add an item which already exists in the 
system? Why cannot I update the unit price?

> It is typically hard for users to remember all items in the system. Hence, we make it easier and more efficient when
> easyLog detects the item to be added already exists in the item list. Since this only happens when the user stocks up
> a particular item, we allow the user to increase the stock as long as the total number of item stock is within the
> threshold (i.e., 1000000). However, it does not naturally happen when a user wants to update the unit price when he or
> she adds an item which already exists in the system.
>
> When it happens, the user is welcomed to use `items update` command instead.

***

## 4. Command Summary

Command | Format | Example |
------- | ------- | ------- | 
[**help**](#21-viewing-help-help) | `help` | `help` |
[**items**](#221-show-items-related-commands-items) | `items` | `items` |
[**items add**](#222-add-an-item-items-add) | `items add <item_name>`<br>`Please input item price and stock.`<br>`<item_price> <item_quantity>` | `items add PS5`<br>`Please input item price and stock.`<br>`1 2`|
[**items list**](#223-show-the-item-list-items-list) | `items list`      | `items list` |
[**items delete**](#224-delete-an-item-items-delete) | `items delete <item_index>` | `items delete 2` |
[**items clear**](#225-empty-the-item-list-items-clear) | `items clear ` | `items clear` |
[**items find**](#226-update-an-item-items-update) | `items find` | `items find <item_name>`|
[**items update**](#227-find-items-items-find) | `items update` | `items update`|
[**items stats**](#228-discover-the-most-popular-items-items-stats) | `items stats` | `items stats`|
[**orders**](#231-show-orders-related-commands--orders) | `orders` | `orders` |
[**orders add**](#232-add-an-order-orders-add) | `orders add <customer_name> `<br>` Input the items to be added to this order. `<br>` <item_index> <item_quantity>` | `orders add weisheng`<br>` Input the items to be added to this order.`<br />` 1 2 ` |
[**orders list**](#233-show-the-order-list-orders-list) | `orders list` | `orders list` |
[**orders delete**](#234-remove-an-order-orders-delete) | `orders delete <order_index>` | `orders delete 2` |
[**orders clear**](#235-empty-the-order-list-orders-clear) | `orders clear` | `orders clear` |
[**orders find**](#236-find-orders-orders-find) | `orders find` | `orders find <order_name>`|
[**orders price**](#237-get-the-total-price-of-an-order-orders-price) | `orders price <order_index>` | `orders price 2` |
[**orders done**](#238-update-the-status-of-an-order-orders-done)  | `orders done <order_index>` | `orders done 2` |
[**exit**](#25-exit-the-program-exit) | `exit` | `exit` |

[1.](#1-super-script) Currently supports Windows, macOS and Linux machines which have Java 11 installed. <br>
[2.](#2-super-script) Depending on which operating system you are using, how to open the command terminal application to
operate easyLog differs. Please refer to [1. Quick start](#1-quick-start) for more information. <br>
[3. ](#3-super-script) Best selling item(s) are defined to be item(s) which have most number of sales. That is, the
item(s) is / are added to orders most number of times. (TO BE ADDED)
