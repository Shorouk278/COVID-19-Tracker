package iti.intake40.covidtracker.ui.main


import android.content.Intent
import android.os.Bundle
<<<<<<< HEAD
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
=======
import android.view.View
import android.widget.SearchView
import android.widget.Toast
>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import iti.intake40.covidtracker.R
<<<<<<< HEAD
import iti.intake40.covidtracker.WorkerNotification
import java.util.concurrent.TimeUnit


class CovidActivity : AppCompatActivity() {

    private lateinit var covidViewModel: CovidViewModel
    lateinit var recyclerView: RecyclerView
=======
import iti.intake40.covidtracker.db.model.CovidModel
import iti.intake40.covidtracker.network.Network
import kotlinx.android.synthetic.main.activity_covid.*


class CovidActivity : AppCompatActivity() {
    private lateinit var covidViewModel: CovidViewModel
   // lateinit var searchView: SearchView
    // lateinit var covidViewModel:CovidViewModel
   // var dataList = ArrayList<CovidModel>()
    lateinit var recyclerView: RecyclerView

   // var adapter = CovidAdapter(dataList , this)
>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
=======
        //searchView = findViewById(R.id.search_view)
>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829

        setContentView(R.layout.activity_covid)
        recyclerView = findViewById(R.id.recycle_view)
        covidViewModel = ViewModelProvider(this).get(CovidViewModel::class.java)
<<<<<<< HEAD
        covidViewModel.getData()
=======

       if (!Network.checkNetworkState(applicationContext)){
           search_view.setVisibility(View.GONE)
           Toast.makeText(applicationContext,"افتح النت ي حلوووووووووووف", Toast.LENGTH_SHORT).show()


       }else{




>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829
        covidViewModel.alldata.observe(this, Observer { covids ->

            // Update the cached copy of the words in the adapter.
            covids?.let {
<<<<<<< HEAD
                recyclerView.adapter = CovidAdapter(it, this)
                recyclerView.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            }
        })

    }

=======

                recyclerView.adapter = CovidAdapter(it as MutableList<CovidModel>, this)

                recyclerView.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                  search(search_view, CovidAdapter(it, this))



            }
        })}



        // recyclerView.adapter?.notifyDataSetChanged()
        //getData()
>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

<<<<<<< HEAD
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == R.id.action_one) {
            val intent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(intent)
        }
            return true
        }



=======
    private fun search(searchView: SearchView, adapter: CovidAdapter) {

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(s: String): Boolean {
                return false
            }

            override fun onQueryTextChange(s: String): Boolean {
                adapter.getFilter().filter(s)
                //println(s)
                return true
            }
        })
    }

>>>>>>> b4675089745adbf96f573e3ec0bdbb6a8c7ce829
}




