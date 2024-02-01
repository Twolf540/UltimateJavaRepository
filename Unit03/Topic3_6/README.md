# 3.6 - Equivalent Boolean Expressions
## 3_6 P1
De Morgan's Laws
+ !(a && b) = (!a || !b)
+ !(a || b) = (!a && !b)

The signs flip as you distribute the not

Examples of how "not" works:
+ !(x>0) = (x<=0)
+ !(x<0) = (x>=0)

## 3_6 P2
Truth Tables:
| p | q | !p | !q | p&&q | p\\\\q |
|---|---|----|----|------|--------|
| T | T | F  | F  |  F   |   F    |
| T | F | F  | T  |  T   |   T    |
| F | T | T  | F  |  T   |   T    |
| F | F | T  | T  |  T   |   T    |

p||q&&p and p&&(p||q) both equal the state of p
