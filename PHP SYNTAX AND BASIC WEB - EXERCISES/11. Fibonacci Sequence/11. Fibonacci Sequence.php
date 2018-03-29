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
    if(isset($_GET['num'])){
        $num1 = 0;
        $num2 = 1;
        $counter = 0;
        $fib = $num2;
        while($counter != intval($_GET['num'])){
            echo $fib . " ";

            $fib = $num1 + $num2;
            $num1 = $num2;
            $num2 = $fib;

            $counter++;
        }
    }
    ?>
</body>
</html>