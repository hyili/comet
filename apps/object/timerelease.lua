object = {}
object.value = "myValue"

object.onStore = function(self)
  self.start = dht.sysTime()
  return self
end

object.onGet = function(self)
  self.last = self.start + 30000 - dht.sysTime()
  if (self.last < 0) then
    return self.value
  end
  return "Value is not ready now, last "..self.last.." ms "
end
