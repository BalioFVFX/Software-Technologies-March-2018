<?php
$data = $_GET;
if($data){
    $result = intval($data['num1']) + intval($data['num2']);
    echo $data['num1'] . " + " . $data['num2'] . " = " . $result;
    ?>
    <?php
}
    ?>
<form>
    <div>First Number:</div>
    <input type="number" name="num1" />
    <div>Second Number:</div>
    <input type="number" name="num2" />
    <div><input type="submit" /></div>
</form>
