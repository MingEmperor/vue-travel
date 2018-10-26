import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store/index.js'
import VueAwesomeSwiper from 'vue-awesome-swiper'
import './assets/styles/border.css'
import './assets/styles/reset.css'
import './assets/styles/iconfont.css'
import 'swiper/dist/css/swiper.css'

Vue.config.productionTip = false
Vue.use(VueAwesomeSwiper)

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
