# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

DEPENDS = "ar-track-alvar-msgs catkin-native cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport message-generation message-runtime pcl-conversions pcl-ros resource-retriever roscpp rospy sensor-msgs std-msgs tf tf2 libtinyxml visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/lunar/ar_track_alvar/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "312e5236aa915958300193c05670cee8"
SRC_URI[sha256sum] = "d2700ee96bcf3a7fcdc90ed098e8724cd1a01bf3ec973782f3c8ee7d5294b9b2"
S = "${WORKDIR}/ar_track_alvar-release-release-lunar-ar_track_alvar-0.7.1-0"

inherit catkin
