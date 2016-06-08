object = {}
object.replicaIps = {}
object.data = "Nothing yet"

object.onGet = function(self)
  dht.put(dht.key(), self, 4)
  dht.get(dht.key(), 4, function(self, vals)
	  print(vals)
  end)

  return self.data
end
