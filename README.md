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
> 1: Take 2 idx values: l = farthest left, r = farthest right
> 2: Area = (whichever is smallest between l and r) * (distance from l to r)
> 3: If [l] > [r] then r moves backwards. Else l moves forwards
> 4: Loop from 2 as long as l < r
> 5: (Step 1.5) Only update Area if new area > old area
> 6: Exit loop and return area
