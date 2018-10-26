<template>
    <div class="header">
        <div class="hearer-left">
            <div class="iconfont leftIcon">&#xe659;</div>
        </div>
        <div class="hearer-input">
            <span class="iconfont inputIcon-plus">&#xe634;</span>
            哥，不要输入任何内容
        </div>
        <router-link to='/city'>
        <div class="hearer-right">
            {{this.doubleCity}}
            <span class="iconfont arrowIcon">&#xe64a;</span>
        </div>
       </router-link>
    </div>
</template>
<script>
import { mapState, mapGetters } from 'vuex'
export default {
    name: 'HomeHeader',
    computed: {
      ...mapState(['city'])  ,
      ...mapGetters(['doubleCity']) 
    }
}
</script>
<style scoped>
.header {
    display: flex;
    line-height: .86rem;
    background-color: #DD2222;
    color: #fff;
}

.hearer-left {
    width: .64rem;
    float: left;
}

.hearer-input {
    flex: 1;
    height: .64rem;
    margin-top: .12rem;
    margin-left: .2rem;
    line-height: .64rem;
    background: #fff;
    border-radius: .1rem;
    color: #ccc;

}

.hearer-right {
    min-width: 1.04rem;
    padding:0 .1rem;
    float: right;
    text-align: center;
    color: #fff;
}

.inputIcon-plus {
    font-weight: bold;
    color: #caa;
}

.leftIcon {
    text-align: center;
    font-size: .4rem;
}

.arrowIcon {
    margin-left: -.04rem;
    font-size: .24rem !important;
}
</style>