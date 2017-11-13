# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a9a72c186797ff98a79f90205c589abf"

DEPENDS = "binutils catkin-native libqt5-svg-dev qtbase5-dev ros-type-introspection rosbag rosbag-storage roscpp roscpp-serialization rostime topic-tools"
SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/lunar/plotjuggler/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b33ae018477a0c67c5a96102f64a588c"
SRC_URI[sha256sum] = "2eddf80ab4dbf5ed30fa680799e50120ffef0cf24a592ae9158271e27930b3ad"
S = "${WORKDIR}/plotjuggler-release-release-lunar-plotjuggler-1.3.0-0"

inherit catkin
