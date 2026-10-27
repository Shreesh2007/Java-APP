from functools import reduce
students = [("Arun", 45), ("Bala", 72), ("Charan", 38), ("Divya", 90), ("Esha", 50)]
qualified = list(filter(lambda s: s[1] >= 50, students))
print("Students scoring 50 or above:", qualified)
revised = list(map(lambda s: (s[0], min(s[1] + 5, 100)), students))
print("Revised marks:", revised)

# Calculate total revised marks
total = reduce(lambda acc, s: acc + s[1], revised, 0)
print("Total revised marks:", total)