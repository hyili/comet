object = {}

object.password = "mypass"

object.onGet = function(self, caller, callerId, password)
  if(password == self.password) then
    return "This is the data!"
  end
  return "Wrong password"
end

