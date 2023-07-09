Since all the elements in the array are distinct, the number can be firstMax or secondMax or thirdMax but not all at the same time.

**Ex**: 10,20,30,40,50
**Case**: If you think of ascending element case,
1. 10 > firstMax, 20 > firstMax and so on..., So its important to exchange values, when you got firstMax, its obvious that the element which was in firstMax is your second max and so on.
Because you are not at all updating second and third max as you go through such pattern array.
2. Ex: 90, 23, 50
firstMax = 90
secondMax will be 23 when the pointer is at 23
50 > secondMax, so 23 automatically becomes your 3rd largest element.
Therefore its important to exchange the elements values.

Time: O(n) Space: O(1)

Other Approaches:
1. Sort and return last 3 elements (Since all are distinct)
2. Partial sort like bubble, selection sort and get 3 elements and end it.
O(nlogn) approaches but more extensible code.

Counter Question:
What if the array contains duplicate elements?