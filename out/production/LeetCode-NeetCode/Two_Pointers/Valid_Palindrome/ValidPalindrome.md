<-----Valid Palindrome----->

1) First we need to Remove all NonAlphanumeric chars from the String
Use for loop with Character.isLetterOrDigit, if not then add into the StringBuilder.
2) Then Append into sb with converting all upper cases into Lower Cases
3) Then check using two pointers i and j from start and end until i<j.
4) when i is greater than j and no element remains then return true
5) Otherwise return false