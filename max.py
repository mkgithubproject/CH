
def biggest(first,second,third,fourth):
    if first>second and first>third and first>fourth:
        return first
    elif second>first and second>third and second>fourth:
        return second
    elif third>first and third>second and third>fourth:
        return third
    else:
        return fourth
    
    
        
def main():
    first=35
    second=32
    third=1
    fourth=9
    returnValue=biggest(first,second,third,fourth)
    print( 'biggest(',first,',',second,',',third,',',fourth,') returned', returnValue)
    first=4
    second=9
    third=45
    fourth=3
    returnValue=biggest(first,second,third,fourth)
    print( 'biggest(',first,',',second,',',third,',',fourth,') returned', returnValue)

if __name__ == '__main__':
   main()
    
