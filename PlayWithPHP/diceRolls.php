<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<?php
$diceNumber=0;
session_start();
if(!isset($_SESSION)){
    $_SESSION["wins"] = 0;
    $_SESSION["totalRolls"] =0;
    $_SESSION["losses"] = 0;
}
if(isset($_POST['SubmitButton'])){
     $diceNumber=$_POST["dice"];
 }
?>

<body>
    <h1>Dice game!</h1>
    <h3>Demonstrates rolling a die</h3>
    <?php
      $roll=rand(1,6);
      echo "<p>You rolled a " .$roll.".</p>";
      if($roll==1){
        echo '<img alt="\dieimages\" width="60" height="60"  src="https://icsprogramming.ca/test/images/die1.gif">';
      }else if($roll==2){
        echo '<img width="60" height="60" alt="\dieimages\" src="https://icsprogramming.ca/test/images/die2.gif">';

      }else if($roll==3){
        echo '<img width="60" height="60" alt="\dieimages\" src="https://icsprogramming.ca/test/images/die3.gif">';

      }else if($roll==4){
        echo '<img width="60" height="60" alt="\dieimages\" src="https://icsprogramming.ca/test/images/die4.gif">';

      }else if($roll==5){
        echo '<img width="60" height="60" alt="\dieimages\" src="https://icsprogramming.ca/test/images/die5.gif">';

      }else if($roll==6){
        echo '<img width="60" height="60" alt="\dieimages\" src="https://icsprogramming.ca/test/images/die6.gif">';

      }
      ?>
    <div>
        <div style="border: 1px solid grey;">
            <div>Total rolls : <?php echo $_SESSION["totalRolls"] ?></div>
            <div>Looses : <?php echo $_SESSION["losses"] ?></div>
            <div>Wins : <?php echo $_SESSION["wins"] ?></div>
            <?php
          if($roll==$diceNumber){
              echo '<h4 style="color:green;">Success</h4>';
              $_SESSION["wins"] = $_SESSION["wins"]+1;
              $_SESSION["totalRolls"] = $_SESSION["totalRolls"]+1;
          }else{
            echo '<h4 style="color:red;">Try again</h4>';
              $_SESSION["totalRolls"] = $_SESSION["totalRolls"]+1;
              $_SESSION["losses"] =$_SESSION["losses"]+1; 
          }
          ?>
        </div>

        <div>
            <form method="post" action="index.php">
                <label for="cars">Choose a dice:</label>
                <select name="dice" id="cars">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                </select>
                <input type="submit" name="SubmitButton" value="submit">
            </form>
        </div>

    </div>

    <p>Refresh this page in the browser to roll another die.</p>
</body>

</html>
