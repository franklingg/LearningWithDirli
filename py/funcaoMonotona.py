nums = [int(input()) for i in range(4)]
if nums[0] < nums[1] < nums[2] < nums[3]:
    print("POSSIVELMENTE ESTRITAMENTE CRESCENTE")
elif nums[0] > nums[1] > nums[2] > nums[3]:
    print("POSSIVELMENTE ESTRITAMENTE DECRESCENTE")
else:
	print("FUNCAO NAO ESTRITAMENTE CRES/DECR")