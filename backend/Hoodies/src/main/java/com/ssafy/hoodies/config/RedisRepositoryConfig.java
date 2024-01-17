//package com.ssafy.hoodies.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.cache.CacheProperties;
//import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import redis.clients.jedis.JedisPoolConfig;
//
//import java.time.Duration;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableRedisRepositories
//public class RedisRepositoryConfig {
//    // spring.redis에 설정한 property를 가져옴
//    private final RedisProperties redisProperties;
//
//    // Redis를 사용하기 위해 redisTemplate을 설정
//    @Bean
//    public RedisTemplate<?, ?> redisTemplate(){
//        RedisTemplate<byte[], byte[]> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory());
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(new StringRedisSerializer());
//        return redisTemplate;
//    }
//
//    // property에서 host, port 정보를 가져와 Jedis Pool Configuration과 함께
//    // Jedis Connection Factory Bean을 설정
////    @Bean
////    public RedisConnectionFactory redisConnectionFactory(){
////        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(new RedisStandaloneConfiguration(redisProperties.getHost(), redisProperties.getPort()));
////        jedisConnectionFactory.setPoolConfig(jedisPoolConfig());
////        return jedisConnectionFactory;
////    }
////
////    // Jedis Connection Pool의 configuration
////    private JedisPoolConfig jedisPoolConfig() {
////        final JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
////        jedisPoolConfig.setMaxTotal(128);
////        jedisPoolConfig.setMaxIdle(128);
////        jedisPoolConfig.setMinIdle(36);
////        jedisPoolConfig.setTestOnBorrow(true);
////        jedisPoolConfig.setTestOnReturn(true);
////        jedisPoolConfig.setTestWhileIdle(true);
////        jedisPoolConfig.setMinEvictableIdleTime(Duration.ofSeconds(60));
////        jedisPoolConfig.setTimeBetweenEvictionRuns(Duration.ofSeconds(30));
////        jedisPoolConfig.setNumTestsPerEvictionRun(3);
////        jedisPoolConfig.setBlockWhenExhausted(true);
////        return jedisPoolConfig;
////    }
//
//
//}
