<form>
  <textarea rows="10" name="text"><?php
      if(isset($_GET['text'])){
          $data = $_GET['text'];
          preg_match_all('/\w+/', $data, $words);
          $matchedArr = $words[0];
          $outputArr = array();

          foreach($matchedArr as $word){
              $upperStr = trim($word);
              $upperStr = strtoupper($upperStr);
              $trimmedWord = trim($word);
              if($upperStr == $trimmedWord){
                  $outputArr[] = $upperStr;
              }
          }
          echo implode(", ", $outputArr);
      }
      ?></textarea><br>
    <input type="submit" value="Extract">
</form>
