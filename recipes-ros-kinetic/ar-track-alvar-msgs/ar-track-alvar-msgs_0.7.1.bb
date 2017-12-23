# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ar_track_alvar-release/archive/release/kinetic/ar_track_alvar_msgs/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc4a30e870be6c3c7dbbe97e832b6429"
SRC_URI[sha256sum] = "cfe0747bf3863120aa14df24c1983677446a90db3021d5ac1dd7c8d7b396a6e0"
S = "${WORKDIR}/ar_track_alvar-release-release-kinetic-ar_track_alvar_msgs-0.7.1-0"

inherit catkin
