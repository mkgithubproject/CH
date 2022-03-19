function average(){
    let sum=0;
    for(let i=1;i<=10;i++){
        sum=sum+i;
    }
    let average=sum/10;
    console.log("average is "+average);
}


function isEven(number){
     if(number%2===0){
         return true;
     }else{
         return false;
     }
}

function testNumber(number){
    let evenNumber=isEven(number);
    if(evenNumber===true){
        console.log(number+" is even");
    }else{
        console.log(number+" is odd");
    }
}
function dayActivity(day){
    let output;
    switch(day){
        case "Monday":
           output= "Not again!";
           break;
        case "Wednesday":
            output="Half way there!";
            break;
        case "Friday":
            output="TGIF!";
            break;
        case "Sunday":
            output="Sunday Funday!";
            break;
        default:
            output="Just another day!";
    }
    console.log(output);

}

function printTable(){
    for(let i=1;i<=5;i++){
        for(let j=1;j<=5;j++){
            console.log(i+" * "+j+" = "+i*j);
        }
        console.log("\n");
    }
}


