<template>

    <div>
        <div class="detail-title">
        Email
        </div>
        <v-col>
            <String label="Address" v-model="value.address" :editMode="editMode"/>
            <String label="Subject" v-model="value.subject" :editMode="editMode"/>
            <String label="Content" v-model="value.content" :editMode="editMode"/>
        </v-col>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </div>
</template>

<script>
import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Email',
    mixins:[BaseEntity],
    components:{
    },
    data: () => ({
        path: 'Email',
    }),
    props: {
    },
    watch: {
        value(val){
            this.value = val;
            this.change();
        },
    },
    async created(){
        if (this.value && this.value.id !== undefined) {
            this.value = await this.repository.findById(this.value.id)
        }
    },
    methods: {
        pick(val){
            this.value = val;
            this.change();
        },
    }
}
</script>

