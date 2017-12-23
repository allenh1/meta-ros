# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospilot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native curl dnsmasq ffmpeg gdal-bin geometry-msgs hostapd libgphoto-dev libmicrohttpd libnl-3 libnl-3-dev libturbojpeg mapnik-utils mavlink message-generation message-runtime npm opencv3 osm2pgsql postgresql-9.x-postgis python-cherrypy python-colorama python-mapnik python-psutil python-serial python-tilestache rosbash rosbridge-suite roscpp roslaunch roslint rospy sensor-msgs std-msgs std-srvs unzip vision-opencv"
SRC_URI = "https://github.com/${PN}/${PN}-release/archive/release/kinetic/${PN}/1.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1288a89b9a3e352c6983f28b9a921c2"
SRC_URI[sha256sum] = "c235df5f2595cd4ede8cf244280513a60716429cd00a9513a3050ed43ec3d0c5"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.4.0-0"

inherit catkin
