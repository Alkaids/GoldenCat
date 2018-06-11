// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import 'lib-flexible/flexible'
import 'reset-css'
import './animate.css'
import Icon from 'vue2-svg-icon/Icon.vue'

const FastClick = require('fastclick')

Vue.config.productionTip = false
Vue.prototype.$axios = axios
Vue.component('icon', Icon)
FastClick.attach(document.body)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
