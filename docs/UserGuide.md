# easyLog User Guide

easyLog is a Command Line Interface (CLI) application for warehouse employees to manage items and orders in the 
warehouse. easyLog allows users to add new items and orders, view existing items and orders, remove specific items and 
orders and clear all existing items and orders in the warehouse at ease. If the user types fast, easyLog can get 
logistic management tasks done faster than traditional Graphical User Interface (GUI) applications.

- [Quick start](#quick-start)
- [Features](#features)
  * [Viewing help: `help`](#viewing-help-help)
  * [Items](#items)
    - [Show items-related commands: `items`](#show-items-related-commands-items)
    - [Add an item: `items add`](#add-an-item-items-add)
    * [Show the item list : `items list`](#show-the-item-list-items-list)
    * [Delete an item: `delete`](#delete-an-item-items-delete)
    * [Empty the item list: `items clear`](#empty-the-item-list-items-clear)
    - [Find items: `items find`](#find-items-items-find)
  * [Orders](#orders)
    - [Show orders-related commands: `orders`](#show-orders-related-commands--orders)
    - [Add an order: `orders add`](#add-an-order-orders-add)
    - [Show the order list: `orders list`](#show-the-order-list-orders-list)
    - [Remove an order: `orders delete`](#remove-an-order-orders-delete)
    - [Empty the order list: `orders clear`](#empty-the-order-list-orders-clear)
    - [Find orders: `orders find`](#find-orders-orders-find)
    - [Get the total price of an order:: `orders price`](#get-the-total-price-of-an-order-orders-price)
    - [Update the shipping status of an order: `orders ship`](#update-the-shipping-status-of-an-order-orders-ship)
  * [Storage](#storage)  
    - [Load, create and save data](#load-create-and-save-data)
  * [Exit the program: `exit`](#exit-the-program-exit)
- [FAQ](#faq)
- [Command Summary](#command-summary)

## Quick start

1. Ensure you have Java 11 or above installed in your Computer.
2. Download the latest easyLog.jar from [here](https://github.com/AY2021S2-CS2113T-T09-4/tp/releases/v1.0).
3. Copy the file to the folder you want to use as the home folder for your easyLog.
4. Open up a terminal/command window at the location where easyLog.jar is located.
5. Run the command `java -jar easyLog.jar`
6. The app should load as shown below

```
Hello! I'm easyLog!
What can I do for you? Enter help to view commands.
```
7. Type a command and press enter to continue using the app.
8. Refer to the [Features](#features) below for details of each command.

## Features

### Viewing help: `help`

* Shows available commands of the app.

* Format: `help`

* Expected Output:

```
General Options:
  1. items                          Show items-related commands
  2. items add <item_name>          Add an item
  3. items list                     List all items
  4. items delete <item_index>      Delete an item
  5. items clear                    Empty all items
  6. items find <item_name>         Find relevant items by keyword
  7. orders                         Show orders-related commands
  8. orders add <order_name>        Add an order
  9. orders list                    List all orders
  10. orders delete <order_index>   Delete an order
  11. orders clear                  Empty all orders
  12. orders find <order_name>      Find relevant order by order name
  13. orders price <order_index>    Check the total price of an order
  14. orders ship <order_index>     Update the shipping status of an order once the order is shipped
```

### Items

#### Show items-related commands: `items`

* Show commands related to items and brief description of the commands: add item, list items, remove items, clear items

* Format: `items`

* Expected Output:

```
Items-Related Options:
  1. items add <item_name>          Add an item
  2. items list                     List all items
  3. items delete <item_index>      Delete an item
  4. items clear                    Empty all items
```

#### Add an item: `items add`

* Add an item to the system.

* Format: `items add <item_name>` followed by `<item_price>` and `<item_stock>`

* Example: `items add PS5` followed by `100` and `10`

* Expected Output:

```
Got it! The item [PS5] is added.
```

#### Show the item list: `items list`

* Display all recorded items in the system.

* Format: `items list`

* Expected Output:

```
Here are the list of items in the warehouse.
1. ps5, S$100.00, 10
2. bag, S$20.00, 20
```

#### Delete an item: `items delete`

* Delete item number _ from item list.

* Format: `items delete <item_index>`

* Example: `items delete 2`

* Expected Output:

```
Got it! The item [glove] is deleted.
```

#### Empty the item list: `items clear`

* Clear all recorded items in the system.

* Format: `items clear`

* Expected Output:

```
Done! I just cleared all items for you.
```

#### Update an item: `items update`

* Update either the price of stock of an item in the system.

* Format: `items update` followed by `p` or `s`<br/>
  if `p` is entered, the user needs to enter `<revised_item_price>`<br/>
  if `s` is entered, the user needs to enter `<revised_item_stock>`
* Expected Output:

```
```

#### Find items: `items find`

* Display all items relating to the keyword

* Format: `items find <item_name>`

* Expected Output:

```
Here is the list of relevant items found.
1. PS4, S$23.00, 199
```

### Orders

#### Show orders-related commands : `orders`

* Show commands related to orders and brief description of the commands:
add order, list orders, remove orders, clear orders

* Format: `orders`

* Expected Output:

```
Orders-Related Options:
  1. orders add <order_name>        Add an order
  2. orders list                    List all orders
  3. orders delete <order_index>    Remove an order
  4. orders clear                   Empty all orders
  5. orders price <order_index>    Check the total price of an order
  6. orders ship <order_index>     Update the shipping status of an order once the order is shipped
```

#### Add an order: `orders add`

* Add an order to the system.

* Format:

```
orders add <customer_name>
Input the items to be added to this order.
<item_index> <item_quantity>
```

* Example:

```
orders add weisheng
1 2 
stop
```

* Expected Output:

```
Here is the list of items in the warehouse.
1. ps5, S$599.00, 55
Input the items to be added to this order.
ps5 and stock of 2 added to the order.
Type (stop) to stop adding items to order, else continue entering items in the same format.
Note that you need at least 1 item in the order.
Got it! The order for customer [weisheng] is added.
```

#### Show the order list: `orders list`

* Display all recorded orders in the system.

* Format: `orders list`

* Expected Output:

```
Here are the list of orders.
1. weisheng
    1. PS5
    2. bag
2. Coco
    1. PS5
```

#### Remove an order: `orders delete`

* Delete an order from the order list

* Format: `orders delete <order_index>`

* Example: `orders delete 2`

* Expected Output:

```
Got it! The order for customer [Coco] is deleted.
```


#### Empty the order list: `orders clear`

* Clear all recorded orders in the system.

* Format: `orders clear`

* Expected Output:

```
Done! I just cleared all orders for you.
```
#### Find orders: `orders find`

* Display all orders relating to the order name

* Format: `orders find <order_name>`

* Expected Output:

```
orders find Gus
Here is the list of relevant orders found.
Gus []
    1. PS4, S$23.00, 2
    Total Price : S$46.00
```

#### Get the total price of an order: `orders price`

* Check total price of a specific order. 

* Format: `orders price 2`

* Expected Output:

```
The total price for customer [coco]'s order is S$500.00.
```

#### Update the shipping status of an order: `orders ship`

* Change the shipping status of an order once it is shipped.

* Format: `orders ship 2`

* Expected Output:

```
Got it! The order for customer [coco] has been shipped.
```

### Storage

#### Load, create and save data

While initializing easyLog, it automatically looks for an available save file to load so that you can continue your 
progress from the previous exit. If there are no save file available to load, easyLog will automatically create a save
file and save your data and information when exiting the app. The save file will be named as `easyLog.txt` and will be
located in the same folder/directory as the easyLog app. 

The save file can be copied to another machine and placed in
the same folder/directory that contains the easyLog app. Do take note that only one `easyLog.txt` should be in the
directory or there would be an error. This transfer of save file allows you to work on multiple devices if you choose
to do so.

It is not recommeneded that you manipulate the data in `easyLog.txt`. However, if you are an expert user and confident,
do feel free to manipulate the data in `easyLog.txt` manually if it enhances your workflow.

### Exit the program: `exit`

* Exit the app.

* Format: `exit`

* Expected Output:

```
Bye. Thanks for using easyLog!
```

## FAQ

**Q1**: I do not seem to be able to add an item. Why is this so?

> There could be many possibilities which can result in you not being able to add an item. We advise you to follow
> the below steps when intending to add an item. <br/>
>
> Please note that you need to specify the description of the item. For instance, you can do this
> by typing `orders add Competitive Programming 4: The Lower Bound of Programming Contests in the 2020s`. <br/>
>
> After that, input the **price per item** *(unit price)*. Please note that the unit price is either zero (free item) or
> a positive number smaller or equal to 1000000000 (the system currently accepts a unit price not more than
> SG$1,000,000,000). For example, you can enter `100` for the item price field. <br/>
>
> Lastly, please provide number of items to be added, also known as stock. (TO BE REVISED)

**Q2**: I do not seem to be able to add an order. Why is this so?

> There could be many possibilities which can result in you not being able to add an order. We advise you to follow
> the below steps when intending to add an order. <br/>
>
> Please note that you need to specify a customer's name as he or she is the one whom the order of interest will be
> sent to. For instance, you can do this by typing `orders add Alice`. <br/>
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

## Command Summary

Command | Format | Example |
------- | ------- | ------- | 
help | `help` | `help` |
item | `items` | `items` |
items add | `items add <item_name>` | `items add PS5` |
items list | `items list`      | `items list` |
items delete | `items delete <item_index>` | `items delete 2` |
items clear | `items clear ` | `items clear` |
items find | `items find` | `items find <item_name>`|
orders | `orders` | `orders` |
orders add | `orders add <order_name> `<br />` Input the items to be added to this order. `<br />` <item_index> <item_quantity>` | `orders add weisheng`<br />` Input the items to be added to this order.`<br />` 1 2 ` |
orders list | `orders list` | `orders list` |
orders delete | `orders delete <order_index>` | `orders delete 2` |
orders clear | `orders clear` | `orders clear` |
orders find | `orders find` | `orders find <order_name>`|
orders price | `orders price <order_index>` | `orders price 2` |
orders ship  | `orders ship <order_index>` | `orders ship 2` |
exit | `exit` | `exit` |
