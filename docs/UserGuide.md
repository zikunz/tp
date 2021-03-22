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
    - [Adding an item: `items add`](#adding-an-item-items-add)
    - [Showing the item list : `items list`](#showing-the-item-list-items-list)
    - [Delete an item: `delete`](#delete-an-item-items-delete)
    - [Emptying the item list: `items clear`](#emptying-the-item-list-items-clear)
    - [Finding an item: `items find`](#finding-an-item-items-find)
  * [Orders](#orders)
    - [Show orders-related commands: `orders`](#show-orders-related-commands--orders)
    - [Adding an order: `orders add`](#adding-an-order-orders-add)
    - [Showing the order list: `orders list`](#showing-the-order-list-orders-list)
    - [Removing an order: `orders delete`](#removing-an-order-orders-delete)
    - [Emptying the order list: `orders clear`](#emptying-the-order-list-orders-clear)
    - [Finding an order: `orders find`](#finding-an-order-orders-find)
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

#### Adding an item: `items add`

* Add an item to the system.

* Format: `items add <item_name>` followed by `<item_price>` and `<item_stock>`

* Example: `items add PS5` followed by `100` and `10`

* Expected Output:

```
Got it! The item [PS5] is added.
```

#### Showing the item list: `items list`

* Display all recorded items in the system.

* Format: `items list`

* Expected Output:

```
Here are the list of items.
1. PS5
2. bag
```

#### Delete an item: `items delete`

* Delete item number _ from item list.

* Format: `items delete <item_index>`

* Example: `items delete 2`

* Expected Output:

```
Got it! The item [glove] is deleted.
```

#### Emptying the item list: `items clear`

* Clear all recorded items in the system.

* Format: `items clear`

* Expected Output:

```
Done! I just cleared all items for you.
```

#### Updating an item: `items update`

* Update either the price of stock of an item in the system.

* Format: `items update` followed by `p` or `s`<br/>
  if `p` is entered, the user needs to enter `<revised_item_price>`<br/>
  if `s` is entered, the user needs to enter `<revised_item_stock>`
* Expected Output:

```
```

#### Finding an item: `items find`

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
```

#### Adding an order: `orders add`

* Add an order to the system.

* Format:

```
orders add <customer_name>
Input the items to be added to this order.
<index> <index> <index>
```

* Example:

```
orders add weisheng
Input the items to be added to this order.
1 2 
```

* Expected Output:

```
Input the items to be added to this order.
Got it! The order for customer [weisheng] is added.
```

#### Showing the order list: `orders list`

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

#### Removing an order: `orders delete`

* Delete an order from the order list

* Format: `orders delete <order_index>`

* Example: `orders delete 2`

* Expected Output:

```
Got it! The order for customer [Coco] is deleted.
```


#### Emptying the order list: `orders clear`

* Clear all recorded orders in the system.

* Format: `orders clear`

* Expected Output:

```
Done! I just cleared all orders for you.
```
#### Finding an order: `orders find`

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
items delete | `tems delete <item_index>` | `items delete 2` |
items clear | `items clear ` | `items clear` |
items find | `items find` | `items find <item_name>`|
orders | `orders` | `orders` |
orders add | `orders add <order_name> `<br />` Input the items to be added to this order. `<br />` <index> <index>` | `orders add weisheng`<br />` Input the items to be added to this order.`<br />` 1 2 ` |
orders list | `orders list` | `orders list` |
orders delete | `orders delete <order_index>` | `orders delete 2` |
orders clear | `orders clear` | `orders clear` |
orders find | `orders find` | `orders find <order_name>`|
exit | `exit` | `exit` |
