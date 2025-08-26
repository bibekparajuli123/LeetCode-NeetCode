<-----------Three Sum Description------------->

Best Case Complexity : O(n^2) because we have to sort and then find pair with other two elements thats why

1) Use list of List to store the pairs as result
2) Initialize left with i+1 and right with n-1 since first element is for comparison
3) while loop inside to check for the first element with other two elements
4) sum = current_element + left + right
5) if sum == 0 return all three element as a list
6) if sum < 0 ---> increase left to right
7) if sum > 0 ---> decrease right to left
8) if no pair found return empty List.