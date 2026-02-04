# Paige LaBarr
# February 4, 2026
# Convert feet to miles

feet = int(input('How many feet are there? '))

miles = feet // 5280            # // floor division
leftover_feet = feet % 5280     # % remainder

print(f'There are {miles} miles with {leftover_feet} feet left over.')
#use curly brackets for around variable names in formatted print statements
