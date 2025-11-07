# RS_ELA
The repo I made for my Experiential Learning Activity (Competitive Problem Solving [Coding]) during my 3rd semester, the Residential Semester of BracU — RS70

## Assignment 1 solution methods
### 1a
Ans: O(nlogn)

Exp: Outer loop runs n * 1/2 times, so O(n). Inner loop runs ~~√n times, so O(√n).~~ logn times because of the step being a product of 2. Therefore, final time complexity: n*logn
### 1b
Ans: O(√n)

Exp: The step is squaring itself, so time complexity is √n

### 2
Exp:
- Learnt how to declare arrays as arraylists using AI
- Spent over an hour figuring out how to do git pull -a
- Asked AI to explain the problem in Leet code in better english, then read it a few times to figure out the logic behind the required solution
- Asked AI to give a different long array so I could try to find the max area manually, and did

The technique I found out is (pseudo code below):
1. Take 2 idx values: l = farthest left, r = farthest right
2. Area = (whichever is smallest between [l] and [r]) * (distance from l to r)
3. If [l] > [r] then r moves backwards. Else l moves forwards
4. Loop from 2 as long as l < r
5. (Step 1.5) Only update Area if new area > old area
6. Exit loop and return area

## Assignment 2 solution methods
### 1a
Exp: Traverse the linkedList till the end, connect newItem (new = arata[新]) to current.next (current = kore [これ]), and link newItem.prev to current (Which was the last item before the operation)
### 1b
Exp: Traverse till 2nd last element. Set 2nd last element's ".next" to null (We can't set current to null directly because it is a local variable with a copy of the reference, not the actual node itself. So we must refer to the .next to access it directly). Also handle case where node only has one element.
### 1c
Exp: Refer to `this` with "current". After handling case for 1 node, for multiple nodes: Disguising 1st node as 2nd node, remove link from 2nd node, and link 1st node with 3rd node.
### 1d
Exp: First see if current.next is null (tail); set that to head, then vice versa. Then use a temp variable to swap each node's prev and next, then traverse throughout the list **using ".prev"**
### 1e
Exp: Turned linkedList into doubly linked list for ease in solving problem. Starting from tail, go to ".prev" in a for loop where i = 1, idx, and idx is the parameter for the function. Remove next link to target node from previous node, and remove prev link to target node from next node

### 2
Exp: Refer to 2 of Assignment 1
