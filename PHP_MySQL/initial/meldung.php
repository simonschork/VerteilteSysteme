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
  $vorname = $_POST['vorname'];
  $nachname = $_POST['nachname'];
  $wie_viele = $_POST['wieviele'];
  $was_sie_taten = $_POST['wassietaten'];
  $weiteres = $_POST['weiteres'];
  $wann_es_geschah = $_POST['wanngeschahes'];
  $wie_lange = $_POST['wielange'];
  $alien_beschreibung = $_POST['alienbeschreibung'];
  $fang_gesehen = $_POST['fanggesehen'];
  $email = $_POST['email'];
 
  $db = mysqli_connect('localhost','root','','aliendatenbank') or die('Fehler beim Verbinden mit MYSQL-Server.');

  $sql = "INSERT INTO alien_entfuehrung VALUES ('$vorname', '$nachname', '$wann_es_geschah', '$wie_lange', '$wie_viele', '$alien_beschreibung', '$was_sie_taten', '$fang_gesehen', '$weiteres', '$email')";
  $ergebnis = mysqli_query($db, $sql) or die('Fehler bei Datenabfrage.');

  mysqli_close($db);
  
  echo 'Vielen Dank für den Bericht.<br />'; 
  echo 'Sie wurden ' . $wann_es_geschah;
  echo ' entführt und waren ' . $wie_lange . ' weg<br />';
  echo 'Anzahl Aliens: '.$wie_viele.'<br />';
  echo 'Beschreiben Sie sie: ' . $alien_beschreibung . '<br />';
  echo 'Was die Aliens machten: '.$was_sie_taten . '<br />';
  echo 'Was die Aliens machten: ' . $was_sie_taten . '<br />';
  echo 'War Fang da? ' . $fang_gesehen . '<br />';
  echo 'Weitere Bemerkungen: ' . $weiteres . '<br />';
  echo 'Ihre E-Mail-Adresse: ' . $email;
?>

</body>
</html>