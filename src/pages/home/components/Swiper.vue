<template>
    <div class="wrapper">
        <swiper :options="swiperOption" v-if="showSwiper" class="myswiper">
            <swiper-slide v-for="item of list" :key="item.id">
                <img class="swiper-img" :src="item.imgUrl" />
            </swiper-slide>
                <div class="swiper-pagination" slot="pagination"></div>
        </swiper>
    </div>
</template>
<script>
export default {
    name: 'HomeSwiper',
    props: {
        list:Array
    },
    data() {
        return {
            swiperOption: {
                autoplay: 4000,
                initialSlide: 1,
                pagination: '.swiper-pagination',
                loop: true
            }
        }
    },
    computed: {
        showSwiper () {
            return this.list.length
        }
    }
}
</script>
<style scoped> 
.myswiper >>> .swiper-pagination-bullet-active {
    background:#fff !important;
}

.wrapper {
    position:relative;
    width: 100%;
    height: 0;
    overflow: hidden;
    padding-bottom: 37%;
    background: #eee;
}

.swiper-img {
    width: 100%;
}
.swiper-pagination {
   position:absolute;
   top:60%;
}
</style>