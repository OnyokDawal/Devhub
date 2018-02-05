package co.devpartners.devhub.expandable.adapter

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import co.devpartners.devhub.R
import kotlinx.android.synthetic.main.list_group.view.*
import kotlinx.android.synthetic.main.list_item.view.*
import android.widget.TextView




/**
 * Created by Dev_03 on 2/5/2018.
 */
class ListAdapter: BaseExpandableListAdapter {
    private var context: Context
    private var listDataHeader: List<String>
    private var listHashMap: HashMap<String,List<String>>

    constructor(context: Context, listDataHeader: List<String>, listHashMap: HashMap<String, List<String>>) : super() {
        this.context = context
        this.listDataHeader = listDataHeader
        this.listHashMap = listHashMap
    }

    override fun getGroup(i: Int): Any? {
       return listDataHeader.get(i)
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(int: Int, boolean: Boolean, view: View?, viewGroup: ViewGroup?): View? {

        val headerTitle = getGroup(int) as String
        val view = LayoutInflater.from(context).inflate(R.layout.list_group,null)

        val listHeader = view!!.findViewById<TextView>(R.id.ListHeader) as TextView
        listHeader.setTypeface(null, Typeface.BOLD)
        listHeader.setText(headerTitle)
        return view

    }

    override fun getChildrenCount(int: Int): Int {
        return listHashMap.get(listDataHeader.get(int))!!.size
    }

    override fun getChild(int: Int, int1: Int): Any? {
        return listHashMap.get(listDataHeader.get(int))!!.get(int1)
    }

    override fun getGroupId(int: Int): Long {
        return int.toLong()
    }

    override fun getChildView(int: Int, int1: Int, boolean: Boolean, view: View?, viewGroup: ViewGroup?): View? {
        val childText = getChild(int, int1) as String
        val view = LayoutInflater.from(context).inflate(R.layout.list_group,null)

        val listHeader = view!!.findViewById<TextView>(R.id.ListHeader) as TextView
        listHeader.setText(childText)
        return view

    }

    override fun getChildId(int: Int, int1: Int): Long {
        return int1.toLong()
    }

    override fun getGroupCount(): Int {
        return listDataHeader.size
    }
}


