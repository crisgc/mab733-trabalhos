/*
 * UFRJ PPGI
 */

package logging;

import org.apache.tuscany.sca.invocation.Interceptor;
import org.apache.tuscany.sca.invocation.Invoker;
import org.apache.tuscany.sca.invocation.Message;
import org.osoa.sca.annotations.PolicySets;

public class MyLogger implements Interceptor {
	
	private Invoker next;

	@Override
	public Message invoke(Message arg0) {
		Message result = this.getNext().invoke(arg0);
		return result;
	}

	@Override
	public Invoker getNext() {
		return this.next;
	}

	@Override
	public void setNext(Invoker arg0) {
		this.next = arg0;
	}

}
