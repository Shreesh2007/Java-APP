from functools import reduce
consumption = [8, 12, 15, 6, 11, 9, 14]

high_consumption = list(filter(lambda x: x > 10, consumption))
daily_cost = list(map(lambda x: x * 6, consumption))
total_units = reduce(lambda a, b: a + b, consumption, 0)

# Pure function to calculate the total bill
def calculate_bill(units, rate):
    return sum(units) * rate
total_bill = calculate_bill(consumption, 6)
print("Consumption above 10 units:", high_consumption)
print("Daily costs:", daily_cost)
print("Total consumption:", total_units)
print("Total electricity bill: ₹", total_bill)