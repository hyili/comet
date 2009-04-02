package edu.washington.cs.activedht.db;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Iterator;

import org.gudy.azureus2.core3.util.HashWrapper;

import com.aelitis.azureus.core.dht.DHTStorageBlock;
import com.aelitis.azureus.core.dht.control.DHTControl;
import com.aelitis.azureus.core.dht.db.DHTDB;
import com.aelitis.azureus.core.dht.db.DHTDBLookupResult;
import com.aelitis.azureus.core.dht.db.DHTDBStats;
import com.aelitis.azureus.core.dht.db.DHTDBValue;
import com.aelitis.azureus.core.dht.netcoords.DHTNetworkPosition;
import com.aelitis.azureus.core.dht.transport.DHTTransport;
import com.aelitis.azureus.core.dht.transport.DHTTransportContact;
import com.aelitis.azureus.core.dht.transport.DHTTransportException;
import com.aelitis.azureus.core.dht.transport.DHTTransportFullStats;
import com.aelitis.azureus.core.dht.transport.DHTTransportReplyHandler;
import com.aelitis.azureus.core.dht.transport.DHTTransportValue;

public interface TestDHTClasses {
	public static class TestDHTTransportContact
	implements DHTTransportContact {
		private String id;
		
		public TestDHTTransportContact(int id) {
			this.id = "" + id;
		}
		
		@Override
		public void exportContact(DataOutputStream os)
		throws IOException, DHTTransportException { }

		@Override
		public InetSocketAddress getAddress() {
			return new InetSocketAddress("host."+ id +".com", 1024);
		}

		@Override
		public long getClockSkew() { return 0; }

		@Override
		public InetSocketAddress getExternalAddress() { return getAddress(); }

		@Override
		public byte[] getID() { return id.getBytes(); }

		@Override
		public int getInstanceID() { return id.hashCode(); }

		@Override
		public int getMaxFailForLiveCount() { return 0; }

		@Override
		public int getMaxFailForUnknownCount() { return 0; }

		@Override
		public String getName() { return id; }

		@Override
		public DHTNetworkPosition getNetworkPosition(byte position_type) {
			return null;
		}

		@Override
		public DHTNetworkPosition[] getNetworkPositions() { return null; }

		@Override
		public byte getProtocolVersion() { return 0; }

		@Override
		public int getRandomID() { return id.hashCode(); }

		@Override
		public DHTTransportFullStats getStats() { return null; }

		@Override
		public String getString() { return id; }

		@Override
		public DHTTransport getTransport() { return null; }

		@Override
		public boolean isAlive(long timeout) { return true; }

		@Override
		public boolean isValid() { return true; }

		@Override
		public void remove() { }

		@Override
		public void sendFindNode(DHTTransportReplyHandler handler, byte[] id) { }

		@Override
		public void sendFindValue(DHTTransportReplyHandler handler, byte[] key,
				int max_values, byte flags) { }

		@Override
		public void sendImmediatePing(DHTTransportReplyHandler handler,
				                      long timeout) { }

		@Override
		public void sendKeyBlock(DHTTransportReplyHandler handler,
				byte[] key_block_request, byte[] key_block_signature) { }

		@Override
		public void sendPing(DHTTransportReplyHandler handler) { }

		@Override
		public void sendStats(DHTTransportReplyHandler handler) { }

		@Override
		public void sendStore(DHTTransportReplyHandler handler, byte[][] keys,
				DHTTransportValue[][] value_sets, boolean immediate) { }

		@Override
		public void setRandomID(int id) { }
	}

	public static class TestDHTTransportValue implements DHTTransportValue {
		private DHTTransportContact originator;
		private byte[] value;
		private boolean is_local;
		
		public TestDHTTransportValue(DHTTransportContact originator,
				 byte[] value, boolean is_local) {
			this.originator = originator;
			this.value = value;
			this.is_local = is_local;
		}
		
		@Override
		public long getCreationTime() { return 0; }

		@Override
		public int getFlags() { return 0; }

		@Override
		public DHTTransportContact getOriginator() { return originator; }

		@Override
		public String getString() { return "" + value; }

		@Override
		public byte[] getValue() { return value; }

		@Override
		public int getVersion() { return 0; }

		@Override
		public boolean isLocal() { return is_local; }	
	}

	
	class TestDB implements DHTDB {
		private DHTControl control;
		
		public DHTDBValue get(HashWrapper key) { return null; }

		public DHTDBLookupResult get(DHTTransportContact reader,
				                     HashWrapper key,
				                     int max_values,
				                     byte flags,
				                     boolean external_request) {
			return null;
		}

		public DHTControl getControl() { return control; }

		public DHTStorageBlock[] getDirectKeyBlocks() { return null; }

		public DHTStorageBlock getKeyBlockDetails(byte[] key) { return null; }

		public Iterator getKeys() { return null; }

		public DHTDBStats getStats() { return null; }

		public boolean isEmpty() { return false; }

		public boolean isKeyBlocked(byte[] key) { return false; }

		public DHTStorageBlock keyBlockRequest(
				DHTTransportContact direct_sender,
				byte[] request,
				byte[] signature) {
			return null;
		}

		public void print(boolean full) { }

		public DHTDBValue remove(DHTTransportContact sender, HashWrapper key) {
			return null;
		}

		public void setControl(DHTControl control) { this.control = control; }

		public DHTDBValue store(HashWrapper key, byte[] value, byte flags) {
			return null;
		}

		public byte store(DHTTransportContact sender, HashWrapper key,
				          DHTTransportValue[] values) {
			return 0;
		}
		
	}
}