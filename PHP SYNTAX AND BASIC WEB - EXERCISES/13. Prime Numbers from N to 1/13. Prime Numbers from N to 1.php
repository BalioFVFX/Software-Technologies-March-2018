<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    function isPrime($num) : bool{
        for($i = 2; $i < $num; $i++){
            if($num % $i == 0){
                return false;
            }
        }
        return true;
    }
    if(isset($_GET['num'])){
        for($i = intval($_GET['num']); $i > 1; $i--){
            if(isPrime($i) == true){
                echo $i . " ";
            }
        }
    }
    ?>
</body>
</html>