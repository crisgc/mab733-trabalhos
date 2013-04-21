<?php


require_once("../nusoap/lib/nusoap.php");

echo 'Fatorial 5: '.fatorial(5);
 
$server = new nusoap_server;
 
$server->configureWSDL('server');
 
//$server->wsdl->schemaTargetNamespace = 'urn:server';
 
//SOAP complex type return type (an array/struct)
// $server->wsdl->addComplexType(
    // 'Person',
    // 'complexType',
    // 'struct',
    // 'all',
    // '',
    // array(
        // 'id_user' => array('name' => 'id_user', 'type' => 'xsd:int'),
        // 'fullname' => array('name' => 'fullname', 'type' => 'xsd:string'),
        // 'email' => array('name' => 'email', 'type' => 'xsd:string'),
        // 'level' => array('name' => 'level', 'type' => 'xsd:int')
    // )
// );
 
//first simple function
$server->register('hello',
			array('username' => 'xsd:string'),  //parameter
			array('return' => 'xsd:string'),  //output
			false,   //namespace
			false,  //soapaction
			'rpc', // style
			'encoded', // use
			'Just say hello');  //description
			
// $server->register('fatorial',
			// array('number' => 'xsd:int'),  //parameter
			// array('return' => 'xsd:int'),  //output
			// false,   //namespace
			// false,  //soapaction
			// 'rpc', // style
			// 'encoded', // use
			// 'Calcula o fatorial de um número');  //description
 
//this is the second webservice entry point/function 
// $server->register('login',
			// array('username' => 'xsd:string', 'password'=>'xsd:string'),  //parameters
			// array('return' => 'tns:Person'),  //output
			// 'urn:server',   //namespace
			// 'urn:server#loginServer',  //soapaction
			// 'document', // style
			// 'literal', // use
			// 'Check user login');  //description
 
//first function implementation
function hello($username) {
        return 'Howdy, '.$username.'!';
}

function fatorial($number) {
 
// Caso seja fatorial de 0
$result = 1;
// Calculando o fatorial
for($i = $number; $i > 1; $i--) {
	$result = $result * $i;
}

return $result;
}
 
//second function implementation 
function login($username, $password) {
        //should do some database query here
        // .... ..... ..... .....
        //just some dummy result
        return array(
		'id_user'=>1,
		'fullname'=>'John Reese',
		'email'=>'john@reese.com',
		'level'=>99
	);
}
 
$HTTP_RAW_POST_DATA = isset($HTTP_RAW_POST_DATA) ? $HTTP_RAW_POST_DATA : '';
 
$server->service($HTTP_RAW_POST_DATA);
?>