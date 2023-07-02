# Stack_Linkedlist


Stack Operations: 
push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
peek(): Return the top element.
display(): Print all elements in Stack.

Push Operation:
Initialise a node
Update the value of that node by data i.e. node->data = data
Now link this node to the top of the linked list
And update top pointer to the current node

Pop Operation:
First Check whether there is any node present in the linked list or not, if not then return
Otherwise make pointer let say temp to the top node and move forward the top node by 1 step
Now free this temp node

Peek Operation:
Check if there is any node present or not, if not then return.
Otherwise return the value of top node of the linked list

Display Operation:
Take a temp node and initialize it with top pointer 
Now start traversing temp till it encounters NULL
Simultaneously print the value of the temp node
