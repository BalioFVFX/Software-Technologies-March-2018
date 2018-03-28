<form>
  <textarea rows="10" name="lines"><?php
    if(isset($_GET['lines'])){
        $data = $_GET['lines'];
        $tempData = explode("\n", $data);
        sort($tempData);
        $output = array_map('trim', $tempData);
        echo implode("\n", $output);
    }
    ?></textarea><br>
    <input type="submit" value="Sort">
</form>
