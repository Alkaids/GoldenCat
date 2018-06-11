<template>
  <transition name="custom-classes-transition" leave-active-class="animated fadeOutLeft" enter-active-class="animated fadeInRight">
      <div class="wrapper">
        <div class="container" :style="backgroundStyle">
          <div class="swiper">
            <!-- <Swiper :list="swiperList" :dots-position="swiperDotsPosition" :height="swiperHeight" :loop="swiperLoop"/> -->
          </div>
          <div class="start" @click="jump">
            <span>开启财富之旅</span>
            <span class="go">
              <icon name="right" :w="50" :h="24" ></icon>
            </span>
          </div>
        </div>
      </div>
  </transition>
</template>

<script>
import { Swiper } from 'vux'
import router from '../router'
export default {
  name: 'Home',
  data () {
    return {
      backgroundStyle: {
        background: 'url('+require('../assets/login/hand.png')+')',
        backgroundSize:'100%',
        backgroundRepeat:'no-repeat',
        backgroundPosition:'bottom'
      },
      swiperLoop: true,
      swiperHeight: '362px',
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
    Swiper,
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
  .container{
    width:100%;
    height:100%;
  }
  .swiper{
    width:225px;
    position: absolute;
    bottom:104px;
    left:60px;
  }
  .start{
    position:absolute;
    bottom:85%;
    left:120px;
    font-size:26px;
  }
  .go{
    animation: change 2s infinite linear;
  }
  @keyframes change{
    0% {opacity:1}
    50% {opacity:0}
    100% {opacity:1}
  }
</style>
