<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
    <?php


    for($red = 51; $red <= 255; $red += 51){
        echo "<tr>";
        
        echo "<td style='background-color:rgb($red, 0, 0)'></td>";

        for($green = $red; $green <= 255; $green += 51){

            echo "<td style='background-color:rgb(0, $green, 0)'></td>";

            for($blue = $green; $blue <= 255; $blue += 51){

                echo "<td style='background-color:rgb(0, 0, $blue)'></td>";
                break;
            }
            break;
        }
        echo "</tr>";
    }


    ?>
</table>
</body>
</html>