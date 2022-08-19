import math
def q2_func(points_list):
    maxDistanceListItem=-1# initially assumed index -1 has maximum distance
    maxDistance=-1 # assumed maxDistance is -1 
    # if further any list co-ordinate has max distance we will update my initially inialized values
    # iterate list from index 0 to end
    for i in range(len(points_list)):
        x=points_list[i][0]# x at indedx ith
        y=points_list[i][1]# y at index ith
        # skip co-ordinate if x and y belongs to 1 or 3 quadrant
        if (x>0 and y>0) or (x<0 and y<0):
            continue
        distance=math.sqrt(x**2+y**2)
        if distance>maxDistance:# update maxDistance and maxDistanceListItem
            maxDistance=distance
            maxDistanceListItem=i
    return points_list[maxDistanceListItem] # return list which has max distance
