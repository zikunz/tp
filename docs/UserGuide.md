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
    - [Update the status of an order: `orders done`](#update-the-status-of-an-order-orders-done)
  * [Storage](#storage)  
    - [Load, create and save data](#load-create-and-save-data)
    - [Generate receipts](#generate-receipts)
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

## Features

### Viewing help: `help`

* Shows available commands of the app.

* Format: `help`

* Expected Output:

```
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

### Items

#### Show items-related commands: `items`

* Show commands related to items and brief description of the commands: add item, list items, remove items, clear items

* Format: `items`

* Expected Output:

```
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

#### Add an item: `items add`

* Add an item to the system.

* Format: `items add <item_name>` followed by `<item_price>` and `<item_stock>`

* Example: `items add PS5` followed by `100` and `10`

* Expected Output:

```
____________________________________________________________
Got it! The item [PS5] is added.
____________________________________________________________
```

#### Show the item list: `items list`

* Display all recorded items in the system.

* Format: `items list`

* Expected Output:

```
____________________________________________________________
Here is the list of items in the warehouse.
____________________________________________________________

1. PS5, S$100.00, 10
2. bag, S$20.00, 20
____________________________________________________________

```

#### Delete an item: `items delete`

* Delete an item from the item list.

* Format: `items delete <item_index>`

* Example: `items delete 2`

* Expected Output:

```
____________________________________________________________
Got it! The item [bag] is deleted.
____________________________________________________________
```

#### Empty the item list: `items clear`

* Clear all recorded items in the system.

* Format: `items clear`

* Expected Output:

```
____________________________________________________________
Done! I just cleared all items for you.
____________________________________________________________
```

#### Update an item: `items update`

* Update either the price of stock of an item in the system.

* Format: `items update` followed by `p` or `s`

* Expected Output:

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

#### Find items: `items find`

* Display all items relating to the keyword

* Format: `items find <item_name>`

* Example: `items find PS5`

* Expected Output:

```
____________________________________________________________
Here is the list of relevant items found.
____________________________________________________________

1. PS5, S$23.00, 199
____________________________________________________________

```

### Orders

#### Show orders-related commands : `orders`

* Show commands related to orders and brief description of the commands:
  add order, list orders, remove orders, clear orders

* Format: `orders`

* Expected Output:

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

#### Add an order: `orders add`

* Add an order to the system.

* Format:

```
orders add <customer_name>
Input the items to be added to this order.
<item_index> <item_quantity>
```

* Expected Output:

```
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
```

Input:

```
orders add weisheng
1 2
```

Expected Output:

```
____________________________________________________________
PS5 and stock of 2 added to the order.
____________________________________________________________
Type (stop) to stop adding items to order, else continue entering items in the same format.
Note that you need at least 1 item in the order.
____________________________________________________________
```

Input: `stop`

Expected Output:

```
____________________________________________________________
Got it! The order for customer [weisheng] is added.
____________________________________________________________
```

#### Show the order list: `orders list`

* Display all recorded orders in the system.

* Format: `orders list`

* Expected Output:

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

#### Remove an order: `orders delete`

* Delete an order from the order list

* Format: `orders delete <order_index>`

* Example: `orders delete 2`

* Expected Output:

```
____________________________________________________________
Got it! The order for customer [Coco] is deleted.
____________________________________________________________
```

#### Empty the order list: `orders clear`

* Clear all recorded orders in the system.

* Format: `orders clear`

* Expected Output:

```
____________________________________________________________
Done! I just cleared all orders for you.
____________________________________________________________
```

#### Find orders: `orders find`

* Display all orders relating to the order name

* Format: `orders find <order_name>`

* Example: `orders find Coco`

* Expected Output:

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

#### Get the total price of an order: `orders price`

* Check total price of a specific order.

* Format: `orders price <order_index>`

* Example: `orders price 2`

* Expected Output:

```
____________________________________________________________
The total price for customer [coco]'s order is S$27.00.
____________________________________________________________
```

#### Update the status of an order: `orders done`

* Change the shipping status of an order once it is shipped.

* Format: `orders done <order_index>`

* Example: `orders done 2`
  
* Format: `orders done 2`

* Expected Output:

```
____________________________________________________________
Got it! The order for customer [coco] is completed.
Generating receipt for customer: coco
Receipt generated for customer: coco
____________________________________________________________
```

### Storage

#### Load, create and save data

While initializing easyLog, it automatically looks for an available save file to load so that you can continue your
progress from the previous exit. If there are no save file available to load, easyLog will automatically create a save
file and save your data and information when exiting the app. The save file will be named as `easyLog.txt` and will be
located in the same folder/directory as the easyLog app.

The save file can be copied to another machine and placed in the same folder/directory that contains the easyLog app. Do
take note that only one `easyLog.txt` should be in the directory or there would be an error. This transfer of save file
allows you to work on multiple devices if you choose to do so.

It is not recommended that you manipulate the data in `easyLog.txt`. However, if you are an expert user and confident,
do feel free to manipulate the data in `easyLog.txt` manually if it enhances your workflow.

#### Generate receipts

When [`orders done`](#update-the-shipping-status-of-an-order-orders-ship) feature is executed, a receipt will be automatically generated
that contains the order details that was deleted. The generated receipts can be found in the same directory as the
location of the easyLog app inside a `Receipts` folder. The receipts generated will be in a `.txt` format.

### Exit the program: `exit`

* Exit the app.

* Format: `exit`

* Expected Output:

```
____________________________________________________________
Save data saved.
____________________________________________________________
Bye. Thanks for using easyLog!
____________________________________________________________
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
