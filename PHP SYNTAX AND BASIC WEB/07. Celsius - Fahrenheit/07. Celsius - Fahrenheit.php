<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?php
    if(isset($_GET['cel'])){
        $celsius = floatval($_GET['cel']);
        $fahrenheit  = floatval($celsius * 9/5 + 32);
        echo $celsius." &deg;"." C" . " = " . $fahrenheit." &deg"." F";
    }
    ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?php
    if(isset($_GET['fah'])){
        $fahrenheit = floatval($_GET['fah']);
        $celsius = ($fahrenheit - 32) * 5/9;
        echo $fahrenheit." &deg;"." F" . " = " . $celsius." &deg"." C";

    }
    ?>
</form>
