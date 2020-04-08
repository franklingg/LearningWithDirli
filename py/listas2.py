nums = [int(input()) for i in range(3)]
ind = int(input())
toSum = int(input())
nums[ind] += toSum
for num in nums: print(num)