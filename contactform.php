
<?php


/*Subject and Email variables*/
		$emailSubject = 'Form submission successful';
		$webMaster = 'akanksha.makam@gmail.com';

/*Gathering data variables*/
$emailField = $_POST['email'];
$usernameField = $_POST['name'];
$phoneeField = $_POST['phone'];
$feedbackField = $_POST['feedback'];

$body = <<<EOD
<br><hr><br>
Email: $emailField <br>
Name: $usernameField <br>
Phone Number: $phoneeField <br>
Feedback : $feedbackField <br>
EOD;
		
		$headers = "From: $emailField\r\n";
		$headers .= "Content-type: text/html\r\n";
		$success = mail($webMaster, $emailSubject, $body, $headers);

ini_set('sendmail_from', $webMaster);
/*Results rendered as HTMl*/
		$theResults = <<<EOD
<!doctype html>
<html>
<head>
	<style type="text/css">
body {
	background-image: url(images/mountain_bg.jpg);
}
#thankyou {
	float: left;
	clear: both;
	text-shadow: 0px 0px #D24848;
	text-transform: uppercase;
	font-variant: normal;
	font-style: italic;
	font-family: Baskerville, "Palatino Linotype", Palatino, "Century Schoolbook L", "Times New Roman", serif;
	font-weight: 400;
	color: #EAD1D1;
	font-size: xx-large;
	text-align: center;
	padding-left: 375px;
	padding-top: 250px;
}
.thankyou {
}
    </style>
<meta charset="utf-8">
<title>thankyou</title>
</head>
<body>
<p id="thankyou"><strong>Thank you for submitting your feedback!!</strong></p>
</body>
</html>
EOD;

		echo "$theResults";

?>