<h2>Binary Tree</h2>

The Binary Tree challenge is the last of a series of assignments meant to reinforce skills with abstract data structures after graduating LA.

The challenge here is to implement a binary tree with depth traversal, breadth traversal, and a print method that prints in a readable format to visualize the binary tree.

**WIP Notes**

The print method is still a work in progress. I'd hoped to forego a method that returns depth of the tree by using math to calculate where a node would be located. Since we're including null nodes in order to properly visualize the shape of the tree, our tree is essentially always maximally filled and thus we can calculate every node's location. Every Xth level of a tree has 2^X nodes in it. We can create a flat list of all nodes and then divide it at every 2^X, with the item at 2^X being the first node at the Xth level of the tree.

Unfortunately, I ran into an issue that because we are now including null values in the list, the program will loop forever because the bottom of the tree is essentially an infinite list of null values. Oops.

Current WIP is writing a .depth() method so I can tell my loop where to stop, then writing the logic for the splitting of the flat list.

My intention for the depth method is after 2^X nodes, check the most recent 2^X-1 nodes. If they are all null, break from the loop.

If this all sounds really gross, you'll understand why I wanted to forego the depth method in the first place.
