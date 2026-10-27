prices = [500, 1200, 2500, 800, 1500]
# Pure function to calculate discounted price
def discounted_price(price):
    if price > 1000: return price * 0.80
    return price
revised_prices = list(map(discounted_price, prices))
# Identify products costing more than ₹1,000
eligible = list(filter(lambda p: p > 1000, prices))

print("Original prices:", prices)
print("Eligible products:", eligible)
print("Prices after discount:", revised_prices)