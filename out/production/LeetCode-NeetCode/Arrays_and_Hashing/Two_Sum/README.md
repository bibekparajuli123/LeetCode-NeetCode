Create a HashMap to store numbers and their indices.

For each element nums[i]:

Compute container = target - nums[i].

If container is already in the map → we found two numbers whose sum = target → return their indices.

Otherwise, store the current number with its index in the map.

If no pair found, return empty array.

Time Complexity: O(n)
Space Complexity: O(n)

⚡ In short: One-pass HashMap solution → check complement before storing current number.