

/--------Brute Force------/

1) Iterated Through Array for every element.
2) Check if current element arr[i] is equals to arr[i+1] next element
3) if found duplicate return true, otherwise false
4) End the loop



/-------Optimal HashMap------/

1) Use HashSet
2) if current element contains in Set then return true otherwise add into Set.
3) Check for others using Enhanced for : since Set contains only Unique elements.