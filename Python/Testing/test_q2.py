# Performing test:
# Test case 0 : Passed

# Performing test:
# Test case 1 : Passed

# Performing test:
# Test case 2 : Passed


# %%Test case 0
points_list_0 = [[23, 20], [-6, -8], [-15, 12], [4, -2]] 
expected_output_0 = [-15, 12]
expt_data_0 = [points_list_0 , expected_output_0]


# %%Test case 1
points_list_1 = [[4, -10], [0, -3], [5, 0], [-8, 6]] 
expected_output_1 = [4, -10]
expt_data_1 = [points_list_1 , expected_output_1]

 

# %%Test case 2
points_list_2 = [[55, 100], [-6, -8], [7, -7], [-5, 6]] 
expected_output_2 = [7, -7]
expt_data_2 = [points_list_2 , expected_output_2]


# %%
import q2  


expt_data_all = [expt_data_0, expt_data_1, expt_data_2]


# Loop through the tests 
for k in range(0, len(expt_data_all)) :
   points_list = expt_data_all[k][0]
   expected_output = expt_data_all[k][1]
   
   # Print test id
   print('Performing test: ')
   # Call the function 
   your_output = q2.q2_func(points_list)

   compare_values = your_output == expected_output
   
   if compare_values :
       print('Test case',k,':','Passed','\n')
   else:
       print('Test case',k,':','Failed')
       print('Your output is:', your_output)
       print('Expected output is:', expected_output,'\n')    
