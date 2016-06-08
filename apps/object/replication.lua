object = {}
object.replicaIps = {}
object.data = "replication1.lua"
object.firsttime = true

object.onGet = function(self, caller, callerId, payload)
  print("Get")
  if (not(payload == nil)) then
	self.data = payload
  end
  return self.data
end

object.onStore = function(self)
  print("Store")
  return self
end

object.onUpdate = function(self, other)
  print("Update")
  return other
end

object.onTimer = function(self)
  print("Time's up")
  self.replication(self)
end

object.replication = function(self)
  print(dht.localNode.getIP().. " Run replication")
  dht.lookup(dht.key(), function(self, nodes)
	for i,v in pairs(nodes) do
	  print("Put replicas to "..v.getIP())
	end
	dht.put(dht.key(), self, nodes)
  end)
end
