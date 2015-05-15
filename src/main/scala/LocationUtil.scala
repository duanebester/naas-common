import common.Location

object LocationUtil {

  val earthRadius:Double = 3958.75

  def distanceCalc(start : Location, end : Location) : Double = {

    import java.lang.Math.toRadians;
    val deltaLat:Double = toRadians(start.lat - end.lat);
    val deltaLng:Double = toRadians(start.long - end.long);

    import java.lang.Math.sin;
    val sinDeltaLat:Double = sin(deltaLat / 2);
    val sinDeltaLng:Double = sin(deltaLng / 2);

    import java.lang.Math.cos;
    import java.lang.Math.pow;
    val a:Double = pow(sinDeltaLat, 2) + pow(sinDeltaLng, 2) * cos(Math.toRadians(start.lat)) * cos(Math.toRadians(end.lat));

    import java.lang.Math.sqrt;
    import java.lang.Math.atan2;
    val c:Double = 2 * atan2(sqrt(a), sqrt(1-a));

    val dist:Double = earthRadius * c;

    dist
  }

}
