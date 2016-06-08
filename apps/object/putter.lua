object = {}
object.replicaIps = {}

object.onGet = function(self)
  dht.lookup(dht.key(), function(self, nodes)
    for i,v in pairs(nodes) do table.insert(self.replicaIps, v.getIP()) end
  end)
  return self.replicaIps
end

object.onTimer = function(self)
  dht.lookup(dht.key(), function(self, nodes)
    for i,v in pairs(nodes) do table.insert(self.replicaIps, v.getIP()) end
  end)
end

