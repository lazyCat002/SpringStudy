import axios from '../axios'

export const save = (data) =>{
    return axios({url:'user/save',method:'post',data})
}