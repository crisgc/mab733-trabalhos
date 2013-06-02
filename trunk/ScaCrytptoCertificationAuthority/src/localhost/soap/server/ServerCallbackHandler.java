
/**
 * ServerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package localhost.soap.server;

    /**
     *  ServerCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServerCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServerCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServerCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getPubKeyModulo method
            * override this method for handling normal response from getPubKeyModulo operation
            */
           public void receiveResultgetPubKeyModulo(
                    localhost.soap.server.ServerStub.GetPubKeyModuloResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPubKeyModulo operation
           */
            public void receiveErrorgetPubKeyModulo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPriKeyExponent method
            * override this method for handling normal response from getPriKeyExponent operation
            */
           public void receiveResultgetPriKeyExponent(
                    localhost.soap.server.ServerStub.GetPriKeyExponentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPriKeyExponent operation
           */
            public void receiveErrorgetPriKeyExponent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPubKeyExponent method
            * override this method for handling normal response from getPubKeyExponent operation
            */
           public void receiveResultgetPubKeyExponent(
                    localhost.soap.server.ServerStub.GetPubKeyExponentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPubKeyExponent operation
           */
            public void receiveErrorgetPubKeyExponent(java.lang.Exception e) {
            }
                


    }
    