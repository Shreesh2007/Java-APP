from functools import reduce
salaries = [25000, 38000, 45000, 32000, 50000]
revised = list(map(lambda s: s * 1.10 if s < 40000 else s, salaries))
eligible = list(filter(lambda s: s < 40000, salaries))

# Total salary expenditure after revision
total = reduce(lambda a, b: a + b, revised, 0)
print("Eligible salaries:", eligible)
print("Revised salaries:", revised)
print("Total salary expenditure:", total)