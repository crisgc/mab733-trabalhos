<?php
require_once("../nusoap/lib/nusoap.php");
echo 'Fatorial 5: '.fatorial(5);
$server = new nusoap_server;
$server->configureWSDL('server');
$server->register('fatorial',
			array('number' => 'xsd:int'),  //parameter
			array('return' => 'xsd:int'),  //output
			false,   //namespace
			false,  //soapaction
			'rpc', // style
			'encoded', // use
			'Calcula o fatorial de um numero');  //description
function fatorial($number) {
  // Caso seja fatorial de 0
  $result = 1;
  // Calculando o fatorial
  for($i = $number; $i > 1; $i--) {
    $result = $result * $i;
  }
  return $result;
}
$HTTP_RAW_POST_DATA = isset($HTTP_RAW_POST_DATA) ? $HTTP_RAW_POST_DATA : '';
$server->service($HTTP_RAW_POST_DATA);
?>
