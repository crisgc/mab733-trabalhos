<?php
$client = new 
SoapClient('http://www.dataaccess.com/'
.'webservicesserver/numberconversion.wso?WSDL');
 
$function = 'NumberToWords';

$valor = 12;

$arguments= array('NumberToWords' => array(
                        'ubiNum'        => $valor
                ));
$options = array('location' => 
  'http://www.dataaccess.com/'
  .'webservicesserver/numberconversion.wso');
 
$result = $client->__soapCall($function, $arguments, $options);
 
print_r($result->NumberToWordsResult);
?>
