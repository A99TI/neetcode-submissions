class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:          

        cars = []
        fleets = 0

        for i in range(len(position)):
            cars.append([position[i], speed[i]])

        cars.sort(key=lambda x: x[0])
       

        while len(cars) > 0:

            currCar = cars.pop()
            time = (target - currCar[0]) / currCar[1]

            while cars and (target - cars[-1][0]) / cars[-1][1] <= time:
                cars.pop()

            fleets +=1

        
        return fleets
                    
                    




    
            

        return 0


        