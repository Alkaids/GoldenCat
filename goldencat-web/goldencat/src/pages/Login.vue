<template>
    <div class="wrapper">
      <div class="top" :style="backgroundStyleTop">
      </div>
      <div class="bottom" :style="backgroundStyleBottom">
      </div>
      <div class="swiper" id="swiperBox">
        <Swiper :list="swiperList" :dots-position="swiperDotsPosition" :height="swiperHeight" :loop="swiperLoop"/>
      </div>
      <div class="start">
        <span>开启财富之旅</span>
      </div>
      <input type="button" class="login" value="登录">
      <input type="button" class="logon" value="注册">
    </div>
</template>

<script>
import { Swiper } from 'vux'
import router from '../router'
export default {
  name: 'Home',
  data () {
    return {
      backgroundStyleTop: {
        background: '#FFD700',
      },
      backgroundStyleBottom: {
        background: '#fff',
      },
      swiperLoop: true,
      swiperHeight: document.getElementsByTagName('body')[0].clientHeight/2 + 'px',
      swiperDotsPosition: 'center',
      swiperList: [{
              url: 'javascript:',
              img: require('../assets/login/0.jpg'),
            },{
              url: 'javascript:',
              img: require('../assets/login/1.jpg'),
            },{
              url: 'javascript:',
              img: require('../assets/login/2.jpg'),
            }]
    }
  },
  methods:{
    jump() {
      router.push('/home')
    }
  },
  components: {
    Swiper
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .wrapper{
    width:100%;
    height:100%;
    color:#fefefe;
  }
  .top{
    width:100%;
    height:50%;
  }
  .bottom{
    width:100%;
    height:50%;
  }
  .swiper{
    width:80%;
    height:50%;
    position: absolute;
    top:20%;
    left:10%;
    border:2px solid #ddd;
    box-shadow: -5px 5px 5px #888888
  }
  .start{
    position:absolute;
    top:25%;
    left:130px;
    font-size:26px;
  }
  .login{
    position:absolute;
    bottom:10%;
    left:12%;
    border:none;
    width:30%;
    height:40px;
    line-height:40px;
    background:#FFD700;
    color:#fff;
    border-radius:20px;
  }
  .logon{
    position:absolute;
    bottom:10%;
    right:12%;  
    width:30%;
    height:40px;
    line-height:40px;
    border:1px solid #FFD700;
    color:#FFD700;
    background:#fff;
    border-radius:20px; 
  }
</style>
