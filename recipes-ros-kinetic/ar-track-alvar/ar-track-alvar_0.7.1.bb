# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

DEPENDS = "ar-track-alvar-msgs catkin-native cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport message-generation message-runtime pcl-conversions pcl-ros resource-retriever roscpp rospy sensor-msgs std-msgs tf tf2 libtinyxml visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/kinetic/ar_track_alvar/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0f79ff06fbd0309b6efedc2eb559a32"
SRC_URI[sha256sum] = "38e265750e11ad3c7d0306220ad502490449d7a20fe8c43fc318499fef10d6c2"
S = "${WORKDIR}/ar_track_alvar-release-release-kinetic-ar_track_alvar-0.7.1-0"

inherit catkin
