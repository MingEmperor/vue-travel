<template>
    <div>
        <div class="banner" @click="handleBannerClick">
            <img class="banner-img" src="//img1.qunarzz.com/sight/p0/1409/19/adca619faaab0898245dc4ec482b5722.jpg_600x330_f922b488.jpg" />
            <div class="banner-info">
                <div class="banner-tittle">
                   大连圣亚海洋世界（AAAA景区）
                </div>
                <div class="banner-number banner-icon">
                    <span class="iconfont">&#xe692;</span>
                    39
                </div>
            </div>
        </div>
        <fade-animation>
           <common-gallary 
               :imgs="imgs" 
               v-show="showGallary"
               @close="handleBannerClose"
            ></common-gallary>
        </fade-animation>   
    </div>
</template>

<script>
import CommonGallary from './../../../common/gallary/Gallary'
import FadeAnimation from './../../../common/fade/FadeAnimation'
export default{
    name: 'DetailBanner',
    data () {
        return{
            showGallary:false,
            imgs:['http://img1.qunarzz.com/sight/p0/1508/89/895a1b7add84f23faca053ce9e3153db.water.jpg_350x240_5291130a.jpg','http://img1.qunarzz.com/sight/p0/1501/ab/ab02fceb3fa0a60e.water.jpg_350x240_e7f0f154.jpg']
        }
    },
    methods: {
        handleBannerClick () {
            this.showGallary = true;
        },
        handleBannerClose () {
            this.showGallary = false;
        }
    },
    components: {
        CommonGallary,
        FadeAnimation
    }
}
</script>

<style scoped>
 .banner{
    position:relative;
    overflow: hidden;
    height:0;
    padding-bottom:55%;
 }
 .banner-img{
    width: 100%;
 }
 .banner-info{
    display:flex;
    position:absolute;
    left:0;
    right:0;
    bottom:0;
    line-height:.6rem;
    color: #fff;
    background-image: linear-gradient(top, rgba(0, 0, 0, 0),
    rgba(0, 0, 0, .8));
 }
 .banner-tittle{
    flex:1;
    font-size:.32rem;
    padding: 0 .2rem;
 }
 .banner-number{
    height:.4rem;
    line-height:.4rem;
    margin-top:.14rem;
    padding:0 .4rem;
    border-radius:.2rem;
    background:rgba(0,0,0,.8);
    font-size:.24rem; 
 }
 .banner-icon{
    font-size:.24rem;
 }
</style>