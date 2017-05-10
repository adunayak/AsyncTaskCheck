package com.compassites.asynctaskcheck;

import android.os.AsyncTask;

class FileDownloader extends AsyncTask<Void, Void, Void> {

    private MainActivity activity;

    public FileDownloader(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        activity.showProgress(0);
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        activity.showProgress(100);
    }
}