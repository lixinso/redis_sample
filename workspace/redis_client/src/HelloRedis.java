import redis.clients.jedis.Jedis;


public class HelloRedis {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//JedisPool pool = new JedisPool(new JedisPoolConfig(),"localhost");
		
		Jedis jedis = new Jedis("localhost");
		jedis.set("key1", "value2");
		String v = jedis.get("key1");
		System.out.println("value1 = " + v);

	}

}
