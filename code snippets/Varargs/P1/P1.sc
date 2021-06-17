object Average
{ 
    def main(args: Array[String])={ 
        var res : Float = avg(5, 3, 1000, 2000, 3000);
        println("Average is: " + res.toString); 
    }
    def avg(args: Int *) : Float =
    {
        var result : Float = 0;
        var i : Float =0;
        for(arg <- args)
        {
            result += arg.toFloat
            i= i+1;
        }
        result = result/i
        return result
    }
} 


