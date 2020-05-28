<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="de" lang="de">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>Von Aliens entführt – eine Entführung melden</title>
</head>
<body>
  <h2>Von Aliens entführt – eine Entführung melden</h2>

<?php
  $wann_geschah_es = $_POST['wanngeschahes'];
  $wie_lange = $_POST['wielange'];
  $alien_beschreibung = $_POST['beschreibung'];
  $fang_gesehen = $_POST['fanggesehen'];
  $email = $_POST['email'];
 

  
  echo 'Vielen Dank für den Bericht.<br />'; 
  echo 'Sie wurden ' . $wann_geschah_es;
  echo ' entführt und waren ' . $wie_lange . ' weg<br />';
  echo 'Beschreiben Sie sie: ' . $alien_beschreibung . '<br />';
  echo 'Was die Aliens machten: ' . $was_sie_taten . '<br />';
  echo 'War Fang da? ' . $fang_gesehen . '<br />';
  echo 'Ihre E-Mail-Adresse: ' . $email;
?>

</body>
</html>