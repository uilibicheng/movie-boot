package com.wsk.movie.music;

/**
 * @DESCRIPTION :
 * @AUTHOR : WuShukai1103
 * @TIME : 2018/1/18  21:53
 */
public class WangYiTypeEnum {
    public static final String SINGLE = "1";//单曲
    public static final String ALBUM = "10";//专辑
    public static final String SINGER = "100";//歌手
    public static final String SONG_SHEET = "1000";//歌单
    public static final String GET_URL = "http://music.163.com/api/search/get/";//查询音乐地址
    public static final String GET_MUSIC = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";//音乐url详情
    public static final StringBuilder FIRST_PARAM_START = new StringBuilder("{\"ids\":\"[");//数据前缀
    public static final String FIRST_PARAM_END = "]\",\"br\":128000,\"csrf_token\":\"\"}";//数据尾巴

    public static final String MUSIC_URL = "/music/";//本地音乐文件地址

    //评论地址
    public static final StringBuilder COMMENTS_URL_START = new StringBuilder("http://music.163.com/weapi/v1/resource/comments/R_SO_4_");
    public static final String COMMENTS_URL_END = "?csrf_token=";
//    评论缓存
    //wangyi_comments_ + id

    //图片地址
    public static final String MUSIC_PIC = "http://music.163.com/api/song/detail/?";

    public static final String HOTTING_MUSIC = "https://music.163.com/discover/toplist?id=19723756";//云音乐飙升榜-2

    public static final String NEW_MUSIC = "http://music.163.com/discover/toplist?id=3779629";//云音乐新歌榜-3

    public static final String HOT_MUSIC = "http://music.163.com/discover/toplist?id=3778678";//云音乐热歌榜-1

    //缓存 音乐实体
    /**
     * rpush
     * wangyi_music_   +   name
     */

    /**
     * 缓存歌曲地址
     * wangyi_music_url_   +   song_id
     */
}