# easyLog User Guide

easyLog is a **desktop logistic management application optimized for home-based businesses to manage items
and orders via a carefully designed Command Line Interface** (CLI). Primarily, easyLog allows users to add new items and
orders, view existing items and orders, remove specific items and orders and clear all existing items and orders in the
inventory at ease. If a user types fast, easyLog can get logistic management tasks done more easily and faster than
traditional Graphical User Interface (GUI) applications while still having the benefits of GUI.

- [1. Quick start](#1-quick-start)
- [2. Features](#2-features)
  * [2.1. Viewing help: `help`](#21-viewing-help-help)
  * [2.2. Items](#22-items)
    - [2.2.1. Show items-related commands: `items`](#221-show-items-related-commands-items)
    - [2.2.2. Add an item: `items add`](#222-add-an-item-items-add)
    * [2.2.3. Show the item list : `items list`](#223-show-the-item-list-items-list)
    * [2.2.4. Delete an item: `delete`](#224-delete-an-item-items-delete)
    * [2.2.5. Empty the item list: `items clear`](#225-empty-the-item-list-items-clear)
    - [2.2.6. Find items: `items find`](#226-update-an-item-items-update)
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

## 1. Quick start

1. Ensure you have Java 11 or above installed in your Computer.
2. Download the latest easyLog.jar from [here](https://github.com/AY2021S2-CS2113T-T09-4/tp/releases/v1.0).
3. Copy the file to the folder you want to use as the home folder for your easyLog.
4. Open up a terminal/command window at the location where easyLog.jar is located.
5. Run the command `java -jar easyLog.jar`
6. The app should load as shown below

```
                       _                 
                      | |                
   ___  __ _ ___ _   _| |     ___   __ _ 
  / _ \/ _` / __| | | | |    / _ \ / _` |
 |  __/ (_| \__ \ |_| | |___| (_) | (_| |
  \___|\__,_|___/\__, |______\___/ \__, |
                  __/ |             __/ |
                 |___/             |___/ 
____________________________________________________________
Hello! I'm easyLog!
What can I do for you? Enter help to view commands.
____________________________________________________________

Looking for save data.
Loading save data.
Save data loaded.
____________________________________________________________
```


7. Type a command and press enter to continue using the app.
8. Refer to the [Features](#features) below for details of each command.

## 2. Features

Section 2 will explain the features available in easyLog.

###### Notes about the command format:

* Word(s) in UPPER_CASE is / are parameter(s) to be entered by the user. e.g. In `add n/CUSTOMER_NAME`, `CUSTOMER_NAME`
  which can be used as `add n/Alice Tan`

* Any extraneous parameters for commands not taking in parameters (such as `help` and `exit`) will not be ignored. The
  system will notify the user that it cannot be understood by easyLog.

### 2.1 Viewing help: `help`

Shows available commands of the app.

Format: `help`

Expected Output:

```
help (user input)
____________________________________________________________
General Options:
  1. items                          Show items-related commands
  2. items add <item_name>          Add an item
  3. items list                     List all items
  4. items delete <item_index>      Delete an item
  5. items clear                    Empty all items
  6. items find <item_name>         Finding an item
  7. items update                   pdate the detail of an item
  8. orders                         Show orders-related commands
  9. orders add <order_name>        Add an order
  10. orders list                   List all orders
  11. orders delete <order_index>   Delete an order
  12. orders clear                  Empty all orders
  13. orders find <order_name>      Finding an order
____________________________________________________________
```

### 2.2 Items

Section 2.2 will explain the features related to items.

#### 2.2.1. Show items-related commands: `items`

Show commands related to items and brief description of the commands: add item, list items, remove items, clear items

Format: `items`

Expected Output:

```
items (user input)
____________________________________________________________
Items-Related Options:
  1. items add <item_name>          Add an item
  2. items list                     List all items
  3. items delete <item_index>      Delete an item
  4. items clear                    Empty all items
  5. items find <item_name>         Finding an item
  6. items update                   Update the detail of an item
____________________________________________________________
```

#### 2.2.2. Add an item: `items add`

Add an item to the system.

Format: `items add <item_name>` followed by `<item_price>` and `<item_stock>`

Example: `items add PS5` followed by `100` and `10`
  (Please note that if an item to be added already exists in the system, additional stock will be requested and the item
  information will be updated accordingly.)

Expected Output:

```
items add PS5 (user input)
____________________________________________________________
Please enter the price of the item.
____________________________________________________________
100 (user input)
____________________________________________________________
Please enter the stock of the item.
____________________________________________________________
10 (user input)
____________________________________________________________
Got it! The item [PS5] is added.
____________________________________________________________
```

#### 2.2.3. Show the item list: `items list`

Display all recorded items in the system.

Format: `items list`

Expected Output:

```
____________________________________________________________
Here is the list of items in the warehouse.
____________________________________________________________

1. PS5, S$100.00, 10
2. bag, S$20.00, 20
____________________________________________________________

```

#### 2.2.4. Delete an item: `items delete`

Delete an item from the item list.

Format: `items delete <item_index>`

Example: `items delete 2`

Expected Output:

```
____________________________________________________________
Got it! The item [bag] is deleted.
____________________________________________________________
```

#### 2.2.5. Empty the item list: `items clear`

Clear all recorded items in the system.

Format: `items clear`

Expected Output:

```
____________________________________________________________
Done! I just cleared all items for you.
____________________________________________________________
```

#### 2.2.6. Update an item: `items update`

Update either the price of stock of an item in the system.

Format: `items update` followed by `p` or `s`

Expected Output:

```
____________________________________________________________
What would you like to update, price or stock? (p/s)
____________________________________________________________
```

if `p` is entered, the user needs to enter `<revised_item_price>`<br/>

Expected Output:

```
____________________________________________________________
Done! I just updated the item price for you.
____________________________________________________________
```

if `s` is entered, the user needs to enter `<revised_item_stock>`

Expected Output:

```
____________________________________________________________
Done! I just updated the item stock for you.
____________________________________________________________
```

#### 2.2.7. Find items: `items find`

Display all items relating to the keyword

Format: `items find <item_name>`

Example: `items find PS5`

Expected Output:

```
____________________________________________________________
Here is the list of relevant items found.
____________________________________________________________

1. PS5, S$23.00, 199
____________________________________________________________

```

### 2.3. Orders

Section 2.3 will explain the features related to orders.

#### 2.3.1. Show orders-related commands : `orders`

Show commands related to orders and brief description of the commands:
  add order, list orders, remove orders, clear orders

Format: `orders`

Expected Output:

```
____________________________________________________________
Orders-Related Options:
  1. orders add <order_name>        Add an order
  2. orders list                    List all orders
  3. orders delete <order_index>    Delete an order
  4. orders clear                   Empty all orders
  5. orders price <order_index>     Check the total price of an order
  6. orders done <order_index>      Update the status of an order
  7. orders find <order_name>       Finding an order
____________________________________________________________
```

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
1. Order has to contain at least 1 item to be added into the system.
2. Item quantity to be inputted into the order cannot be more than the current stock in the inventory.
3. While adding items into the order, if the app encounters any format error in the input, it may cause order details to
   be added wrongly. Do use [`orders delete`](#234-remove-an-order-orders-delete) feature to delete the order and
   re-input the order details in the correct format.
5. When in doubt, do follow the prompts shown on command terminal.
   

Format:

```
orders add <customer_name>
Input the items to be added to this order.
<item_index> <item_quantity>
```

Expected Output:

```
orders add weisheng (user input)
____________________________________________________________
Here is the list of items in the warehouse.
____________________________________________________________

1. PS5, S$23.00, 199
2. bag, S$20.00, 20
3. milk, S$5.60, 20
4. tea, S$4.40, 34
____________________________________________________________
Input the items to be added to this order.
____________________________________________________________
1 2 (user input)
____________________________________________________________
PS5 and stock of 2 added to the order.
____________________________________________________________
Type (stop) to stop adding items to order, else continue entering items in the same format.
Note that you need at least 1 item in the order.
____________________________________________________________
stop (user input)
_____________________________________________________
Got it! The order for customer [weisheng] is added.
____________________________________________________________
```

#### 2.3.3. Show the order list: `orders list`

Display all recorded orders in the system.

Format: `orders list`

Expected Output:

```
____________________________________________________________
Here is the list of orders.
____________________________________________________________

weisheng []
    1. PS5, S$23.00, 2
    Total Price : S$46.00
____________________________________________________________
Coco []
    1. milk, S$5.60, 3
    2. tea, S$3.40, 2
    Total Price : S$27.00
____________________________________________________________
```

#### 2.3.4. Remove an order: `orders delete`

Delete an order from the order list

Format: `orders delete <order_index>`

Example: `orders delete 2`

Expected Output:

```
____________________________________________________________
Got it! The order for customer [Coco] is deleted.
____________________________________________________________
```

#### 2.3.5. Empty the order list: `orders clear`

Clear all recorded orders in the system.

Format: `orders clear`

Expected Output:

```
____________________________________________________________
Done! I just cleared all orders for you.
____________________________________________________________
```

#### 2.3.6. Find orders: `orders find`

Display all orders relating to the order name

Format: `orders find <order_name>`

Example: `orders find Coco`

Expected Output:

```
____________________________________________________________
Here is the list of relevant orders found.
____________________________________________________________

Coco []
    1. milk, S$5.60, 3
    2. tea, S$3.40, 2
    Total Price : S$27.00
____________________________________________________________
```

#### 2.3.7. Get the total price of an order: `orders price`

Check total price of a specific order.

Format: `orders price <order_index>`

Example: `orders price 2`

Expected Output:

```
____________________________________________________________
The total price for customer [coco]'s order is S$27.00.
____________________________________________________________
```

#### 2.3.8. Update the status of an order: `orders done`

Change the shipping status of an order once it is shipped.

Format: `orders done <order_index>`

Example: `orders done 2`
  
Format: `orders done 2`

Expected Output:

```
____________________________________________________________
Got it! The order for customer [coco] is completed.
Generating receipt for customer: coco
Receipt generated for customer: coco
____________________________________________________________
```

### 2.4. Storage

Section 2.4 will explain storage related features.

#### 2.4.1. Load, create and save data

While initializing easyLog, it automatically looks for an available save file to load so that you can continue your
progress from the previous exit. If there are no save file available to load, easyLog will automatically create a save
file for you and save your data and information when exiting the app. The save file will be named as `easyLog.txt` and 
will be located in the same folder/directory as the easyLog app.

The save file can be copied to another machine and placed in the same folder/directory that contains the easyLog app. Do
take note that only one `easyLog.txt` should be in the directory or there would be an error. This transfer of save file
allows you to work on multiple devices if you choose to do so.

It is not recommended that you manipulate/edit the data in `easyLog.txt`. However, if you are an expert user and confident,
do feel free to manipulate the data in `easyLog.txt` manually if it enhances your workflow.

#### 2.4.2. Generate receipts

When [`orders done`](#238-update-the-status-of-an-order-orders-done) feature is executed, a receipt will be 
automatically generated that contains the order details that was deleted. The generated receipts can be found in the 
same directory as the location of the easyLog app inside a `Receipts` folder. The receipts generated will be in a `.txt` 
format. This allows the list of orders while using the app to be kept clean with only the orders that are not done for
easier viewing. Also, the generated receipts allows you to keep track of your revenue or to handle your taxes.
Furthermore, receipts are numbered to show you how many orders you have fulfilled.

(**ADD IMAGE OF RECEIPT FOLDER HERE**)

### 2.5. Exit the program: `exit`

Exit the app.

Format: `exit`

Expected Output:

```
____________________________________________________________
Save data saved.
____________________________________________________________
Bye. Thanks for using easyLog!
____________________________________________________________
```

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
> system? Why cannot I update the unit price?

> It is typically hard for users to remember all items in the system. Hence, we make it easier and more efficient when
> easyLog detects the item to be added already exists in the item list. Since this only happens when the user stocks up
> a particular item, we allow the user to increase the stock as long as the total number of item stock is within the
> threshold (i.e., 1000000). However, it does not naturally happen when a user wants to update the unit price when he or
> she adds an item which already exists in the system.
>
> When it happens, the user is welcomed to use `item update` command instead.

## 4. Command Summary

Command | Format | Example |
------- | ------- | ------- | 
help | `help` | `help` |
item | `items` | `items` |
items add | `items add <item_name>` | `items add PS5` |
items list | `items list`      | `items list` |
items delete | `items delete <item_index>` | `items delete 2` |
items clear | `items clear ` | `items clear` |
items find | `items find` | `items find <item_name>`|
items update | `items update` | `items update`|
orders | `orders` | `orders` |
orders add | `orders add <order_name> `<br />` Input the items to be added to this order. `<br />` <item_index> <item_quantity>` | `orders add weisheng`<br />` Input the items to be added to this order.`<br />` 1 2 ` |
orders list | `orders list` | `orders list` |
orders delete | `orders delete <order_index>` | `orders delete 2` |
orders clear | `orders clear` | `orders clear` |
orders find | `orders find` | `orders find <order_name>`|
orders price | `orders price <order_index>` | `orders price 2` |
orders done  | `orders done <order_index>` | `orders done 2` |
exit | `exit` | `exit` |
